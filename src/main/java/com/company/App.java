package com.company;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Animal animal = context.getBean("myAnimal", Cat.class);
        animal.animalPlus();
        animal.animalMinus();

        ClassPathXmlApplicationContext context1 = new ClassPathXmlApplicationContext("applicationContext.xml");
        Cat cat = context1.getBean("Cat", Cat.class);
        System.out.println(cat.getName() + " " + cat.getAge() + " ");
        System.out.println(cat.getBreed() + " " + cat.getColor());

        ClassPathXmlApplicationContext context3 = new ClassPathXmlApplicationContext("applicationContext.xml");
        Person person = context3.getBean("Person", Person.class);
        System.out.println(person.getName() + " " + person.getAge());

    }
}
