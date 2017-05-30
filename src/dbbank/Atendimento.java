package dbbank;

public interface Atendimento {

	public void consultarSaldo();
	public void depositar(double valorDoDeposito);
	public void sacar(double valorDoSaque);
	
}
