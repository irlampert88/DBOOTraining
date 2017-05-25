package dbbank;

public class ServicoAtendimentoCaixa implements ServicoAtendimento {

	public void consultarSaldo(Conta conta) {
		conta.consultarSaldo();
	}

	public void depositar(Conta conta, double valorParaDeposito) {
		conta.depositar(valorParaDeposito);
		
		System.out.println("Operação efetuada com sucesso.");
	}

}
