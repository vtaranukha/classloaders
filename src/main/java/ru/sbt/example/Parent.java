package ru.sbt.example;

/**
 * Created by Home on 29.06.2018.
 */
public abstract class Parent {
    protected static String someField1 = "I'm parent";
    protected static String someField2;

    static {
        System.out.println( "in Parent" );
        someField2 = "I'm parent too";
    }

    public abstract String getSomeField1();

    public abstract String getSomeField2();
}
