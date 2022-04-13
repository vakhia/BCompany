package Classes;

import Exceptions.InvalidNumberException;
import Interfaces.ICrane;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Date;

public final class Crane extends Machinery implements ICrane {
    private static final Logger logger = LogManager.getLogger(Crane.class);
    private int carrying_capacity;

    public Crane(String title, int power, int fuel_capacity, Date dateOfCreating, int carrying_capacity) {
        super(title, power, fuel_capacity, dateOfCreating);
        this.carrying_capacity = carrying_capacity;
    }

    public Crane() {
    }

    public int getCarrying_capacity() {
        return carrying_capacity;
    }

    public void setCarrying_capacity(int carrying_capacity) throws InvalidNumberException {
        if (carrying_capacity > 0) {
            this.carrying_capacity = carrying_capacity;
        } else {
            throw new InvalidNumberException("Carrying capacity cannot be null!");
        }
    }

    @Override
    public String toString() {
        return "Crane =" + "carrying_capacity=" + carrying_capacity;
    }

    @Override
    public String Lift() {
        return "Lifting materials...";
    }
}
