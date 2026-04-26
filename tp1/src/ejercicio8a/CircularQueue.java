package ejercicio8a;

public class CircularQueue<T> extends Queue<T>{
	public T shift() {
		T elemento = dequeue();
		enqueue(elemento);
		return elemento;
	}
}
