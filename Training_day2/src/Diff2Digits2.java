import java.util.Scanner;
public class Diff2Digits2 {

	public static void main(String[] args) {
		Scanner c = new Scanner(System.in);
		
		System.out.println("정수 a:"); 
		int a = c.nextInt();
		System.out.println("정수 b:");
		int b = c.nextInt();

		int diff = a >= b ? a-b : b-a;
		System.out.println("두 값의 차는 " + (diff <= 10 ? "10이하" : "11이상") + "입니다");
	}

}
