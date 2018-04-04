package pl.lukaszbialobrzeski.rezerwacja;

import org.springframework.format.annotation.DateTimeFormat;
import pl.lukaszbialobrzeski.bazowe.EncjaBazowa;
import pl.lukaszbialobrzeski.pracownik.Pracownik;
import pl.lukaszbialobrzeski.samochod.Samochod;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "rezerwacja")
public class Rezerwacja extends EncjaBazowa{

    @Column(name = "data_od")
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dataOd;

    @Column(name = "data_do")
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dataDo;

    @ManyToOne
    @JoinColumn(name = "samochod_id")
    private Samochod samochod;

    @Column
    private String mail;

    public Rezerwacja() {
    }

    public Date getDataOd() {
        return dataOd;
    }

    public void setDataOd(Date dataOd) {
        this.dataOd = dataOd;
    }

    public Date getDataDo() {
        return dataDo;
    }

    public void setDataDo(Date dataDo) {
        this.dataDo = dataDo;
    }

    public Samochod getSamochod() {
        return samochod;
    }

    public void setSamochod(Samochod samochod) {
        this.samochod = samochod;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}
