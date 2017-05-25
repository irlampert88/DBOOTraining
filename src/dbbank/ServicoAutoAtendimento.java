package dbbank;

public class ServicoAutoAtendimento implements ServicoAtendimento {

	public void consultarSaldo(Conta conta) {
		conta.consultarSaldo();
		
		System.out.println("Imprimindo comprovante...");
	}

	public void depositar(Conta conta, double valorParaDeposito) {
		conta.depositar(valorParaDeposito);
		
		System.out.println("Operação efetuada com sucesso.");
		System.out.println("O valor entrará na conta em até 24 Hrs.");
	}

}
