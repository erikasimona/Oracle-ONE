
public class TestaEscopo {
	public static void main(String[] args) {
		System.out.println("Testando condicionais");
		
		int idade = 18;
		int quantidadePessoas = 1;
		
		//boolean acompanhado = true;
		boolean acompanhado2 = quantidadePessoas >=2;
		
		boolean acompanhado;
		if(quantidadePessoas >=2) {
			acompanhado = true;
		}else {
			acompanhado = false;
		}
		
		System.out.println("Acompanhado é: " + acompanhado2);
		
		//if (idade >= 18 || quantidadePessoas >=2) {
		if (idade >= 18 && acompanhado) {
			System.out.println("Seja bem-vindo");
		} else {
	 		System.out.println("Infelizmente você não pode entrar");
		}
	}

}
