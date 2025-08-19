public class Main {
    public static void main(String[] args) {
        // Using default constructor
        Book b1 = new Book();

               Book b2 = new Book("Clean Code", "Robert C. Martin");

        
        Book b3 = new Book("Effective Java", "Joshua Bloch", 799.0);

                System.out.println("--- Book 1 ---");
        b1.printDetails();

        System.out.println("\n--- Book 2 ---");
        b2.printDetails();

        System.out.println("\n--- Book 3 ---");
        b3.printDetails();
    }
}
