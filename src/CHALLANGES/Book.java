package CHALLANGES;

class Book {
    static int totalNoofbooks;

    String author;

    String title;

    String isbn;


    boolean isBorrowed;

    static {
        totalNoofbooks = 0;
    }
    {
        totalNoofbooks++;
    }

    Book(String isbn, String title, String author) {
        // constructor body

        this.isbn = isbn;

        this.title = title;

        this.author = author;

    }
        Book(String isbn ) {
            this(isbn, "unknown", "unknown");
        }
        static int gettotlNoofbooks(){
        return totalNoofbooks;
        }

        void borrowedbook(){
            if(isBorrowed){
            System.out.println("Book is already borrowed");
            }else{
            this.isBorrowed = true;
            System.out.println("Enjoy" + " " + this.title);
            }

        }
        void returnbook(){
            if(isBorrowed){
                this.isBorrowed = false;
                System.out.println("Hope youy enjoyed, please leave a review");
            }else{
                System.out.println("This book is already in the library");
            }

        }

    public static void main(String[] args) {
        Book desigbnofthings = new Book("1", "Design", "Author");
        Book myBook = new Book("2");
        System.out.println(Book.gettotlNoofbooks());
        desigbnofthings.borrowedbook();
        myBook.borrowedbook();
        desigbnofthings.borrowedbook();
        desigbnofthings.returnbook();
        desigbnofthings.returnbook();

    }
}
