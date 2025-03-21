package Rbu;

class Book {
    private String title;
    private String author;
    private double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.printf("Price: $%.2f%n", price);
    }
}

class Ebook extends Book {
    private double fileSizeMB;

    public Ebook(String title, String author, double price, double fileSizeMB) {
        super(title, author, price);
        this.fileSizeMB = fileSizeMB;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("File Size: " + fileSizeMB + " MB");
    }
}

class PrintedBook extends Book {
    private int numPages;

    public PrintedBook(String title, String author, double price, int numPages) {
        super(title, author, price);
        this.numPages = numPages;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Number of Pages: " + numPages);
    }
}

class Main {
    public static void main(String[] args) {
        Ebook ebook = new Ebook("Digital Java", "John Doe", 29.99, 5.6);
        PrintedBook printedBook = new PrintedBook("Java Basics", "Jane Smith", 39.99, 300);

        ebook.displayDetails();
        System.out.println();
        printedBook.displayDetails();
    }
}
