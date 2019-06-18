package answers;

import lombok.Data;

@Data
public class LimitedEdition extends Album {

    private String vinylColor = "multi-colored marble";

    public LimitedEdition(){
    }

    @Override
    public String printInfo() {
        return String.format("'%s' was released as a limited edition on %s vinyl", this.getTitle(), this.vinylColor);
    }
}
