package ZdobadzAddress;

/*
W ramach zadania masz stworzyc klasy posiadającą w sobie informacje o użytkowniku i jego addressie
następnie napisać Serwis wypełniający go twoimi danymi
i wywołac wszytko za pomocą kontrolera w Klasie Main

Model ( stworz 2 Klasy User i Address) w klasie User  pola: imie i nazwisko, oraz address, w klasie address: ulica, numer domu, miasto
Service ( stworz Klase wypełniającą informacje o uzytkowniku oraz o jego adresie ( mozesz wpisywac na sztywno)
Controller ( stworz Klase posiadajaca parametr Servisowy i wywolujacą metode z tego serwisu).
 */

import ZdobadzAddress.Controller.Controller;
import ZdobadzAddress.Model.User;

public class Main {
    public static void main(String[] args){
        Controller controller = new Controller();
        User newUser = controller.addNewData();
        System.out.println("Stworzylam uzytkownika:");
        System.out.println(newUser.getName());
        System.out.println(newUser.getSurname());
        System.out.println("Mieszka w:");
        System.out.println(newUser.getAddress().getCity());
        System.out.println(newUser.getAddress().getStreet());
        System.out.println(newUser.getAddress().getNo());
    }

}
