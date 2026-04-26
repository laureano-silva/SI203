package ejercicio2;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio2 {
	
	public static List<Integer> obtenerMultiplos(int a){
		List<Integer> lista = new ArrayList<>();
		for (int i=1; i <= a; i++) {
			lista.add(i*a);
		}
		return lista;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in) ;
		int input = s.nextInt();
		while (input != 0){
			System.out.println(obtenerMultiplos(input).toString());
			input = s.nextInt();
		}
	}
}
