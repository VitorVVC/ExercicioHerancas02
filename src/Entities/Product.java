package Entities;

public class Product {

    // Classe mãe produto
    // Atributos nome e preço
    private String name;
    private Double price;
    // Construtor
    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }
    // Método priceTag para retornar um "toString" com tais especificações de print
    public String priceTag() {
        return String.format("%s $ " + " %.2f", getName(), getPrice());
    }
    // Métodos Getters e setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }
}
