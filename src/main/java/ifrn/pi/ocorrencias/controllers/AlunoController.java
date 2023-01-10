package ifrn.pi.ocorrencias.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import ifrn.pi.ocorrencias.dto.AlunoDto;
import ifrn.pi.ocorrencias.entidades.Aluno;
import ifrn.pi.ocorrencias.servicos.AlunoServicos;

@Controller
public class AlunoController {

	private static final Object AlunoDto = null;
	private AlunoServicos alunoServicos;

	public AlunoController(AlunoServicos alunoServicos) {
		this.alunoServicos = alunoServicos;
	}
	
	@GetMapping("/AlunoDto")
	public String AlunoDto(Model model) {
		List<AlunoDto> accounts = this.alunoServicos.findAllAlunos();
		model.addAttribute("AlunoDto", AlunoDto);
		return "AlunoDto";
	}	
}
