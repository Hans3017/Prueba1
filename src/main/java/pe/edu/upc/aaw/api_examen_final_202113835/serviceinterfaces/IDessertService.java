package pe.edu.upc.aaw.api_examen_final_202113835.serviceinterfaces;

import pe.edu.upc.aaw.api_examen_final_202113835.entities.Dessert;

import java.util.List;

public interface IDessertService {
    public void insert(Dessert hryeDessert);

    public List<String[]> quantityIngredientsByDifficulty();

}
