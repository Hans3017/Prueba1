package pe.edu.upc.aaw.api_examen_final_202113835.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="Dessert")
public class Dessert {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int hryeIdDessert;
    @Column(name = "hryeNameDessert",nullable = false,length = 40)
    private String hryeNameDessert;
    @Column(name = "hryePreparationTimeDessert",nullable = false)
    private int hryePreparationTimeDessert;
    @Column(name = "hryeDifficultyDessert",nullable = false,length = 40)
    private String hryeDifficultyDessert;

    public Dessert() {
    }

    public int getHryeIdDessert() {
        return hryeIdDessert;
    }

    public void setHryeIdDessert(int hryeIdDessert) {
        this.hryeIdDessert = hryeIdDessert;
    }

    public String getHryeNameDessert() {
        return hryeNameDessert;
    }

    public void setHryeNameDessert(String hryeNameDessert) {
        this.hryeNameDessert = hryeNameDessert;
    }

    public int getHryePreparationTimeDessert() {
        return hryePreparationTimeDessert;
    }

    public void setHryePreparationTimeDessert(int hryePreparationTimeDessert) {
        this.hryePreparationTimeDessert = hryePreparationTimeDessert;
    }

    public String getHryeDifficultyDessert() {
        return hryeDifficultyDessert;
    }

    public void setHryeDifficultyDessert(String hryeDifficultyDessert) {
        this.hryeDifficultyDessert = hryeDifficultyDessert;
    }
}
