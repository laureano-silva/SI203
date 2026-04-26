package ejercicio8a;

public class DoubleEndedQueue<T> extends Queue<T>{
	public void enqueueFirst(T data) {
		this.data.add(0, data);
	}
}
