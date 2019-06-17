package examples;

import lombok.Data;

@Data
public class AddressLombok {

    private String street;
    private int houseNumber;
    private int zipCode;
    private String city;

    public AddressLombok(String street, int houseNumber, int zipCode, String city) {

        this.street = street;
        this.houseNumber = houseNumber;
        this.zipCode = zipCode;
        this.city = city;
    }
}
