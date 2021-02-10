package ZdobadzAddress.Model;

public class User {
   // User  pola: imie i nazwisko, oraz address, w klasie address: ulica, numer domu, miasto
    private String name;
    private String surname;
    private Address address;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

}
