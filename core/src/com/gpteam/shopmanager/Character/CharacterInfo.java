package com.gpteam.shopmanager.Character;

import com.gpteam.shopmanager.Engine.Modules.ErrorHandler.ErrorHandler;
import com.gpteam.shopmanager.Player.Sex;
import com.gpteam.shopmanager.RandomGenerator.RandGen;

import static com.gpteam.shopmanager.Variables.Variables.*;

/*
 * Created by masmix on 04.02.2017.
 */
public class CharacterInfo {
    private String name;
    private int age;
    private Sex sex;

    public CharacterInfo(String name, int age, Sex sex) {
        if (validate(name, age, sex))
            assign(name, age, sex);
        else
            ErrorHandler.handleIllegalArgumentException("One of the arguments was invalid. Found: name: " + name + ", age: " + age + ", sex: " + sex.toString());
    }

    public CharacterInfo() {
        initialize();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (validate(name))
            this.name = name;
        else
            ErrorHandler.handleIllegalArgumentException("Name must contain at least 2 characters, up to 25. Found: " + name.length());
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (validate(age))
            this.age = age;
        else
            ErrorHandler.handleIllegalArgumentException("Age must be at least 12 and no higher than 120. Found: " + age);
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        if (validate(sex))
            this.sex = sex;
        else
            ErrorHandler.handleIllegalArgumentException("Sex must be either male or female. Found: " + sex.toString());
    }

    private void initialize() {
        RandGen randGen = new RandGen();
        name = randGen.getRandomName();
        age = randGen.getRandomAge();
        sex = randGen.getRandomSex();
    }

    private void validateAndAssign(String name, int age, Sex sex) {
        if (validate(name, age, sex))
            assign(name, age, sex);
        else
            ErrorHandler.handleIllegalArgumentException("One of the arguments was invalid. Found: name: " + name + ", age: " + age + ", sex: " + sex.toString());
    }

    private void assign(String name, int age, Sex sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    private boolean validate(String name, int age, Sex sex) {
        return validate(name) && validate(age) && validate(sex);
    }

    private boolean validate(String name) {
        return name.length() < MAX_NAME_LENGTH && name.length() > MIN_NAME_LENGTH;

    }

    private boolean validate(int age) {
        return age <= MAX_AGE_LENGTH && age >= MIN_AGE_LENGTH;
    }

    private boolean validate(Sex sex) {
        return sex.equals(Sex.MALE) || sex.equals(Sex.FEMALE);
    }
}
