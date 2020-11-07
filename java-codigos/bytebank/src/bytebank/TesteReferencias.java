package bytebank;

public class TesteReferencias {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;
		
		System.out.println("Saldo conta 1: " + primeiraConta.saldo);

		Conta segundaConta = primeiraConta;
		System.out.println("Saldo conta 2: " + segundaConta.saldo);

		segundaConta.saldo += 100;
		System.out.println("Saldo conta 2: " + segundaConta.saldo);

		System.out.println("Saldo conta 1: " + primeiraConta.saldo);

	}

}
