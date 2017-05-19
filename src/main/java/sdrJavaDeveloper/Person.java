package sdrJavaDeveloper;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Person    {


	
	@Id
	@GeneratedValue
	private Long id;
	private String matricula;
	private String nome;

	public Person() {

	}
	
	public Person(String matricula, String nome) {
		super();
		this.matricula = matricula;
		this.nome = nome;
	}


	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "PersonDTO [matricula=" + matricula + ", nome=" + nome + "]";
	}



}
