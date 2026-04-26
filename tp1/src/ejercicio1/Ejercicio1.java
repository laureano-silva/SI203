package ejercicio1;

public class Ejercicio1 {
	public static void imprimirConFor(int a, int b) {
		for(int i = a; i <= b; i++){
			System.out.println(i);
		}
		System.out.println("FIN imprimirConFor");
	}
	
	public static void imprimirConWhile(int a, int b) {
		Integer i = a;
		while (i <= b) {
			System.out.println(i);
			i++;
		}
		System.out.println("FIN imprimirConWhile");
	}
	
	public static void imprimirSinIterar(int a, int b) {
		if (a > b) {
			System.out.println("FIN imprimirSinIterar");
			return;
		}
		System.out.println(a);
		imprimirSinIterar(a+1, b);
	}
	
	public static void main(String[] args) {
		imprimirConFor(1, 4);
		imprimirConWhile(1, 4);
		imprimirSinIterar(1, 4);
	}
}
