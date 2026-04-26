package ejercicio9;
import java.util.List;
import java.util.LinkedList;

public class TestBalanceo {
	public static boolean estaBalanceada(String str) {
		List<Character> chars = new LinkedList<>();
		Character thisChar = ' ';
		for(int i = 0; i < str.length(); i++) {
			thisChar = str.charAt(i);
			if (thisChar == '[' || thisChar == '{' || thisChar == '(') {
				chars.add(thisChar);
			}
			if (thisChar == ']' || thisChar == '}' || thisChar == ')') {
				if (chars.isEmpty()) return false;
				if (thisChar == ']' && chars.getLast() != '[') return false;
				if (thisChar == '}' && chars.getLast() != '{') return false;
				if (thisChar == ')' && chars.getLast() != '(') return false;
				chars.remove(chars.size()-1);
			}
		}
		if (chars.size() != 0) return false;
		return true;
	}
}