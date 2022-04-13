package Classes;

import Interfaces.IMaterial;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public final class Material implements IMaterial {
    private static final Logger logger = LogManager.getLogger(Material.class);
    protected int quantity;
    protected int pricePerEach;
    protected String type;

    public Material() {
    }

    public Material(int quantity, int pricePerEach, String type) {
        this.quantity = quantity;
        this.pricePerEach = pricePerEach;
        this.type = type;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPricePerEach() {
        return pricePerEach;
    }

    public void setPricePerEach(int pricePerEach) {
        this.pricePerEach = pricePerEach;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        logger.info("Material = " +
                "quantity =" + quantity +
                ", pricePerEach =" + pricePerEach +
                ", type ='" + type);
        return "Material = " +
                "quantity =" + quantity +
                ", pricePerEach =" + pricePerEach +
                ", type ='" + type;
    }

    @Override
    public int TotalPrice() {
        return this.quantity * this.pricePerEach;
    }
}
