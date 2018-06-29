package ru.sbt.leak;

import java.net.MalformedURLException;

/**
 * Created by Home on 29.06.2018.
 */
public class Main {
    private static ICounter counter1;
    private static ICounter counter2;

    public static void main( String[] args ) throws IllegalAccessException, InstantiationException, ClassNotFoundException, InterruptedException, MalformedURLException {
        counter1 = CounterFactory.newInstance();
        while ( true ) {
            counter2 = CounterFactory.newInstance().copy( counter2 );
            System.out.println( "1) " + counter1.message() + " = " + counter1.plusPlus() );
            System.out.println( "2) " + counter2.message() + " = " + counter2.plusPlus() );
            System.out.println();
            Thread.currentThread().sleep( 3000 );
        }
    }
}
