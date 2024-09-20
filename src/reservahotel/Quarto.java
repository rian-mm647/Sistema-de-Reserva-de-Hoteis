package reservahotel;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Quarto {
	public int numero;
	public String tipo;
	public int preco;
	public boolean estaDisponivel;

	public void reservar(Hospede hospede) {
		if (this.maiorDeDezoito(hospede.nascimento) && estaDisponivel) {
			estaDisponivel = false;
			System.out.print("Quarto reservado com sucesso");
		}
	}
	public void cancelarReserva() {
		estaDisponivel = true;
		System.out.print("Reserva cancelada com sucesso");
	}
    private boolean maiorDeDezoito(String dataNascimento) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate nascimento = LocalDate.parse(dataNascimento, formatter);
        LocalDate hoje = LocalDate.now();

        long anos = ChronoUnit.YEARS.between(nascimento, hoje);
        return anos >= 18;
    }
	public boolean estaDisponivel() {
		return estaDisponivel;
	}
	public void setEstaDisponivel(boolean estaDisponivel) {
		this.estaDisponivel = estaDisponivel;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getPreco() {
		return preco;
	}
	public void setPreco(int preco) {
		this.preco = preco;
	}
}
