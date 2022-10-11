package Task2.com.company.entities;

import Task2.com.company.details.Engine;
import Task2.com.company.professions.Driver;

public class Person {
    String fullName;
    int age;
    char sex;    // f - female, m - male
    long phoneNumber;

    protected Person(String fullName, int age, char sex, long phoneNumber) {
        this.age = age;
        this.fullName = fullName;
        this.sex = sex;
        this.phoneNumber = phoneNumber;
    }
}
