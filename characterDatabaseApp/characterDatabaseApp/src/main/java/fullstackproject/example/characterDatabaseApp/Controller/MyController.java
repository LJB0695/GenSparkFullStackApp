package fullstackproject.example.characterDatabaseApp.Controller;

import fullstackproject.example.characterDatabaseApp.Entity.User;
import fullstackproject.example.characterDatabaseApp.EntityC.CharacterEntity;
import fullstackproject.example.characterDatabaseApp.Service.UserService;
import fullstackproject.example.characterDatabaseApp.ServiceC.CharacterService;
import org.aspectj.lang.annotation.DeclareWarning;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyController {
    @Autowired
    private UserService userService;
    @Autowired
    private CharacterService characterService;
    private User user;

    @GetMapping("/")
    public String home()
    {
        return "<HTML><H1>Welcome to the character database application.</H1></HTML>";
    }
    @GetMapping("/users")
    public List<User> getUsers()
    {
        return this.userService.getAllUsers();
    }
    @GetMapping("/users/{userID}")
    public User getUser(@PathVariable String userID){
        return this.userService.getUserByID(Integer.parseInt(userID));
    }
    @PostMapping ("/login")
    public String login(@RequestBody String userName, String userPassword){
       return this.userService.login(userName, userPassword);

    }
    @PostMapping("/users")
    public User addUser(@RequestBody User user) {
        return this.userService.addUser(user);
    }
    @PutMapping("/users")
    public User updateUser(@RequestBody User user) {
        return this.userService.updateUser(user);
    }
    @DeleteMapping("/users/{userID}")
    public String deleteUser(@PathVariable String userID) {
        return this.userService.deleteUserByID(Integer.parseInt(userID));
    }
    @GetMapping("/characters")
    public List<CharacterEntity> getCharacters(){
        return this.characterService.getAllCharacters();
    }
    @GetMapping("/characters/{characterID}")
    public CharacterEntity getCharacter(@PathVariable String characterID) {
        return this.characterService.getCharacterByID(Integer.parseInt(characterID));
    }
    @PostMapping("/characters")
    public CharacterEntity addCharacter(@RequestBody CharacterEntity characterEntity){
        return this.characterService.addCharacter(characterEntity);
    }
    @PutMapping("/characters")
    public CharacterEntity updateCharacter(@RequestBody CharacterEntity characterEntity){
        return this.characterService.updateCharacter(characterEntity);
    }

    @GetMapping("/login")
    public String login(){
        return "login.html";
    }
}
