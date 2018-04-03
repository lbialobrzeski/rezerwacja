package pl.lukaszbialobrzeski.samochod;

import pl.lukaszbialobrzeski.bazowe.EncjaBazowa;
import pl.lukaszbialobrzeski.rezerwacja.Rezerwacja;

import javax.persistence.*;

@Entity
@Table(name = "samochod")
public class Samochod extends EncjaBazowa{

    @Column
    private String marka;

    @Column
    private String model;

    @Column(name = "liczba_miejsc")
    private int liczbaMiejsc;

    @ManyToOne
    @JoinColumn(name = "rezerwacja_id")
    private Rezerwacja rezerwacjas;

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

    public Rezerwacja getRezerwacjas() {
        return rezerwacjas;
    }

    public void setRezerwacjas(Rezerwacja rezerwacjas) {
        this.rezerwacjas = rezerwacjas;
    }
}
