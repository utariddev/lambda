package org.utarid.lambda;

@FunctionalInterface
public interface Hello {
    //    void saySomething(Person person);
//    void saySomething(String something);
//    int getArea(Square person);

    String getPersonPass(Person person);

//    default void saySomething2(String something) {
//        System.out.println("saySomething2 : " + something);
//    }
}
