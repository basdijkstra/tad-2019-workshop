package exercises;

import lombok.Data;

@Data
public class Book {

    private String title = "Lord of the Rings";
    private String author = "J.R.R. Tolkien";

    public Book() {
    }

    public String printInfo() {
        return String.format("'%s' is written by %s", this.title, this.author);
    }
}
