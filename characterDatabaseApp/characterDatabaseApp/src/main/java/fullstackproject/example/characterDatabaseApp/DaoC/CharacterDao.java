package fullstackproject.example.characterDatabaseApp.DaoC;

import fullstackproject.example.characterDatabaseApp.EntityC.CharacterEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CharacterDao extends JpaRepository<CharacterEntity, Integer> {

}
