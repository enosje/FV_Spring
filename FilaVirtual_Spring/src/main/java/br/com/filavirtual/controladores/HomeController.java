package br.com.filavirtual.controladores;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.filavirtual.entidades.Usuario;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	private static final Logger logger = LoggerFactory
			.getLogger(HomeController.class);

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);

		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG,
				DateFormat.LONG, locale);

		String formattedDate = dateFormat.format(date);

		model.addAttribute("serverTime", formattedDate);

		return "home";
	}

	@RequestMapping(value = "/cadastroUser", method = RequestMethod.GET)
	public String cadastroUsuario() {
		return "cadastro";
	}

	@RequestMapping("/efetuaLogin")
	public String efetuarLogin() {

		return "home";
	}

	@RequestMapping(value = "/novoCadastro", method = RequestMethod.POST)
	public String novoCadastro(@Validated Usuario usuario, BindingResult result) {
		if (result.hasFieldErrors("nomeUsuario")) {
			return "cadastro";
		}
		if (result.hasFieldErrors("senha")) {
			return "cadastro";
		}
		return "home";
	}

}
