package Entities;

public class ImportedProduct extends Product {

    // Classe customsFee que herda produtos
    // Possui o preço cu
    private Double customsFee;
    // Construtor da classe filha
    public ImportedProduct(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }
    // Sobrescrita do método para retornar um "toString" com tais especificações para a classe nova
    @Override
    public String priceTag() {
        return String.format("%s $ %.2f (Customs fee: $%.2f)", getName(), getPrice(), customsFee);
    }
    // Get & Set de customsFee 
    public Double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }
}
