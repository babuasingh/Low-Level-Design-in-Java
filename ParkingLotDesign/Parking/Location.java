package ParkingLotDesign.Parking;

public class Location {

    private String country;
    private String state;
    private String address;
    private int pincode;
    
    public Location(){}
    
    public Location(String country, String state, String address, int pincode) {
        this.country = country;
        this.state = state;
        this.address = address;
        this.pincode = pincode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }

    

}
