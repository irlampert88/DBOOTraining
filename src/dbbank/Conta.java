package dbbank;

public class Conta {

	private double saldo;
	private Cliente cliente;
	
	public Conta(Cliente cliente, double saldo) {
		this.cliente = cliente;
		this.saldo = saldo;
	}
	
	protected Cliente clienteDaConta() {
		return cliente;
	}
	
	public void sacar(double valorDoSaque) {
		validarValorDoSaque(valorDoSaque);
		
		saldo = saldo - valorDoSaque;
		System.out.println("Saque de " + valorDoSaque + " realizado.");
	}
	
	public void depositar(double valorDoDeposito) {
		saldo = saldo + valorDoDeposito;
		System.out.println("Depósito de " + valorDoDeposito + " realizado.");
	}
	
	public void consultarSaldo() {
		System.out.println("Saldo da conta do cliente " + cliente.getNome() + " é de " + saldo + ".");
	}
	
	private void validarValorDoSaque(double valorDoSaque) {
		if (valorDoSaque > saldo) {
			throw new IllegalArgumentException("Saldo não suficiente para saque.");
		}
	}
	
}
