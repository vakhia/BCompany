package Classes;

import Exceptions.InvalidDataException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class Person {
    private static final Logger logger = LogManager.getLogger(Person.class);
    private String firstName;
    private String lastName;
    private int age;


    public Person() {
    }

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) throws InvalidDataException {
        if (firstName.length() > 0) {
            this.firstName = firstName;
        } else {
            throw new InvalidDataException("First name cannot be null");
        }
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) throws InvalidDataException {
        if (lastName.length() > 0) {
            this.lastName = lastName;
        } else {
            throw new InvalidDataException("Last name cannot be null");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws InvalidDataException {
        if (age > 0) {
            this.age = age;
        } else {
            throw new InvalidDataException("Age cannot be null!");
        }
    }

    @Override
    public String toString() {
        logger.info("Person =" +
                "firstName ='" + firstName + '\'' +
                ", lastName ='" + lastName + '\'' +
                ", age =" + age);
        return "Person =" +
                "firstName ='" + firstName + '\'' +
                ", lastName ='" + lastName + '\'' +
                ", age =" + age;
    }
}
