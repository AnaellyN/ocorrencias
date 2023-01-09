package ifrn.pi.ocorrencias.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import ifrn.pi.ocorrencias.dto.ContaDto;
import ifrn.pi.ocorrencias.entidades.Aluno;
import ifrn.pi.ocorrencias.entidades.Conta;
import ifrn.pi.ocorrencias.repositorios.AlunoRepositorio;
import ifrn.pi.ocorrencias.servicos.ContaServicos;

@Controller
public class LoginController {

	@Autowired
	private ContaServicos contaServicos;
	
	@Autowired
	private AlunoRepositorio la;  //criando agora 


	public LoginController(ContaServicos contaServicos) {
		this.contaServicos = contaServicos;
	}

	@GetMapping("/registro")
	public String registro(Model model) {
		ContaDto contadto = new ContaDto();
		model.addAttribute("conta", contadto);
		return "registro";
	}
	@GetMapping
	public ModelAndView listarAlunos() {
	List<Aluno> listagemalunos = la.findAll();
	ModelAndView mv = new ModelAndView("templates/listagemAlunos");
	mv.addObject("listagemalunos", listagemalunos);
	return mv;
	}
	//metodo novo

	@PostMapping("/registro/save")
	public String cadastrar(@ModelAttribute("conta") ContaDto contadto, BindingResult bindingResult, Model model) {
		Conta contaExistente = this.contaServicos.buscarPorMatricula(contadto.getMatricula());
		if (contaExistente != null && contaExistente.getMatricula() != null
				&& !contaExistente.getMatricula().isEmpty()) {
			bindingResult.rejectValue("matricula", "Matricula Inválida");
		}
		if (bindingResult.hasErrors()) {
			model.addAttribute("conta", contadto);
			return "/registro";
		}
		this.contaServicos.cadastrarConta(contadto);
		return "redirect:/registro?success";

	}
}
