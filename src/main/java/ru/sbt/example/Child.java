package ru.sbt.example;

/**
 * Created by Home on 29.06.2018.
 */
public class Child extends Parent {
    static {
        System.out.println( "in Child" );
        someField1 = "I'm child";
        someField2 = "I'm child too";
    }

    @Override
    public String getSomeField1() {
        return someField1;
    }

    @Override
    public String getSomeField2() {
        return someField2;
    }
}
