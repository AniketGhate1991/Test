package ImageHoster.service;

import ImageHoster.model.User;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.mvc.method.annotation.RequestResponseBodyMethodProcessor;

@Service
public class UserService {

    //We are not currently storing the details of the user anywhere
    //We will be storing the user details in the Database & ORMs part
    public void registerUser(User newUser) {
        return;
    }

    public User Cummulative(){
        User obj = new User();
        return obj;

    }

}
