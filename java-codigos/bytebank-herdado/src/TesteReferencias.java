
public class TesteReferencias {

	public static void main(String[] args) {

//		Funcionario g1 = new Gerente();
		Gerente g1 = new Gerente();
		g1.setNome("Marcia");
		g1.setSalario(5000);
		
//		Funcionario f = new Funcionario();
//		//g1.setNome("Luisa");
//		g1.setSalario(2000);
//		
		EditorVideo ev = new EditorVideo();
		g1.setSalario(2000);
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g1);
		//controle.registra(f);
		controle.registra(ev);
		
		//String nome = g1.getNome();
		//		System.out.println(g1.getNome());
		System.out.println(controle.getSoma());
	}

}
