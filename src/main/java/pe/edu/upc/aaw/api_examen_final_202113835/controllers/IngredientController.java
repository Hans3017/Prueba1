package pe.edu.upc.aaw.api_examen_final_202113835.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.api_examen_final_202113835.dtos.DessertDTO;
import pe.edu.upc.aaw.api_examen_final_202113835.dtos.IngredientDTO;
import pe.edu.upc.aaw.api_examen_final_202113835.dtos.ReporteDTO;
import pe.edu.upc.aaw.api_examen_final_202113835.entities.Dessert;
import pe.edu.upc.aaw.api_examen_final_202113835.entities.Ingredient;
import pe.edu.upc.aaw.api_examen_final_202113835.serviceinterfaces.IDessertService;
import pe.edu.upc.aaw.api_examen_final_202113835.serviceinterfaces.IIngredientService;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/ingredients")
public class IngredientController {
    @Autowired
    private IIngredientService hryeIS;

    @PreAuthorize("hasAuthority('COCINERO')")
    @PostMapping
    public void registrar(@RequestBody IngredientDTO hryeDto) {
        ModelMapper hryeM = new ModelMapper();
        Ingredient hryeI = hryeM.map(hryeDto, Ingredient.class);
        hryeIS.insert(hryeI);
    }



}
