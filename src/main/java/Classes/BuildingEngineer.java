package Classes;

import Interfaces.IBuildingEngineer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public final class BuildingEngineer extends Employee implements IBuildingEngineer {
    private static final Logger logger = LogManager.getLogger(BuildingEngineer.class);
    private Blueprint blueprint;
    private Building building;


    public BuildingEngineer() {

    }

    public BuildingEngineer(String firstName, String lastName, int age, int price, Blueprint blueprint, Building building) {
        super(firstName, lastName, age, price);
        this.blueprint = blueprint;
        this.building = building;
    }

    public Blueprint getBlueprint() {
        return blueprint;
    }

    public Building getBuilding() {
        return building;
    }

    @Override
    public String toString() {
        logger.info("building_engineer = blueprint:"+blueprint+", building"+building);
        return "Building_Engineer =" +
                "blueprint =" + blueprint +
                ", building =" + building +
                '}';
    }

    @Override
    public boolean CheckBlueprint() {
        return blueprint.Volume() == building.Volume();
    }
}
