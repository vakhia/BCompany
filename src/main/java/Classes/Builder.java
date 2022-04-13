package Classes;

import Exceptions.InvalidNumberException;
import Interfaces.IBuilder;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.Date;

public final class Builder extends Employee implements IBuilder {
    private int workExperience;
    private static final Logger logger = LogManager.getLogger(Builder.class);

    public Builder() {
    }


    public Builder(String firstName, String lastName, int age, int salary, int workExperience) {
        super(firstName, lastName, age, salary);
        this.workExperience = workExperience;
    }

    public int getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(int workExperience) throws InvalidNumberException {
        if (workExperience > (-1)) {
            this.workExperience = workExperience;
        } else {
            throw new InvalidNumberException("Work experience cannot be null!");
        }
    }

    public double ComputeSalary(Building building) {
        return ((building.getPrice() * (this.workExperience / 100)) + 10000);
    }

    @Override
    public String toString() {
        logger.info("Builder = workExperience" +workExperience);
        return "Builder =" +
                "workExperience=" + workExperience;
    }

    public static String Build() {
        logger.info("Building...");
        return "Building...";
    }

    @Override
    public String Rest(Date date) {
        logger.info("Resting for"+date);
        return "Resting for" + date;
    }

    @Override
    public String Сarry(String position, String materials) {
        logger.info("Carriyng "+materials+" to"+position);
        return "Carriyng " + materials + " to" + position;
    }

    @Override
    public int ReceiveSalary() {
        logger.info(this.getSalary());
        return this.getSalary();
    }

}
