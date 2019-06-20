package exercises;

import lombok.Data;

@Data
public class Biography {

    private String subject = "Frodo Baggins";

    public String describeMe() {
        return String.format("'<INSERT BIOGRAPHY TITLE HERE>' chronicles the life of %s", this.getSubject());
    }
}
