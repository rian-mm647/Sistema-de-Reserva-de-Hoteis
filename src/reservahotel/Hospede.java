package reservahotel;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Hospede {
	public String nome;
	public String cpf;
	public String nascimento;
	
    public Hospede() {}

    public Hospede(String nome, String cpf, String nascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.nascimento = nascimento;
    }
	
    public boolean ehMaiorDeDezoito() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate nascimento = LocalDate.parse(this.getNascimento(), formatter);
        LocalDate hoje = LocalDate.now();
        long anos = ChronoUnit.YEARS.between(nascimento, hoje);
        return anos >= 18;
    }
	
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return this.cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNascimento() {
		return this.nascimento;
	}
	public void setNascimento(String nascimento) {
		this.nascimento = nascimento;
	}
}
