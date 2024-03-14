package com.itschool.course;

public class Course5PersonDemo {

    public static void main(String[] args) {
        Person patricia = new Person();
        Person gabriel = new Person();
        Person maria = new Person();

        System.out.println(patricia.getFirstName());
        System.out.println(patricia.getAge());
        System.out.println(patricia.getCnp());

        patricia.setFirstName("Patricia");
        patricia.setAge(23);
        patricia.setCnp(19000L);

        System.out.println("Results after setting properties");
        System.out.println(patricia.getFirstName());

        System.out.println(patricia.getAge());
        System.out.println(patricia.getCnp());

        String patriciaFirstName = patricia.getFirstName();
        System.out.println(patriciaFirstName);
    }
}
