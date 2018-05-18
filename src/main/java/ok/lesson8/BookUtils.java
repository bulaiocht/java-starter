package ok.lesson8;


public class BookUtils implements BookGenre {

    private String genre;
    private String language;
    private String country;
    private String author;

    public String getGenre() {
        return genre;
    }

    public String getLanguage() {
        return language;
    }

    public String getCountry() {
        return country;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String bookGenre() {

        if (author.equals("William Shakespeare"))
            genre = "Drama, Comedy";
        else if (author.equals("Dante Alighieri"))
            genre = "Philosophy, Drama";
        else
            genre = "Science fiction";

        return genre;
    }

    @Override
    public void setCountryByLanguage() {

        if (language.equals("English"))
            country = "Great Britain";
        else if (language.equals("Italian"))
            country = "Italy";
        else
            country = "France";
    }


    @Override
    public String language(String language) {
        return this.language = language;
    }

    @Override
    public String author(String author) {
        return this.author = author;
    }

    @Override
    public void setAuthorsByCountry() {
        if (country.equals("Great Britain"))
            author("William Shakespeare");
        else if (country.equals("Italy"))
            author("Dante Alighieri");
        else
            author("Bernard Werber");
    }
}
