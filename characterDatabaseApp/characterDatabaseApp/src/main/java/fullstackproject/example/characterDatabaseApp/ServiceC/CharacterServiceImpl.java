package fullstackproject.example.characterDatabaseApp.ServiceC;

import fullstackproject.example.characterDatabaseApp.DaoC.CharacterDao;
import fullstackproject.example.characterDatabaseApp.EntityC.CharacterEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CharacterServiceImpl implements CharacterService {
    @Autowired
    private CharacterDao characterDao;

    @Override
    public List<CharacterEntity> getAllCharacters() {
        return this.characterDao.findAll();
    }

    @Override
    public CharacterEntity getCharacterByID(int characterID) {
        Optional<CharacterEntity> c = this.characterDao.findById(characterID);
        CharacterEntity characterEntity = null;
        if(c.isPresent()) {
            characterEntity = c.get();
        } else {
            throw new RuntimeException("This ID does not exist");
        }
        return characterEntity;
    }

    @Override
    public CharacterEntity addCharacter(CharacterEntity characterEntity) {
        return this.characterDao.save(characterEntity);
    }

    @Override
    public CharacterEntity updateCharacter(CharacterEntity characterEntity) {
        return this.characterDao.save(characterEntity);
    }


}
