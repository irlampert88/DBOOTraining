package dbbank;

public class AutoAtendimento implements Atendimento {

	private Conta conta;
	
	public AutoAtendimento(Conta conta) {
		this.conta = conta;
	}
	
	public void consultarSaldo() {
		conta.consultarSaldo();
		System.out.println("Imprimindo comprovante...");
	}

	public void depositar(double valorParaDeposito) {
		conta.depositar(valorParaDeposito);
		System.out.println("O valor entrará na conta em até 24 Hrs.");
	}
	
	@Override
	public void sacar(double valorDoSaque) {
		conta.sacar(valorDoSaque);
	}

}
