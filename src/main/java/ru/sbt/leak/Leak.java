package ru.sbt.leak;

/**
 * Created by Home on 29.06.2018.
 */
public class Leak implements ILeak {
    private ILeak leak;

    public Leak( ILeak leak ) {
        this.leak = leak;
    }
}
