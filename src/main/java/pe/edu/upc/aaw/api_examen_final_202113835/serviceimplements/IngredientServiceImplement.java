package pe.edu.upc.aaw.api_examen_final_202113835.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.api_examen_final_202113835.entities.Ingredient;
import pe.edu.upc.aaw.api_examen_final_202113835.repositories.IIngredientRepository;
import pe.edu.upc.aaw.api_examen_final_202113835.serviceinterfaces.IIngredientService;

import java.util.List;

@Service
public class IngredientServiceImplement implements IIngredientService {
    @Autowired
    private IIngredientRepository hryeIR;
    @Override
    public void insert(Ingredient hryeIngredient) {
        hryeIR.save(hryeIngredient);
    }


}
