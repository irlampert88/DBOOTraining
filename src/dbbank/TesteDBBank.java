package dbbank;

public class TesteDBBank {

	public static void main(String[] args) {
		Cliente cliente = new Cliente("Juca", "123123123", 19);
		
		Conta contaCorrente = new ContaCorrente(cliente, 200.0);
		
		ServicoAtendimento servicoAtendimentoCaixa = new ServicoAtendimentoCaixa();
		servicoAtendimentoCaixa.consultarSaldo(contaCorrente);
		servicoAtendimentoCaixa.depositar(contaCorrente, 50);
		
		ServicoAtendimento servicoAutoAtendimento = new ServicoAutoAtendimento();
		servicoAutoAtendimento.consultarSaldo(contaCorrente);
		servicoAutoAtendimento.depositar(contaCorrente, 50);
		
	}
	
}
