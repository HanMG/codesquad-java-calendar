/*
 *  코드스쿼드 자바플레이그라운드 캘린더 만들기 2단계 
 *  두 수를 입력받아 숫자의 합을 구하는 프로그램 작성
 */

package honux.calendar;
import java.util.Scanner;

public class Sum
{
	public static void main(String[] args)
	{
		/* 보기 전 코딩해본 것
		int input1,input2 = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("첫번째 숫자를 입력하세요.");
		input1 = scan.nextInt();
		System.out.println("두번째 숫자를 입력하세요.");
		input2 = scan.nextInt();
		
		System.out.println(input1 + " + " +input2+" = "+ (input1+input2));
		*/
		
		//입력 : 키보드로 두 수의 입력을 받는다.
		//출력: 화면에 두 수 의 합을 출력한다.
		int a,b;
		Scanner scanner = new Scanner(System.in);
		String s1,s2;
		System.out.println("두 수를 입력해 주세요.");
		s1 = scanner.next();
		s2 = scanner.next();
		a = Integer.parseInt(s1);
		b = Integer.parseInt(s2);
		
		//System.out.println("두 수의 합은 " + (a+b) +"입니다.");
		System.out.printf("%d와 %d의 합은 %d입니다.", a, b, a + b);
		
		scanner.close(); // 스캐너 사용후 꺼줘야 누수가 안일어남.
		
		
		
	}
}
