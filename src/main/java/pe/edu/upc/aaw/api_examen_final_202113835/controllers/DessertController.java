package pe.edu.upc.aaw.api_examen_final_202113835.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.api_examen_final_202113835.dtos.DessertDTO;
import pe.edu.upc.aaw.api_examen_final_202113835.dtos.ReporteDTO;
import pe.edu.upc.aaw.api_examen_final_202113835.entities.Dessert;
import pe.edu.upc.aaw.api_examen_final_202113835.serviceinterfaces.IDessertService;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/desserts")
public class DessertController {
    @Autowired
    private IDessertService hryeDS;

    @PreAuthorize("hasAuthority('ASISTENTE')")
    @PostMapping
    public void registrar(@RequestBody DessertDTO hryeDto) {
        ModelMapper hryeM = new ModelMapper();
        Dessert hryeD = hryeM.map(hryeDto, Dessert.class);
        hryeDS.insert(hryeD);
    }

    @PreAuthorize("hasAuthority('COCINERO')")
    @GetMapping("/report")
    public List<ReporteDTO> cantidadIngredientesPorPostre(){
        List<String[]>hryeLista=hryeDS.quantityIngredientsByDifficulty();
        List<ReporteDTO>hryeListaDTO=new ArrayList<>();
        for(String[] data:hryeLista){
            ReporteDTO hryeDto=new ReporteDTO();
            hryeDto.setHryeQuantity(Integer.parseInt(data[0]));
            hryeDto.setHryeDifficulty_dessert(data[1]);
            hryeListaDTO.add(hryeDto);
        }
        return hryeListaDTO;
    }
}
