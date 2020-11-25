package br.usjt.what2listen.Repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import br.usjt.what2listen.Model.Score;

@Repository
public interface ScoreRepo extends CrudRepository<Score, Integer> {

}
