package ZdobadzAddress.Model;

public class Address {
    //User  pola: imie i nazwisko, oraz address, w klasie address: ulica, numer domu, miasto
    private int no;
    private String street;
    private String city;

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }



}
