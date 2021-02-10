package ZdobadzAddress.Controller;

import ZdobadzAddress.Model.Address;
import ZdobadzAddress.Model.User;
import ZdobadzAddress.Service.AddressService;
import ZdobadzAddress.Service.UserService;

public class Controller {

    UserService userService = new UserService();
    AddressService addressService = new AddressService();

    public User addNewData(){
        User newUser = userService.addNewUser();

        Address newAddress = addressService.addNewAddress();
        newUser.setAddress(newAddress);
        return newUser;
    }
}
