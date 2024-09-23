package reservahotel;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Quarto quartos[] = {
			new Quarto(101, "suíte", 580),
			new Quarto(102, "comum", 400),
			new Quarto(103, "comum", 400)
		};
		
		System.out.print("\n-=-=-=-=-= Sistema de Reserva de Hotéis =-=-=-=-=-");
		int opcao = 0;
		Scanner scanner = new Scanner(System.in);
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
					
					System.out.println("NASCIMENTO: ");
					String nascimento = scanner.next();
					novoHospede.setNascimento(nascimento);
					if (!novoHospede.ehMaiorDeDezoito()) {
						System.out.print("Você precisa ser maior de 18 para realizar uma reserva!");
						break;
					}
					
					System.out.println("Nome: ");
					String nome = scanner.next();
					novoHospede.setNome(nome);
					
					System.out.println("CPF: ");
					String cpf = scanner.next();
					novoHospede.setCpf(cpf);
					
					System.out.println("Estes são os quartos disponíveis: ");
					for (Quarto quarto : quartos) {
						if (quarto.estaDisponivel) System.out.println(quarto.getNumero());
					}
					
					System.out.println("Nº DO QUARTO: ");
					int numeroQuarto = scanner.nextInt();
					
					for (Quarto quarto : quartos) {
						if (quarto.numero == numeroQuarto) quarto.reservar(novoHospede);
					}
					
					break;
				case 2:
					System.out.println("NÚMERO DO QUARTO: ");
					int numero = scanner.nextInt();
					for (Quarto quarto : quartos) {
						if (quarto.numero == numero) {							
							quarto.cancelarReserva();
						}
					}
			}
		} while (opcao != 3);
		scanner.close();
	}
}
