package pl.lukaszbialobrzeski.samochod;

import pl.lukaszbialobrzeski.bazowe.EncjaBazowa;
import pl.lukaszbialobrzeski.rezerwacja.Rezerwacja;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "samochod")
public class Samochod extends EncjaBazowa{

    @Column
    private String marka;

    @Column
    private String model;

    @Column(name = "liczba_miejsc")
    private int liczbaMiejsc;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "samochod")
    private Set<Rezerwacja> rezerwacja;

    public Samochod() {}

    public int getLiczbaMiejsc() {return liczbaMiejsc;}

    public void setLiczbaMiejsc(int liczbaMiejsc) {this.liczbaMiejsc = liczbaMiejsc;}

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Set<Rezerwacja> getRezerwacja() {
        return rezerwacja;
    }

    public void setRezerwacja(Set<Rezerwacja> rezerwacjas) {
        this.rezerwacja = rezerwacjas;
    }
}
