package pl.lukaszbialobrzeski;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GlownyKontroler {

//	kontroler wyświetlający główny widok
	@RequestMapping("/")
	public String glownyKontroler() {

		return "glowny";
	}

}