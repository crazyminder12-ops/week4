import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<Product> products = new ArrayList<>();

    public static void main(String[] args) {

        int choice;

        do {
            System.out.println("\n=== GROCERY STORE ===");
            System.out.println("1. Add Product");
            System.out.println("2. Add Fresh Product");
            System.out.println("3. Add Packaged Product");
            System.out.println("4. View All Products");
            System.out.println("5. Polymorphism Demo");
            System.out.println("6. View Fresh Only");
            System.out.println("0. Exit");
            System.out.print("Choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> addProduct();
                case 2 -> addFresh();
                case 3 -> addPackaged();
                case 4 -> viewAll();
                case 5 -> polymorphismDemo();
                case 6 -> viewFreshOnly();
            }

        } while (choice != 0);
    }

    static void addProduct() {
        System.out.print("ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Price: ");
        double price = sc.nextDouble();
        System.out.print("Quantity: ");
        int qty = sc.nextInt();

        products.add(new Product(id, name, price, qty));
    }

    static void addFresh() {
        System.out.print("ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Price: ");
        double price = sc.nextDouble();
        System.out.print("Quantity: ");
        int qty = sc.nextInt();
        System.out.print("Days to expire: ");
        int days = sc.nextInt();

        Product p = new FreshProduct(id, name, price, qty, days);
        products.add(p);
    }

    static void addPackaged() {
        System.out.print("ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Price: ");
        double price = sc.nextDouble();
        System.out.print("Quantity: ");
        int qty = sc.nextInt();
        sc.nextLine();
        System.out.print("Brand: ");
        String brand = sc.nextLine();

        Product p = new PackagedProduct(id, name, price, qty, brand);
        products.add(p);
    }

    static void viewAll() {
        for (Product p : products) {
            System.out.println(p);
            p.showInfo(); // полиморфизм
        }
    }

    static void polymorphismDemo() {
        System.out.println("=== SAME METHOD, DIFFERENT BEHAVIOR ===");
        for (Product p : products) {
            p.showInfo();
        }
    }

    static void viewFreshOnly() {
        for (Product p : products) {
            if (p instanceof FreshProduct) {
                FreshProduct fp = (FreshProduct) p;
                System.out.println(fp + " | expires in " + fp.getDaysToExpire());
            }
        }
    }
}
