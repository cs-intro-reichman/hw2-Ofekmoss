// Demonstrates the Collatz conjecture.
public class Collatz {
	
	public static void main(String args[]) {
		Boolean isV = args[1].equals("v");
	    for (int i = 1; i <= Integer.parseInt(args[0]); i++) {
			int n = i;
			int count = 2;
			if (isV) System.out.print(String.format("%s ", n));
			n = nextCollatz(n);
			while (n != 1) {
				if (isV) System.out.print(String.format("%s ", n));
				n = nextCollatz(n);
				count++;
			}
			if (isV) System.out.print(String.format("%s ", n));
			if (isV) System.out.println(String.format("(%s)", count));
		}
		System.out.println(String.format("Every one of the first %s hailstone sequences reached 1.", args[0]));
	}
	
	public static int nextCollatz(int n) {
		if (n % 2 == 0) {
			n = n / 2;
		} else {
			n = 3 * n + 1;
		}
		return n;
	}

}
