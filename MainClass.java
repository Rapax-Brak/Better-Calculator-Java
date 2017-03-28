// Calculator
import java.util.Scanner;

public class MainClass {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner algore = new Scanner(System.in);
		Scanner dec = new Scanner(System.in);
		double fnum, snum, answer, dec2;
		System.out.println("Enter first num: ");
		fnum = algore.nextDouble();
		System.out.println("Enter second num: ");
		snum = algore.nextDouble();
		System.out.println("Would you like to");
		System.out.println("1. Add");
		System.out.println("2. Sub");
		System.out.println("3. Multiply");
		System.out.println("4. Divide");
		dec2 = dec.nextDouble();
		if (dec2 == 1) {
			answer = fnum + snum;
			System.out.println(answer);
		}else if (dec2 == 2) {
			answer = fnum - snum;
			System.out.println(answer);
		}else if (dec2 == 3) {
			answer = fnum * snum;
			System.out.println(answer);
		}else if (dec2 == 4) {
			answer = fnum / snum;
			System.out.println(answer);
		}else {
			System.out.println("That was not a choice remember 1 = add 2 =sub 3 = multiply 4 = divide");
		}
	}

}
