package fullstackproject.example.characterDatabaseApp.ServiceC;

import fullstackproject.example.characterDatabaseApp.EntityC.CharacterEntity;

import java.util.List;

public interface CharacterService {

    List<CharacterEntity> getAllCharacters();

    CharacterEntity getCharacterByID(int characterID);

    CharacterEntity addCharacter(CharacterEntity characterEntity);

    CharacterEntity updateCharacter(CharacterEntity characterEntity);
}
