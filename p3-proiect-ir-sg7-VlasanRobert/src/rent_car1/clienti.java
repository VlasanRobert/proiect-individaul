/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rent_car1;

/**
 *
 * @author OZN cOxat
 */
public class clienti {
    Integer id;
    String nume;
    String prenume;
    String email;
    String dataretur;

    public clienti() {
    }

    public clienti(Integer id, String nume, String prenume, String email, String dataretur) {
        this.id = id;
        this.nume = nume;
        this.prenume = prenume;
        this.email = email;
        this.dataretur = dataretur;
    }

    public String getDataretur() {
        return dataretur;
    }

    public String getEmail() {
        return email;
    }

    public Integer getId() {
        return id;
    }

    public String getPrenume() {
        return prenume;
    }

    public String getNume() {
        return nume;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDataretur(String dataretur) {
        this.dataretur = dataretur;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }
    
    
    
    
    
}
