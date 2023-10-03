package pe.edu.upc.aaw.api_examen_final_202113835.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.aaw.api_examen_final_202113835.entities.Ingredient;

import java.util.List;

@Repository
public interface IIngredientRepository extends JpaRepository<Ingredient, Integer> {

}
