package exercises;

import lombok.Data;

@Data
public class Album {

    private String title = "Sunday 8 PM";
    private String artist = "Faithless";
    private int releasedIn = 1998;

    public Album() {
    }

    public String printInfo() {
        return String.format("The %s album titled '%s' was released in %d", this.artist, this.title, this.releasedIn);
    }
}
