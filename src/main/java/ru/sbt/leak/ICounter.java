package ru.sbt.leak;

/**
 * Created by Home on 29.06.2018.
 */
public interface ICounter {
    String message();

    int plusPlus();

    int counter();

    ILeak leak();

    ICounter copy( ICounter other );
}