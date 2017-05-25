package dbbank;

public class ServicoAutoAtendimento implements ServicoAtendimento {

	public void consultarSaldo(Conta conta) {
		conta.consultarSaldo();
		
		System.out.println("Imprimindo comprovante...");
	}

	public void depositar(Conta conta, double valorParaDeposito) {
		conta.depositar(valorParaDeposito);
		
		System.out.println("Opera��o efetuada com sucesso.");
		System.out.println("O valor entrar� na conta em at� 24 Hrs.");
	}

}
