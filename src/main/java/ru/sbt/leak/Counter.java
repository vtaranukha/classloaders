package ru.sbt.leak;

/**
 * Created by Home on 29.06.2018.
 */
public class Counter implements ICounter {
    private int counter;
    private ILeak leak;

    private static final long[] cache = new long[10000000];

    public String message() {
        return "Version 1";
    }

    public int plusPlus() {
        return counter++;
    }

    public int counter() {
        return counter;
    }

    public ILeak leak() {
        return new Leak( leak );
    }

    public ICounter copy( ICounter other ) {
        if ( other != null ) {
            counter = other.counter();
            leak = other.leak();
        }
        return this;
    }
}
