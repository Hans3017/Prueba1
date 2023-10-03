package pe.edu.upc.aaw.api_examen_final_202113835.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.api_examen_final_202113835.entities.Dessert;
import pe.edu.upc.aaw.api_examen_final_202113835.repositories.IDessertRepository;
import pe.edu.upc.aaw.api_examen_final_202113835.serviceinterfaces.IDessertService;

import java.util.List;

@Service
public class DessertServiceImplement implements IDessertService {
    @Autowired
    private IDessertRepository hryeDR;
    @Override
    public void insert(Dessert hryeDessert) {
        hryeDR.save(hryeDessert);
    }

    @Override
    public List<String[]> quantityIngredientsByDifficulty() {
        return hryeDR.quantityIngredientsByDifficulty();
    }
}
