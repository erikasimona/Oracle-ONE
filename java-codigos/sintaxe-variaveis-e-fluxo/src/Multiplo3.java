
public class Multiplo3 {
	public static void main(String[] args) {
		int numero = 1;
		int multiplo = numero * 3;
		
		for (numero = 1 ; multiplo < 100; numero++) {
			multiplo = numero * 3;
			System.out.println(multiplo);
		}
	}
}
