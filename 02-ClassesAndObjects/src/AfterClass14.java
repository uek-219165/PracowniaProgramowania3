import java.awt.print.Book;

public class AfterClass14 {

    static class Books {
        String bookName;
        String author;
        String category;
        String releseDate;
        double price;

        public Books(String bookName, String author, String category, String releseDate, double price) {
            this.bookName = bookName;
            this.author = author;
            this.category = category;
            this.releseDate = releseDate;
            this.price = price;
        }

        void showBookDetails() {
            System.out.println("Tytuł: " + bookName + " | Autor: " + author + " | Kategoria: " + category + " | Data Wydania: " + releseDate + " | Cena: " + price + " zł");
        }

        public String getBookName() {
            return bookName;
        }

        public String getAuthor() {
            return author;
        }
    }


    public static void main(String[] args) {
        Books bookOne = new Books("Prawy umysł", "Jonathan Haidt", "Psychologia", "22.10.2014", 28.75);
        Books bookTwo = new Books("Psychologia Pieniędzy", "Morgan Housel", "Kariera i sukcess", "19.05.2021", 27.93);

        bookOne.showBookDetails();
        bookTwo.showBookDetails();

    }
}
