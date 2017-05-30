package dbbank;

public class Caixa implements Atendimento {

	private Conta conta;
	
	public Caixa(Conta conta) {
		this.conta = conta;
	}
	
	public void consultarSaldo() {
		conta.consultarSaldo();
	}

	public void depositar(double valorDoDeposito) {
		conta.depositar(valorDoDeposito);
	}

	@Override
	public void sacar(double valorDoSaque) {
		conta.sacar(valorDoSaque);
	}

}
