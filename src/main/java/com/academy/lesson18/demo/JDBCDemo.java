package com.academy.lesson18.demo;

import com.academy.lesson18.dao.AbonentDao;
import com.academy.lesson18.dao.impl.jdbc.AbonentDaoImpl;
import com.academy.lesson18.model.Abonent;
import com.academy.lesson18.model.Gender;

public class JDBCDemo {
        public static void main(String[] args) {
            demoInsertAbonent();
            demoReadAbonents();
        }

        private static void demoInsertAbonent() {
            AbonentDao abonentDao = new AbonentDaoImpl();
            Abonent abonent = new Abonent();
            abonent.setFirstName("Вася");
            abonent.setLastName("Петров");
            abonent.setAge(33);
            abonent.setGender(Gender.MALE);
            abonentDao.save(abonent);
        }

        private static void demoReadAbonents() {
            AbonentDao abonentDao = new AbonentDaoImpl();
            abonentDao.getAll().stream()
                    .forEach(System.out::println);
        }
}
