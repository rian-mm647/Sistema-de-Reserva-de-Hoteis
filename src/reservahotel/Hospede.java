package reservahotel;

import java.util.Scanner;

public class Hospede {
	public String nome;
	public String cpf;
	public String nascimento;
	
	public String getNome() {
		String nome;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nome: ");
		nome = scanner.nextLine();
		scanner.close();
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		String cpf;
		Scanner scanner = new Scanner(System.in);
		System.out.println("CPF: ");
		cpf = scanner.nextLine();
		scanner.close();
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNascimento() {
		String nascimento;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Data de nascimento: ");
		nascimento = scanner.nextLine();
		scanner.close();
		return nascimento;
	}
	public void setNascimento(String nascimento) {
		this.nascimento = nascimento;
	}
}
