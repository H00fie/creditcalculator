package credit.calculator.service;

import credit.calculator.model.User;

import java.util.ArrayList;
import java.util.List;

@org.springframework.stereotype.Service
public class Service {


    List<User> usersListCommon = new ArrayList<User>();

    public List<User> getUsersListCommon() {
        return usersListCommon;
    }

    public void setUsersListCommon(List<User> usersListCommon) {
        this.usersListCommon = usersListCommon;
    }


}
