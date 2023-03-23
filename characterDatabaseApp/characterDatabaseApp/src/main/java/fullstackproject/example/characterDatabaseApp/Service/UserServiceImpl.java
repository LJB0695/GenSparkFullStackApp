package fullstackproject.example.characterDatabaseApp.Service;

import fullstackproject.example.characterDatabaseApp.Dao.UserDao;
import fullstackproject.example.characterDatabaseApp.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    private User user;

    @Override
    public List<User> getAllUsers() {
        return this.userDao.findAll();
    }

    @Override
    public User getUserByID(int userID) {
        Optional<User> u = this.userDao.findById(userID);
        User user = null;
        if(u.isPresent()){
            user = u.get();
        } else {
            throw new RuntimeException("There is no user found for id: " + userID);
        }
        return user;
    }

    @Override
    public User addUser(User user) {
        return this.userDao.save(user);
    }

    @Override
    public User updateUser(User user) {
        return this.userDao.save(user);
    }

    @Override
    public String deleteUserByID(int userID) {

                this.userDao.deleteById(userID);
                return "User deleted successfully.";


    }

    @Override
    public String login(String userName, String userPassword) {
         this.userDao.equals(userName);
         this.userDao.equals(userPassword);
        return "login was successful";
    }
}
