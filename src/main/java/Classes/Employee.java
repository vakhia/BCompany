package Classes;

import Exceptions.InvalidNumberException;
import Interfaces.IEmployee;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Employee extends Person implements IEmployee {
    private static final Logger logger = LogManager.getLogger(Employee.class);
    private int salary;

    public Employee() {
    }

    public Employee(String firstName, String lastName, int age, int salary) {
        super(firstName, lastName, age);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) throws InvalidNumberException {
        if (salary > 0) {
            this.salary = salary;
        } else {
            throw new InvalidNumberException("Salary cannot be null!");
        }
    }

    @Override
    public String toString() {
        logger.info("Employee = salary"+salary);
        return "Employee = " +
                "salary=" + salary;
    }

    @Override
    public String Work() {
        logger.info("Working...");
        return "Working...";
    }
}
