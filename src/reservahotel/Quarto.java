package reservahotel;

public class Quarto {
	public int numero;
	public String tipo;
	public double preco;
	public boolean estaDisponivel;
	
    public Quarto() {
        this.estaDisponivel = true;
    }

    public Quarto(int numero, String tipo, double preco) {
        this.numero = numero;
        this.tipo = tipo;
        this.preco = preco;
        this.estaDisponivel = true;
    }

	public void reservar(Hospede hospede) {
		if (estaDisponivel) {			
			estaDisponivel = false;
			System.out.print("Quarto " + this.numero + " reservado com sucesso");
		} else {
			System.out.print("Quarto " + this.numero + " não está disponível");
		}
	}
	public void cancelarReserva() {
		if (!estaDisponivel) {			
			estaDisponivel = false;
			System.out.print("Reserva do Quarto " + this.numero + " cancelada com sucesso");
		} else {
			System.out.print("Quarto " + this.numero + " já está disponível");
		}
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
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
}
