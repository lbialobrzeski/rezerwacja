package pl.lukaszbialobrzeski.pracownik;

import pl.lukaszbialobrzeski.bazowe.EncjaBazowa;
import pl.lukaszbialobrzeski.rezerwacja.Rezerwacja;

import javax.persistence.*;

@Entity
    @Table(name = "pracownik")
    public class Pracownik extends EncjaBazowa {

        @Column
        private String imie;

        @Column
        private String nazwisko;

        @Column
        private String mail;

        public Pracownik() {}

        public String getMail() {return mail;}

        public void setMail(String mail) {
            this.mail = mail;
        }

        public String getImie() {
            return imie;
        }

        public void setImie(String imie) {
            this.imie = imie;
        }

        public String getNazwisko() {
            return nazwisko;
        }

        public void setNazwisko(String nazwisko) {
            this.nazwisko = nazwisko;
        }
    }

