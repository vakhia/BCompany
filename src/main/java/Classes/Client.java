package Classes;

import Exceptions.InvalidNumberException;
import Interfaces.IClient;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public final class Client extends Person implements IClient {
    private static final Logger logger = LogManager.getLogger(Client.class);
    private int moneyForBuilding;


    public Client() {

    }

    public Client(String firstName, String lastName, int age, int moneyForBuilding) {
        super(firstName, lastName, age);
        this.moneyForBuilding = moneyForBuilding;
    }

    public int getMoneyForBuilding() {
        return moneyForBuilding;
    }

    public void setMoneyForBuilding(int moneyForBuilding) throws InvalidNumberException {
        if (moneyForBuilding > 0) {
            this.moneyForBuilding = moneyForBuilding;
        } else {
            throw new InvalidNumberException("Money cannot be null!");
        }
    }

    @Override
    public String toString() {
        logger.info("Client = money :"+moneyForBuilding);
        return "Client = " +
                "moneyForBuilding=" + moneyForBuilding;
    }

    @Override
    public boolean Pay() {
        return true;
    }

    public static boolean Evaluate() {
        return true;
    }
}
