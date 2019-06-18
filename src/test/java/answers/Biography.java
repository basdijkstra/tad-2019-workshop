package answers;

import lombok.Data;

@Data
public class Biography extends Book {

    private String subject = "Frodo Baggins";

    public String describeMe() {
        return String.format("'%s' chronicles the life of %s", this.getTitle(), this.getSubject());
    }
}
