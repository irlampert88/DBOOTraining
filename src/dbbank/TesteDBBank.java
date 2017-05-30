package dbbank;

public class TesteDBBank {

	public static void main(String[] args) {
		Cliente cliente = new Cliente("Juca", "123123123", 19);
		
		Conta contaDoCliente = new ContaCorrente(cliente, 200.0);
		
		Atendimento servicoAtendimentoCaixa = new Caixa(contaDoCliente);
		servicoAtendimentoCaixa.consultarSaldo();
		servicoAtendimentoCaixa.depositar(50);
		
		Atendimento servicoAutoAtendimento = new AutoAtendimento(contaDoCliente);
		servicoAutoAtendimento.consultarSaldo();
		servicoAutoAtendimento.depositar(50);
		
	}
	
}
