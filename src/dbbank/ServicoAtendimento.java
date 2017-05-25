package dbbank;

public interface ServicoAtendimento {

	public void consultarSaldo(Conta conta);
	
	public void depositar(Conta conta, double valorDoDeposito);
	
}
