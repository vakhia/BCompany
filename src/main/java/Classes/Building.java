package Classes;

import Enums.BuildingTypes;
import Interfaces.IBuilding;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

public class Building extends Area implements IBuilding {
    private static final Logger logger = LogManager.getLogger(Builder.class);
    protected int height;
    private BuildingTypes type;

    public Building() {
    }

    public Building(int width, int length, int price, int height, BuildingTypes type) {
        super(width, length, price);
        this.height = height;
        this.price = price;
        this.type = type;
    }

    public int getHeight() {
        return height;
    }

    public BuildingTypes getType() {
        return type;
    }

    public int getPrice() {
        return price;
    }

    public int Volume() {
        return (this.width * this.length * this.height);
    }

    public boolean Build(BuildingEngineer building_engineer, List<Builder> builders, List<Material> materials, Foreman foreman, List<Crane> cranes, List<DumpTrucks> dump_trucks) {
        return building_engineer.CheckBlueprint();
    }

    @Override
    public String toString() {
        logger.info("Building = " +
                "width =" + width +
                ", length =" + length +
                ", price =" + price +
                ", height =" + height +
                ", type='" + type + '\'');

        return "Building = " +
                "width =" + width +
                ", length =" + length +
                ", price =" + price +
                ", height =" + height +
                ", type='" + type + '\'';
    }

}
