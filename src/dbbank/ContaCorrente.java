package dbbank;

public class ContaCorrente extends Conta {

	public ContaCorrente(Cliente cliente, double saldo) {
		super(cliente, saldo);
		validarAberturaDaConta();
	}

	private void validarAberturaDaConta() {
		if (cliente.getIdade() < 18) {
			throw new IllegalArgumentException("Não é possível abrir uma Conta Corrente para menores de Idade.");
		}
	}
	
	@Override
	public void sacar(double valorDoSaque) {
		double valorCobrancaTaxa = valorDoSaque * 0.05;
		
		double valorTotalDoSaque = valorDoSaque + valorCobrancaTaxa;
		
		validarValorDoSaque(valorTotalDoSaque);
		
		super.sacar(valorTotalDoSaque);
	}

}
