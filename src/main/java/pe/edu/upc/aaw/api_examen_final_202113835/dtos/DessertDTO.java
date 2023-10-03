package pe.edu.upc.aaw.api_examen_final_202113835.dtos;

import javax.persistence.Column;

public class DessertDTO {
    private int hryeIdDessert;
    private String hryeNameDessert;
    private int hryePreparationTimeDessert;
    private String hryeDifficultyDessert;

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
