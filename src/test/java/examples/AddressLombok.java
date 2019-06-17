package examples;

import lombok.Data;

@Data
public class AddressLombok {

    private String street = "Test Street";
    private int houseNumber = 1;
    private int zipCode = 12345;
    private String city = "Test City";

    public AddressLombok() {
    }
}
