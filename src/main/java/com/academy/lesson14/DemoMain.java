package com.academy.lesson14;

import com.academy.lesson13.person.CustomPersonSortByAge;
import com.academy.lesson13.person.Person;

import java.util.*;

public class DemoMain {
    public static void main(String[] args) {
        personExr();
    }

    private static void personExr() {
        Person[] personArr = new Person[10];
        fillPersonsRandom(personArr);
        System.out.println(Arrays.toString(personArr));
        List<Person> personList = new ArrayList<>(Arrays.asList(personArr));
        for (int i = 0 ;i <personList.size();i++){
            System.out.println(personList.get(i));
            Map<Long , Person> personMap = new HashMap<>();
            for (Person person: personList){
                personMap.put(person.getId(),person);
            }
            for (Map.Entry<Long,Person> entry : personMap.entrySet()){
                System.out.println("ID: " + entry.getKey());
                System.out.println("Person: " + entry.getValue());
            }

            personList.sort(new CustomPersonSortByAge());
            System.out.println(personList);

            personList.sort(Comparator.comparing(Person::getName));
            for (Person p: personList){
                if (p.getAge()> 20 && p.getAge() < 50){
                    System.out.println(p);
                }
            }

            }

        }


    private static void fillPersonsRandom(Person[] personArr) {
        String[] names = {"Peter", "Helen", "Andry", "Abdel", "Kate", "Veronica", "Leonid", "Alex", "Max"};
        final int ageFrom = 10;
        final int ageTo = 90;
        long id = 123456;

        for (int i = 0; i < personArr.length; i++) {
            id++;
            int nameIndex = (int) (Math.random() * names.length);
            String name = names[nameIndex];
            int age = ageFrom + (int) (Math.random() * (ageTo - ageFrom));
            personArr[i] = new Person(id, name, age);
        }
    }
}