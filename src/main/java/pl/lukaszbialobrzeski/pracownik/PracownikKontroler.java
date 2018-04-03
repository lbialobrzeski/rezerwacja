package pl.lukaszbialobrzeski.pracownik;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PracownikKontroler {

    @Autowired
    private PracownikRepozytorium pracownikRepozytorium;

    @GetMapping("/pracownik")
    public String wyswietl(Model model) {
        model.addAttribute("pracownik", pracownikRepozytorium.findAll());
        return "pracownik";
    }

    @GetMapping("/dodajPracownik")
    public String zapiszForm(Model model) {
        model.addAttribute("pracownik", new Pracownik());
        return "dodajPracownik";
    }

    @PostMapping("/dodajPracownik")
    public String zapiszSubmit(@ModelAttribute Pracownik pracownik){
        pracownikRepozytorium.save(pracownik);
        return "redirect:/pracownik";
    }

    @GetMapping("/edytujPracownik/{id}")
    public String edytujForm(@PathVariable("id") Integer id, Model model) {
        Pracownik pracownik = pracownikRepozytorium.findOneById(id);
        model.addAttribute("pracownik", pracownik);
        return "edytujPracownik";
    }

    @PostMapping("/edytujPracownik/{id}")
    public String edytujSubmit(@PathVariable("id") Integer id,  @ModelAttribute Pracownik pracownik){
        pracownik.setId(id);
        pracownikRepozytorium.save(pracownik);
        return "redirect:/pracownik";
    }
    @GetMapping("/usunPracownik/{id}")
    public String usun(@PathVariable("id") Integer id){
        pracownikRepozytorium.deleteById(id);
        return "redirect:/pracownik";
    }
}
