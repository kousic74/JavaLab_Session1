public class Book {
    private String title;
    private String author;
    private double price;

        public Book() {
        this("Unknown Title", "Unknown Author", 0.0);
    }

        public Book(String title, String author) {
        this(title, author, 0.0);
    }

        public Book(String title, String author, double price) {
        // 'this' differentiates class fields and parameters
        this.title = title;
        this.author = author;
        this.price = price;
    }

    
    public void printDetails() {
        System.out.println("Title: " + this.title);
        System.out.println("Author: " + this.author);
        System.out.println("Price: " + this.price);
    }
}
