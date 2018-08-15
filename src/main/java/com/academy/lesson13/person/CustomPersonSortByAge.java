package com.academy.lesson13.person;

import java.util.Comparator;

public class CustomPersonSortByAge implements Comparator<Person> {

        @Override
        public int compare(Person p1, Person p2) {
            return Long.compare(p2.getAge(), p1.getAge());
        }
    }

