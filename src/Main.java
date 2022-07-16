
public class Main {

	public static void main(String[] args) {
		System.out.println("******* BANCO INNOVATION S.A *******");
		
		Cliente carlosWellington = new Cliente();
		carlosWellington.setNome("Carlos Wellington");
		
		Conta cc = new ContaCorrente(carlosWellington);
		Conta poupanca = new ContaPoupanca(carlosWellington);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		
	}

}
