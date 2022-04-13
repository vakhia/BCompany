package Classes;

import Exceptions.InvalidDataException;
import Exceptions.InvalidNumberException;
import Interfaces.IMachinery;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Date;

public abstract class Machinery implements IMachinery {
    private static final Logger logger = LogManager.getLogger(Machinery.class);
    private String title;
    private int power;
    private int fuelCapacity;
    private Date dateOfCreating;

    public Machinery() {
    }

    public Machinery(String title, int power, int fuelCapacity, Date dateOfCreating) {
        this.title = title;
        this.power = power;
        this.fuelCapacity = fuelCapacity;
        this.dateOfCreating = dateOfCreating;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) throws InvalidDataException {
        if (title.length() > 0) {
            this.title = title;
        } else {
            throw new InvalidDataException("Title cannot be null!");
        }
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) throws InvalidNumberException {
        if (power > 0) {
            this.power = power;
        } else {
            throw new InvalidNumberException("Power cannot be nulL!");
        }
    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(int fuelCapacity) {
        if (fuelCapacity > 0) {
            this.fuelCapacity = fuelCapacity;
        } else {
            throw new IllegalArgumentException("Fuel capacity cannot be null!");
        }
    }

    public Date getDateOfCreating() {
        return dateOfCreating;
    }

    public void setDateOfCreating(Date dateOfCreating) {
        if (dateOfCreating != null) {
            this.dateOfCreating = dateOfCreating;
        } else {
            throw new IllegalArgumentException("Date of creation cannot be null!");
        }
    }

    @Override
    public String toString() {
        logger.info("Machinery = " +
                "title ='" + title + '\'' +
                ", power =" + power +
                ", fuelCapacity =" + fuelCapacity +
                ", dateOfCreating =" + dateOfCreating);
        return "Machinery = " +
                "title ='" + title + '\'' +
                ", power =" + power +
                ", fuelCapacity =" + fuelCapacity +
                ", dateOfCreating =" + dateOfCreating;
    }

    @Override
    public String Ride() {
        logger.info("Riding...");
        return "Riding...";
    }
}
