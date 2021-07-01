package facci.pm.mymapapp.model;

public class Address {

    private String country;
    private String city;
    private Double longitude;
    private Double latitude;

    public Address(double longitude, double latitude){
        this.longitude = longitude;
        this.latitude = latitude;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    public Double getLongitude() {
        return longitude;
    }

    public Double getLatitude() {
        return latitude;
    }
}
