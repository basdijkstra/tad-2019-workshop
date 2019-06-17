package examples;

public class Address {

    private String street = "Test Street";
    private int houseNumber = 1;
    private int zipCode = 12345;
    private String city = "Test City";

    public Address() {
    }

    public String getStreet() { return this.street; }

    public int getHouseNumber() { return this.houseNumber; }

    public int getZipCode() { return this.zipCode; }

    public String getCity() { return this.city; }

    public void setStreet(String street) { this.street = street; }

    public void setHouseNumber(int houseNumber) { this.houseNumber = houseNumber; }

    public void setZipCode(int zipCode) { this.zipCode = zipCode; }

    public void setCity(String city) { this.city = city; }
}
