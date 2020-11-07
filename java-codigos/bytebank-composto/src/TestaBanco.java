
public class TestaBanco {
	public static void main(String[] args) {
		Cliente paulo = new Cliente();
		paulo.nome = "Paulo Silveira";
		paulo.cpf = "098.876.876-45";
		paulo.profissao = "Programador";
		
		Conta contaDoPaulo = new Conta();
		contaDoPaulo.deposita(100);
		
		contaDoPaulo.titular = paulo;
		System.out.println(contaDoPaulo.titular.nome);
	}
}
