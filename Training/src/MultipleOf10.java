import java.util.Scanner;
public class MultipleOf10 {

	public static void main(String[] args) {
		Scanner c = new Scanner(System.in);
		
		System.out.println("정수값을 입력하세요");
		
		int a = c.nextInt();
		
		if(a>=10)
		{
			if(a%10==0) {
				System.out.println("이 값은 10의 배수 입니다.");
			}
			else {
				System.out.println("이 값은 10의 배수가 아닙니다.");
			}
			
		}

		else {
			System.out.println("음의 정숫값을 입력했습니다.");
		}
	}

}
