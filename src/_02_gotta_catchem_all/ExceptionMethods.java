package _02_gotta_catchem_all;

public class ExceptionMethods {
	double divide(Double divisor, Double dividend) {
		if (divisor.equals(0.0)) {
			throw new IllegalArgumentException();
		}
		return dividend/divisor;
	}
	
	String reverseString(String s) {
		if (s.equals("")) {
			throw new IllegalStateException();
		}
		String backwardsS = "";
		for (int i = 0; i < s.length(); i++) {
			backwardsS.concat(String.valueOf(s.charAt(s.length() - 1 - i)));
		}
		return backwardsS;
	}
	
}
