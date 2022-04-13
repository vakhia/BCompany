package Interfaces;

public interface ISupplier extends IPerson {
    String BuyMaterials(int money);
    String Transport(String position,int quantityOfMaterials);
}
