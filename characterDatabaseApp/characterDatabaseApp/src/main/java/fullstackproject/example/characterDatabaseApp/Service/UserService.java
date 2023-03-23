package fullstackproject.example.characterDatabaseApp.Service;

import fullstackproject.example.characterDatabaseApp.Entity.User;

import java.util.List;

public interface UserService {


    List<User> getAllUsers();
    User getUserByID(int userID);

    User addUser(User user);

    User updateUser(User user);

    String deleteUserByID(int userID);

    String login(String username, String userPassword);




}
