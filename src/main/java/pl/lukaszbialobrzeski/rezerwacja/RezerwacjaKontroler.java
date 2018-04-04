package pl.lukaszbialobrzeski.rezerwacja;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import pl.lukaszbialobrzeski.pracownik.Pracownik;
import pl.lukaszbialobrzeski.pracownik.PracownikRepozytorium;
import pl.lukaszbialobrzeski.samochod.Samochod;
import pl.lukaszbialobrzeski.samochod.SamochodRepozytorium;


@Controller
public class RezerwacjaKontroler {

    @Autowired
    private RezerwacjaRepozytorium rezerwacjaRepozytorium;

    @Autowired
    private SamochodRepozytorium samochodRepozytorium;

    @Autowired
    private PracownikRepozytorium pracownikRepozytorium;

    @GetMapping("/rezerwacja")
    public String wyswietl(Model model) {
          rezerwacjaRepozytorium.findAll();
        model.addAttribute("rezerwacja", rezerwacjaRepozytorium.findAll());
        return "rezerwacja";
    }

    @GetMapping("/dodajRezerwacja/{id}")
    public String zapiszForm(@PathVariable("id") Integer id, Model model) {
        model.addAttribute("pracownik", pracownikRepozytorium.findAll());
        Rezerwacja rezerwacja = new Rezerwacja();
        model.addAttribute("rezerwacja", rezerwacja);
        return "dodajRezerwacja";
    }

    @PostMapping("/dodajRezerwacja/{id}")
    public String zapiszSubmit(@PathVariable("id") Integer id, @ModelAttribute Rezerwacja rezerwacja){
        Samochod samochod = samochodRepozytorium.findOneById(id);
        rezerwacja.setSamochod(samochod);
        rezerwacjaRepozytorium.save(rezerwacja);
        return "redirect:/rezerwacja";
    }

    @GetMapping("/usunRezerwacja/{id}")
    public String usun(@PathVariable("id") Integer id){
        rezerwacjaRepozytorium.deleteById(id);
        return "redirect:/rezerwacja";
    }

}
