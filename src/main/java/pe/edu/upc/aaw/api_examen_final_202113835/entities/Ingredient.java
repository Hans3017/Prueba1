package pe.edu.upc.aaw.api_examen_final_202113835.entities;

import javax.persistence.*;

@Entity
@Table(name="Ingredient")
public class Ingredient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int hryeIdIngredient;
    @Column(name = "hryeNameIngredient",nullable = false,length = 40)
    private String hryeNameIngredient;
    @Column(name = "hryeQuantityIngredient",nullable = false)
    private int hryeQuantityIngredient;
    @ManyToOne
    @JoinColumn(name ="hryeIdDessert")
    private Dessert hryeDessert;

    public Ingredient() {
    }

    public int getHryeIdIngredient() {
        return hryeIdIngredient;
    }

    public void setHryeIdIngredient(int hryeIdIngredient) {
        this.hryeIdIngredient = hryeIdIngredient;
    }

    public String getHryeNameIngredient() {
        return hryeNameIngredient;
    }

    public void setHryeNameIngredient(String hryeNameIngredient) {
        this.hryeNameIngredient = hryeNameIngredient;
    }

    public int getHryeQuantityIngredient() {
        return hryeQuantityIngredient;
    }

    public void setHryeQuantityIngredient(int hryeQuantityIngredient) {
        this.hryeQuantityIngredient = hryeQuantityIngredient;
    }

    public Dessert getHryeDessert() {
        return hryeDessert;
    }

    public void setHryeDessert(Dessert hryeDessert) {
        this.hryeDessert = hryeDessert;
    }
}
