package org.utarid.lambda;

public class Person {
    String name;
    int birthYear;

    public Person(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    public String createPass() {
        return name + birthYear;
    }
}
