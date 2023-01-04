/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rent_car1;

/**
 *
 * @author OZN cOxat
 */
public class Masini {
   
    String marca;
    String model;
    String numera_inmatriculare;
    Integer capacitate_motor;
    Integer nr_km;
    Integer cai_putere;
    Integer pret;
    String serie_sasiu;
    String an_fabricatie;
    Integer valoare;

    

    public Masini(String marca, String model, String numera_inmatriculare, Integer capacitate_motor, Integer nr_km, Integer cai_putere, Integer pret, String serie_sasiu, String an_fabricatie, Integer valoare) {
        this.marca = marca;
        this.model = model;
        this.numera_inmatriculare = numera_inmatriculare;
        this.capacitate_motor = capacitate_motor;
        this.nr_km = nr_km;
        this.cai_putere = cai_putere;
        this.pret = pret;
        this.serie_sasiu = serie_sasiu;
        this.an_fabricatie = an_fabricatie;
        this.valoare = valoare;
    }
    
    public void setCai_putere(Integer cai_putere) {
        this.cai_putere = cai_putere;
    }

    public void setAn_fabricatie(String an_fabricatie) {
        this.an_fabricatie = an_fabricatie;
    }

    public String getSerie_sasiu() {
        return serie_sasiu;
    }

    public String getNumera_inmatriculare() {
        return numera_inmatriculare;
    }

    public Integer getPret() {
        return pret;
    }

    public Integer getNr_km() {
        return nr_km;
    }

    public String getModel() {
        return model;
    }

    public String getMarca() {
        return marca;
    }

    public Integer getCapacitate_motor() {
        return capacitate_motor;
    }

    public Integer getCai_putere() {
        return cai_putere;
    }

    public String getAn_fabricatie() {
        return an_fabricatie;
    }

   

    public Masini() {
    }

    public void setCapacitate_motor(Integer capacitate_motor) {
        this.capacitate_motor = capacitate_motor;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setNr_km(Integer nr_km) {
        this.nr_km = nr_km;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setNumera_inmatriculare(String numera_inmatriculare) {
        this.numera_inmatriculare = numera_inmatriculare;
    }

    public void setSerie_sasiu(String serie_sasiu) {
        this.serie_sasiu = serie_sasiu;
    }

    public void setPret(Integer pret) {
        this.pret = pret;
    }
   
    public Integer getValoare() {
        return valoare;
    }

    public void setValoare(Integer valoare) {
        this.valoare = valoare;
    }
}
