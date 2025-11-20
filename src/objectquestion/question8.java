//Create a class Movie with name, rating, and releaseYear. Create 5 movie objects and display
//movies released after 2020
package objectquestion;
class Movie {
    String name;
    double rating;
    int releaseYear;

    // Constructor
    Movie(String name, double rating, int releaseYear) {
        this.name = name;
        this.rating = rating;
        this.releaseYear = releaseYear;
    }

    // Method to display movie details
    void display() {
        System.out.println("Name: " + name + ", Rating: " + rating + ", Year: " + releaseYear);
    }
}

public class question8{
    public static void main(String[] args) {
        // Creating 5 movie objects
        Movie m1 = new Movie("Inception", 8.8, 2010);
        Movie m2 = new Movie("Avengers: Endgame", 8.4, 2019);
        Movie m3 = new Movie("Dune", 8.1, 2021);
        Movie m4 = new Movie("The Batman", 7.9, 2022);
        Movie m5 = new Movie("Oppenheimer", 8.6, 2023);

        // Array of movies
        Movie[] movies = {m1, m2, m3, m4, m5};

        System.out.println("Movies released after 2020:");
        for (Movie m : movies) {
            if (m.releaseYear > 2020) {
                m.display();
            }
        }
    }
}