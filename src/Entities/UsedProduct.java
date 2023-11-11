package Entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class UsedProduct extends Product {

    // Classe de produtos usados
    // Classe usedProduct além de herdar produtos ela cria uma data e consequentemente uma formatação para esta data no formato do brasil
    public static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private LocalDate date;
    // Construtor da classe
    public UsedProduct(String name, Double price, LocalDate date) {
        super(name, price);
        this.date = date;
    }
    // Sobrescrita do método da classe mãe com um "toString" mais especificado para a classe já que ocorre a adição de uma data
    @Override
    public String priceTag() {
        return String.format("%s (used) $ %.2f (Manufacture date: %s)", getName(), getPrice(), dtf.format(date));
    }
    // Métodos get e set de data
    public LocalDate getDate() {
        return date;
    }
    public void setDate(LocalDate date) {
        this.date = date;
    }
}
