package Classes;

import Exceptions.InvalidNumberException;
import Interfaces.IForeman;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public final class Foreman extends Employee implements IForeman {
    private static final Logger logger = LogManager.getLogger(Foreman.class);
    private int numberOfTeam;

    public Foreman() {
    }

    public Foreman(String firstName, String lastName, int age, int salary, int numberOfTeam) {
        super(firstName, lastName, age, salary);
        this.numberOfTeam = numberOfTeam;
    }

    public int getNumberOfTeam() {
        return numberOfTeam;
    }

    public void setNumberOfTeam(int numberOfTeam) throws InvalidNumberException {
        if (numberOfTeam > 0) {
            this.numberOfTeam = numberOfTeam;
        } else {
            throw new InvalidNumberException("Number of team cannot be null!");
        }
    }

    @Override
    public String toString() {
        logger.info("Foreman = numberOfTeam"+numberOfTeam);
        return "Foreman = " +
                "numberOfTeam=" + numberOfTeam;
    }


    @Override
    public String Hire() {
        logger.info("Foreman hired 100 workers");
        return "Foreman hired 100 workers";
    }
}
