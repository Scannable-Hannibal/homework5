import javax.swing.*;
import java.util.Scanner;

public class ProductTester {

    public static void main(String[] args) {

        // 1.7 make six Product objects // 4.2 Adding Vendor object
        Vendor v1 = new Vendor("Universal Music Group", "2220 Colorado Avenue in Santa Monica, California", "John Doe", "555-4530-1234");
        Product p1 = new Product(0001, "CD", 15, 14.99, v1);
        Product p2 = new Product(0002, "DVD", 10, 29.99, v1);
        Product p3 = new Product(0003, "Vinyl record", 5,1000, v1);
        Product p4 = new Product(0004, "Cassette tape", 30, 5.95, v1);
        Product p5 = new Product(0005, "Headphone", 10, 99, v1);
        Product p6 = new Product(0006, "Record player", 3, 159, v1);

        //1.8 display the product number, the name of the product, the number of units in stock, and the price of each unit.
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        System.out.println(p5);
        System.out.println(p6);

        //3.1 add scanner
        Scanner scan = new Scanner(System.in);

        // 3.1 user data into Product object
        System.out.println("Enter product number.");
        int productNumber = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter product name.");
        String productName = scan.nextLine();
        System.out.println("Enter number of units in stock.");
        int unitsInStock = scan.nextInt();
        System.out.println("Enter product price.");
        double price = scan.nextDouble();
        scan.close();

        Product p7 = new Product(productNumber, productName, unitsInStock, price, v1);
        System.out.println(p7);

        // 3.2 Modify ProductTester so the application can handle multiple items using an array. Print out the array.
        // Not sure what this mean.Kas nad tahavad, et teeksin nimekirja ja meetodi või klassi konstruktori, mis nimekirja põhjal looks mitu klassi?
        // Do they want me to make an array of class objects?
        // Or a method or class constructor to process an array of input strings to generate a an array of Product class objects?

        // Vendor toString
        System.out.println(v1);

        // Subclass
        DVD d1 = new DVD(0002, "DVD", 10, 29.99, v1, "No Title");
        d1.setTitle("The Sugar Story");
        System.out.println(d1.getTitle());
        System.out.println(d1.inventoryPrice());
        System.out.println(d1);
    }
}
