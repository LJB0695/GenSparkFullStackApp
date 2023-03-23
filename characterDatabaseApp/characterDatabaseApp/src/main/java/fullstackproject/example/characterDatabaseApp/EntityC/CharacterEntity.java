package fullstackproject.example.characterDatabaseApp.EntityC;

import com.fasterxml.jackson.databind.ObjectMapper;
import fullstackproject.example.characterDatabaseApp.Entity.User;
import jakarta.persistence.*;

@Entity
@Table(name = "tbl_characters")
public class CharacterEntity {
    @Id
    @Column(name = "c_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int characterID;
    private String characterName;
    private String shortName;
    private String characterDesc;
    private String age;
    private String gender;
    private String species;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "u_id")
    private User user;

    public CharacterEntity(){}

    public CharacterEntity(String characterName, String shortName, String characterDesc, String age, String gender, String species, User user) {
        this.characterName = characterName;
        this.shortName = shortName;
        this.characterDesc = characterDesc;
        this.age = age;
        this.gender = gender;
        this.species = species;
        this.user = user;
    }

    public int getCharacterID() {
        return characterID;
    }

    public void setCharacterID(int characterID) {
        this.characterID = characterID;
    }

    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getCharacterDesc() {
        return characterDesc;
    }

    public void setCharacterDesc(String characterDesc) {
        this.characterDesc = characterDesc;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
