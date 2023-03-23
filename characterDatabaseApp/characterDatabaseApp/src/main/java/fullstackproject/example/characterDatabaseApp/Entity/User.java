package fullstackproject.example.characterDatabaseApp.Entity;

import fullstackproject.example.characterDatabaseApp.EntityC.CharacterEntity;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tbl_users")
public class User {
    @Id
    @Column(name = "u_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int userID;
    private String userName;
    private String userEmail;
    private String userPassword;
    private boolean isAdmin;
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "user", cascade = CascadeType.ALL)
    private List<CharacterEntity> characterList;

    public User() {

    }

    public User(String userName, String userEmail, String userPassword, boolean isAdmin, List<CharacterEntity> characterList) {
        this.userName = userName;
        this.userEmail = userEmail;
        this.userPassword = userPassword;
        this.isAdmin = isAdmin;
        this.characterList = characterList;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }

    public List<CharacterEntity> getCharacterList() {
        return characterList;
    }

    public void setCharacterList(List<CharacterEntity> characterList) {
        this.characterList = characterList;
    }
}
