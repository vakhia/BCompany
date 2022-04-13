package Classes;

import Exceptions.InvalidDataException;
import Interfaces.ISupplier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public final class Supplier extends Person implements ISupplier {
    private static final Logger logger = LogManager.getLogger(Supplier.class);
    private Material material;

    public Supplier() {
    }

    public Supplier(String firstName, String lastName, int age, Material material) {
        super(firstName, lastName, age);
        this.material = material;

    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public void Supply(Storage storage) throws InvalidDataException {
        storage.setMaterials(this.material);
    }

    @Override
    public String toString() {
        logger.info("Supplier = material " + material);
        return "Supplier = " +
                "material =" + material;
    }

    @Override
    public String BuyMaterials(int money) {
        logger.info("Money for materials" + money);
        return "Money for materials" + money;
    }

    @Override
    public String Transport(String position, int quantityOfMaterials) {
        return "Supplier transporting " + quantityOfMaterials + " of materials to" + position;
    }
}
