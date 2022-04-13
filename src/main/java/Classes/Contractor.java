package Classes;

import Interfaces.IContractor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public final class Contractor extends Employee implements IContractor {
    private static final Logger logger = LogManager.getLogger(Contractor.class);
    private boolean sealStamp;

    public Contractor() {
    }

    public Contractor(String firstName, String lastName, int age, int price, boolean sealStamp) {
        super(firstName, lastName, age, price);
        this.sealStamp = sealStamp;
    }

    public boolean isSealStamp() {
        return sealStamp;
    }

    public void setSealStamp(boolean sealStamp) {
        this.sealStamp = sealStamp;
    }

    @Override
    public String toString() {
        logger.info("Contractor = sealStamp"+sealStamp);
        return "Contractor = " +
                "sealStamp=" + sealStamp;
    }

    @Override
    public boolean Sign() {
        return true;
    }
}
