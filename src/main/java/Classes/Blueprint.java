package Classes;

import Exceptions.InvalidNumberException;
import Interfaces.IBlueprint;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public final class Blueprint implements IBlueprint {
    private static final Logger logger = LogManager.getLogger(Blueprint.class);
    private int widthOfBuilding;
    private int lengthOfBuilding;
    private int heightOfBuilding;

    public Blueprint() {

    }

    public Blueprint(int widthOfBuilding, int lengthOfBuilding, int heightOfBuilding) {
        this.widthOfBuilding = widthOfBuilding;
        this.lengthOfBuilding = lengthOfBuilding;
        this.heightOfBuilding = heightOfBuilding;
    }

    public int getWidthOfBuilding() {
        return widthOfBuilding;
    }

    public void setWidthOfBuilding(int widthOfBuilding) throws InvalidNumberException {
        if (widthOfBuilding > 0) {
            this.widthOfBuilding = widthOfBuilding;
        } else {
            throw new InvalidNumberException("Width cannot be null!");
        }
    }

    public int getLengthOfBuilding() {
        return lengthOfBuilding;
    }

    public void setLengthOfBuilding(int lengthOfBuilding) throws InvalidNumberException {
        if (lengthOfBuilding > 0) {
            this.lengthOfBuilding = lengthOfBuilding;
        } else {
            throw new InvalidNumberException("Length cannot be null!");
        }
    }

    public int getHeightOfBuilding() {
        return heightOfBuilding;
    }

    public void setHeightOfBuilding(int heightOfBuilding) throws InvalidNumberException {
        if (heightOfBuilding > 0) {
            this.heightOfBuilding = heightOfBuilding;
        } else {
            throw new InvalidNumberException("Height cannot be null!");
        }
    }

    @Override
    public String toString() {
        logger.info("blueprint = "+"width "+widthOfBuilding+" length "+lengthOfBuilding+" height "+heightOfBuilding);
        return "Blueprint = " +
                "width of building =" + widthOfBuilding +
                ", length of building =" + lengthOfBuilding +
                ", height of building =" + heightOfBuilding;
    }

    @Override
    public double Volume() {
        return this.heightOfBuilding * this.widthOfBuilding * this.lengthOfBuilding;
    }
}
