// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
		double sum = 0.0;
		double currentNum = 1.0;
		boolean isAdd = true;

		for (int i = 1; i <= Integer.parseInt(args[0]); i++) {
			sum += isAdd ? (1.0 / currentNum) : (-1.0 / currentNum);
			currentNum += 2.0;
			isAdd = !isAdd;
		}
		System.out.println("pi according to Java: 3.141592653589793");
		System.out.println(String.format("pi, approximated:     %s", sum * 4));
	}
}
