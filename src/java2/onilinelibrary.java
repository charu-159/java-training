
        //you have to implement a library using java class library
        //method:issuebook,returnbook,showavailabale book
        //properties:array strore the available book
        //array to store the issied boo
    package java2;

        class Library {
            // Properties: arrays to store books
            String[] availableBooks;
            String[] issuedBooks;
            int availableCount;
            int issuedCount;

            // Constructor
            Library(int size) {
                availableBooks = new String[size];
                issuedBooks = new String[size];
                availableCount = 0;
                issuedCount = 0;
            }

            // Add a book to available list
            public void addBook(String book) {
                availableBooks[availableCount] = book;
                availableCount++;
            }

            // Show all available books
            public void showAvailableBooks() {
                System.out.println("Available Books:");
                for (int i = 0; i < availableCount; i++) {
                    System.out.println((i + 1) + ". " + availableBooks[i]);
                }
            }

            // Issue a book
            public void issueBook(String book) {
                boolean found = false;
                for (int i = 0; i < availableCount; i++) {
                    if (availableBooks[i].equalsIgnoreCase(book)) {
                        issuedBooks[issuedCount] = book;
                        issuedCount++;

                        // Shift remaining books left
                        for (int j = i; j < availableCount - 1; j++) {
                            availableBooks[j] = availableBooks[j + 1];
                        }
                        availableCount--;
                        found = true;
                        System.out.println("Book issued: " + book);
                        break;
                    }
                }
                if (!found) {
                    System.out.println("Book not available: " + book);
                }
            }

            // Return a book
            public void returnBook(String book) {
                boolean found = false;
                for (int i = 0; i < issuedCount; i++) {
                    if (issuedBooks[i].equalsIgnoreCase(book)) {
                        availableBooks[availableCount] = book;
                        availableCount++;

                        // Shift issued books left
                        for (int j = i; j < issuedCount - 1; j++) {
                            issuedBooks[j] = issuedBooks[j + 1];
                        }
                        issuedCount--;
                        found = true;
                        System.out.println("Book returned: " + book);
                        break;
                    }
                }
                if (!found) {
                    System.out.println("This book was not issued: " + book);
                }
            }
        }

        public class onilinelibrary {
            public static void main(String[] args) {
                Library lib = new Library(10);

                // Add some books
                lib.addBook("Java Programming");
                lib.addBook("Data Structures");
                lib.addBook("Operating Systems");

                // Show available books
                lib.showAvailableBooks();

                // Issue a book
                lib.issueBook("Java Programming");

                // Show available books again
                lib.showAvailableBooks();

                // Return a book
                lib.returnBook("Java Programming");

                // Show available books again
                lib.showAvailableBooks();
            }
        }