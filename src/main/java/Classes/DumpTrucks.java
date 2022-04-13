package Classes;

import Interfaces.IDumpTrucks;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Date;
import java.util.List;

public final class DumpTrucks extends Machinery implements IDumpTrucks {
    private static final Logger logger = LogManager.getLogger(DumpTrucks.class);
    private List<Material> materials;

    public DumpTrucks() {
    }

    public DumpTrucks(String title, int power, int fuel_capacity, Date dateOfCreating, Material material) {
        super(title, power, fuel_capacity, dateOfCreating);
        this.materials.add(material);
    }

    public List<Material> getMaterials() {
        return materials;
    }

    public void setMaterials(Material material) {
        this.materials.add(material);
    }

    @Override
    public String toString() {
        logger.info("DumpTrucks = materials" + materials);
        return "Dump_Trucks =" + "materials=" + materials;
    }

    @Override
    public String Transport() {
        logger.info("transporting material");
        return "Transporting materials...";
    }
}
