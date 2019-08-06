package com.fabisoft.personal;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.fabisoft.personal.domain.EstruturaTreinamento;
import com.fabisoft.personal.enuns.Divisao;
import com.fabisoft.personal.enuns.Metodo;
import com.fabisoft.personal.enuns.Nivel;
import com.fabisoft.personal.enuns.Sistema;
import com.fabisoft.personal.enuns.Velocidade;
import com.fabisoft.personal.repository.AlunoRepository;
import com.fabisoft.personal.service.EstruTreinamentoService;

@SpringBootApplication
@EnableJpaRepositories
public class PersonalApp {
	public static void main(String[] args) {
		SpringApplication.run(PersonalApp.class, args);
	}

	@Bean
	public CommandLineRunner run(AlunoRepository aRepository, EstruTreinamentoService service) {
		return args -> {
			try {
			EstruturaTreinamento entidade = new EstruturaTreinamento();
		
			
			entidade.setDivisao(Divisao.AB);
			entidade.setFrequeSemanal(3);
			entidade.setIntervalo(1);
			entidade.setMetodo(Metodo.ALTER);
			entidade.setNivel(Nivel.AVANC);
			entidade.setNumeroExerc(8);
			entidade.setNumerosemana(4);
			entidade.setNumeroSerie(2);
			entidade.setNumeroTreino(6);
			entidade.setRepeticoes(7);
			entidade.setSerieTotal(20);
			entidade.setSistema(Sistema.BISET);
			entidade.setVelocidade(Velocidade.LEVE);
			
			
			
			//service.salvar(entidade);
			}catch (Exception e) {
				e.printStackTrace();
				System.err.println("Ops Erro ao Salvar");
			}
			
			
			
			/*
			Aluno a = new Aluno();
			a.setNome("FABIANA");
			aRepository.gravar(a);
			*/
			/*
			Aluno b = aRepository.listarById(2L);
			RegistroAula ra = new RegistroAula();
			ra.setAluno(b);
			ra.setData(new Date());
			if(ra.getResumoDia()==null)
				System.out.println("Informar o resumo do dia");
			ra.setResumoDia("CANSADO");
			aRepository.salvar(ra);
			System.exit(0);
			*/
		};
	};
	
}
