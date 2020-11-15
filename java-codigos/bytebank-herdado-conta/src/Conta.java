

public abstract class Conta {
	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total;

	/**
	 *construtor padrao
	 * public Conta() {
		
	}
	 */
	
	
	// Construtor: "rotina de inicialização 
	// "Método" especial - não é método
	// é invocado a cada new
	public Conta(int agencia, int numero) {
		Conta.total++;
		//System.out.println("Total contas =" + total);
		this.agencia = agencia;
		this.numero = numero;
		//System.out.println("Conta: " + this.numero);
		//System.out.println("Agência: " + this.agencia);		
	}
	
	
	
	
	public static int getTotal() {
		return Conta.total;
	}
//
//	public void deposita(double valor) {
//		this.saldo += valor;
//	}
	
	public abstract void deposita(double valor);	
	
	
	public boolean saca(double valor){
		if(this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}
	
	public boolean transfere(double valor, Conta destino) {
		if(this.saca(valor)) {
			destino.deposita(valor);
			return true;
		} 
		return false;
	}
	
	public double getSaldo(){
		return this.saldo;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public void setNumero(int numero){
		if(numero <= 0) {
			System.out.println("Não pode ser negativo");
			return;
		}
		this.numero = numero;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(int agencia) {
		if(agencia <= 0) {
			System.out.println("Não pode ser negativo");
			return;
		}
		this.agencia = agencia;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return titular;
	}
}
