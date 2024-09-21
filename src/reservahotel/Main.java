package reservahotel;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("\n-=-=-=-=-= Sistema de Reserva de Hotéis =-=-=-=-=-");
		int opcao = 0;
		do {
			System.out.println("\n\nBem vindo, selecione uma das opções abaixo para prosseguir:");
			System.out.println("1 - Iniciar reserva");
			System.out.println("2 - Cancelar uma reserva");
			System.out.println("3 - Sair");
			System.out.println("Opção desejada: ");
			opcao = scanner.nextInt();
			switch (opcao) {
				case 1:
					Hospede novoHospede = new Hospede();
					System.out.println("Insira suas informações: ");
					novoHospede.getNome();
					novoHospede.getCpf();
					novoHospede.getNascimento();
					break;

				case 2:
					System.out.println("Digite o código da reserva que deseja cancelar: ");
			}
		} while (opcao != 3);
		scanner.close();
	}
}
