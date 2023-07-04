package Task2.com.company.entities;

import Task2.com.company.details.Engine;
import Task2.com.company.professions.Driver;

public class Person {
    private String fullName;
    private int age;
    private char sex;    // f - female, m - male
    private long phoneNumber;

    public Person(String fullName, int age, char sex, long phoneNumber) {
        this.age = age;
        this.fullName = fullName;
        this.sex = sex;
        this.phoneNumber = phoneNumber;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public char getSex() {
        return sex;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }
}
