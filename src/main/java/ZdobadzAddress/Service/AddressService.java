package ZdobadzAddress.Service;

import ZdobadzAddress.Model.Address;

import java.util.Scanner;

public class AddressService {
    public Address addNewAddress() {
        Scanner sc = new Scanner(System.in);
        Address address = new Address();

        System.out.println("Add new Address. Write City: ");
        address.setCity(sc.next());

        System.out.println(" Write street: ");
        address.setStreet(sc.next());

        System.out.println(" Write street no: ");
        address.setNo(sc.nextInt());

        return address;
    }
}
