package dbbank;

public class Conta {

	private double saldo;
	protected Cliente cliente;
	
	public Conta(Cliente cliente, double saldo) {
		this.cliente = cliente;
		this.saldo = saldo;
	}
	
	public void sacar(double valorDoSaque) {
		validarValorDoSaque(valorDoSaque);
		saldo = saldo - valorDoSaque;
		System.out.println("Saque de " + valorDoSaque + " realizado.");
	}
	
	public void depositar(double valorDoDeposito) {
		saldo = saldo + valorDoDeposito;
		System.out.println("Dep�sito de " + valorDoDeposito + " realizado.");
	}
	
	public void consultarSaldo() {
		System.out.println("Saldo da conta do cliente " + cliente.getNome() + " � de " + saldo + ".");
	}
	
	protected void validarValorDoSaque(double valorDoSaque) {
		if (valorDoSaque > saldo) {
			throw new IllegalArgumentException("Saldo n�o suficiente para saque.");
		}
	}
	
}
