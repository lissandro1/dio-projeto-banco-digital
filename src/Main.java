
public class Main {

	public static void main(String[] args) {

		Cliente cliente = new Cliente();
		cliente.setNome("Maria");
		
		Conta cc = new ContaCorrente(cliente);
		Conta cp = new ContaPoupanca(cliente);
		
		cc.depositar(200.0);
		cc.transferir(150.0, cp);
		
		cc.imprimirExtrato();
		cp.imprimirExtrato();
		
	}
}
