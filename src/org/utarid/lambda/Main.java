package org.utarid.lambda;

public class Main {

    public static void testHello(Hello hello) {
        Person person = new Person("Hasan", 1960);
        System.out.println("pass " + hello.getPersonPass(person));
    }

    public static void main(String[] args) {

        //lambda kullanılmadığı durum
        testHello(new Hello() {
            @Override
            public String getPersonPass(Person person) {
                return person.name + person.birthYear;
            }
        });

        //lambda kullanıldığı durum
        testHello(person -> person.name + person.birthYear);


        //lambda kullanılmadığı durum
        Person person1 = new Person("Ali", 1980);
        Hello hello1 = new Hello() {
            @Override
            public String getPersonPass(Person person) {
                return person.createPass();
            }
        };
        System.out.println("pass: " + hello1.getPersonPass(person1));

        //lambda kullanıldığı durum
        Person person2 = new Person("Mehmet", 1970);
        Hello hello2 = person -> person.createPass();
        System.out.println("pass: " + hello2.getPersonPass(person2));

        //lambda + method reference kullanıldığı durum
        Person person3 = new Person("Murat", 1990);
        Hello hello3 = Person::createPass;
        System.out.println("pass: " + hello3.getPersonPass(person3));
    }
}
