package pl.lukaszbialobrzeski.samochod;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SamochodKontroler {

    @Autowired
    private SamochodRepozytorium samochodRepozytorium;

    @GetMapping("/samochod")
    public String wyswietl(Model model) {
        model.addAttribute("samochody", samochodRepozytorium.findAll());
        return "samochod";
    }

    @GetMapping("/dodajSamochod")
    public String zapiszForm(Model model) {
        model.addAttribute("samochod", new Samochod());
        return "dodajSamochod";
    }

    @PostMapping("/dodajSamochod")
    public String zapiszSubmit(@ModelAttribute Samochod samochod){
        samochodRepozytorium.save(samochod);
        return "redirect:/samochod";
    }

    @GetMapping("/edytujSamochod/{id}")
    public String edytujForm(@PathVariable("id") Integer id, Model model) {
        Samochod samochod = samochodRepozytorium.findOneById(id);
        model.addAttribute("samochod", samochod);
        return "edytujSamochod";
    }

    @PostMapping("/edytujSamochod/{id}")
    public String edytujSubmit(@PathVariable("id") Integer id,  @ModelAttribute Samochod samochod){
        samochod.setId(id);
        samochodRepozytorium.save(samochod);
        return "redirect:/samochod";
    }
    @GetMapping("/usunSamochod/{id}")
    public String usun(@PathVariable("id") Integer id){
        samochodRepozytorium.deleteById(id);
        return "redirect:/samochod";
    }

}
