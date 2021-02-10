package ZdobadzAddress.Service;

import ZdobadzAddress.Model.User;

import java.util.Scanner;

public class UserService {
    //Service ( stworz Klase wypełniającą informacje o uzytkowniku oraz o jego adresie ( mozesz wpisywac na sztywno), zwróć usera i adres
    public User addNewUser() {
        Scanner sc = new Scanner(System.in);
        User user = new User();

        System.out.println("Add new User. Write name: ");
        user.setName(sc.next());
        System.out.println(" Write surname: ");
        user.setSurname(sc.next());

        return user;
    }

}
