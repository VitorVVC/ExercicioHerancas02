package Application;

import Entities.ImportedProduct;
import Entities.Product;
import Entities.UsedProduct;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import static Entities.UsedProduct.dtf;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Product> list = new ArrayList<>();
        System.out.print("Enter the number of products: ");
        int quantidade = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < quantidade; i++) {
            System.out.println("Product #" + (i + 1) + " data");
            System.out.print("Common, used or imported (c/u/i) ? ");
            Character resp = sc.next().charAt(0);
            sc.nextLine();
            while (true) {
                System.out.print("Name: ");
                String name = sc.nextLine();
                System.out.print("Price: ");
                Double price = sc.nextDouble();
                if (resp.equals('c') || resp.equals('C')) {
                    Product product = new Product(name, price);
                    list.add(product);
                    sc.nextLine();
                    break;
                } else if (resp.equals('i') || resp.equals('I')) {
                    System.out.print("Customs fee: ");
                    Double customsFee = sc.nextDouble();
                    Product importedProduct = new ImportedProduct(name, price, customsFee);
                    list.add(importedProduct);
                    break;
                } else if (resp.equals('u') || resp.equals('U')) {
                    System.out.print("Manufacture date (DD/MM/YYYY): ");
                    sc.nextLine();
                    LocalDate localDate = LocalDate.parse(sc.nextLine(), dtf);
                    Product usedProduct = new UsedProduct(name, price, localDate);
                    list.add(usedProduct);
                    break;
                } else {
                    System.out.print("Erro no reconhecimento da escolha, digite novamente (c/u/i): ");
                    resp = sc.next().charAt(0);
                }
            }
        }
        System.out.println("PRICE TAGS: ");
        for (Product printList : list) {
            System.out.println(printList.priceTag());
        }
    }
}