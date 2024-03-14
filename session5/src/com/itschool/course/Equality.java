package com.itschool.course;

public class Equality {

    public static void main(String[] args) {
        int a = 2;
        int b = 2;

        boolean isEqual = a == b;
        System.out.println(isEqual);

        String x = "ionutz";
        String y = "ionutz";

        System.out.println(x == y);

        String aName = new String("ionutz");
        String anotherName = new String("ionutz");
        System.out.println("Printing String hashes ");
        System.out.println(aName.hashCode());
        System.out.println(anotherName.hashCode());

        System.out.println(aName == anotherName);
        System.out.println(aName.equals(anotherName));

        System.out.println("Comparing persons: ");
        comparePerson();
    }

    static void comparePerson(){
       // Person person1 = new Person("ionutz", 19273L);
        //Person person2 = new Person("ionutz", 19303L);

        //System.out.println(person1.equals(person2));
    }
}
