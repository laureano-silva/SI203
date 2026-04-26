package ejercicio8a;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;

public class Queue<T> implements Sequence<T>{
	protected List<T> data;
	
	public Queue() {
		data = new LinkedList<T>();
	}
	
	public void enqueue(T dato){
		data.add(dato);
	}
	
	public T dequeue(){
		if (isEmpty()) {
			throw new NoSuchElementException("La cola está vacía.");
		}
		return data.remove(0);
	}

	public T head() {
		if (isEmpty()) {
			throw new NoSuchElementException("La cola está vacía.");
		}
		return data.get(0);
	}
	
	@Override
	public int size(){
		return data.size();
	}	
	@Override
	public boolean isEmpty() {
		return data.isEmpty();
	}
	
    @Override
    public String toString() {
        return "Cantidad de elementos: " + data.toString();
    }
}