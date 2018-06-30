package ru.sbt.example;

/**
 * Created by Home on 29.06.2018.
 */
public class Test {
    public static void main(String... args) {
        Parent child = new Child();

        System.out.println( "f1: " + child.getSomeField1() );
        System.out.println( "f2: " + child.getSomeField2() );
        ClassLoader

    }
}

//java -verbose:class -cp target/classloaders-1.0-SNAPSHOT.jar ru.sbt.example.Test
