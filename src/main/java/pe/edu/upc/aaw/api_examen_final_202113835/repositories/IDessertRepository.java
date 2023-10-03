package pe.edu.upc.aaw.api_examen_final_202113835.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.aaw.api_examen_final_202113835.entities.Dessert;

import java.util.List;

@Repository
public interface IDessertRepository extends JpaRepository<Dessert, Integer> {
    @Query(value = "select count(i.hrye_id_ingredient) as Quantity,d.hrye_difficulty_dessert\n" +
            " from ingredient i\n" +
            " inner join dessert d\n" +
            " on d.hrye_id_dessert=i.hrye_id_dessert\n" +
            " group by d.hrye_difficulty_dessert",nativeQuery = true)
    public List<String[]> quantityIngredientsByDifficulty();


}
