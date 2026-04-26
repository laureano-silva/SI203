package ejercicio7c;
import java.util.ArrayList;
import java.util.List;


public class TestArrayList {
	public static void main(String[] args) {
		List<Integer> lista = new ArrayList<>();
		
		// Agregar numeros a la lista
		for (String arg : args) {
			lista.add(Integer.parseInt(arg));
		}
		
		// Imprimir
		for (Integer i : lista) {
			System.out.println(i);
		}
	}
}