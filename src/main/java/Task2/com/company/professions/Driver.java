package Task2.com.company.professions;

import Task2.com.company.entities.Person;

public class Driver extends Person {
   private int yearsExperience;

    Driver(String fullName, int age, char sex, long phoneNumber, int yearsExperience) {
        super(fullName, age, sex, phoneNumber);
        this.yearsExperience = yearsExperience;
    }
    public int getYearsExperience(){
        return yearsExperience;
    }
}
