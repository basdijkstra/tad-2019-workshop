package examples;

public class InternationalAddress extends Address {

    private String country = "Test Country";

    public InternationalAddress() {
    }

    public String printCityAndCountryForAddress() {

        return String.format("%s, %s", this.getCity(), this.getCountry());
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
