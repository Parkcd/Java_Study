import java.util.Scanner;
public class Min3 {

	public static void main(String[] args) {
		
		Scanner d = new Scanner(System.in);
		
		System.out.println("정수값 3가지를 입력하세요");
		
		int a = d.nextInt();
		int b = d.nextInt();
		int c = d.nextInt();

		int min = a;
		if(b < min) min = b;
		if(c < min) min = c;
		
		System.out.println("최솟값은" + min + "입니다.");
	}

}
