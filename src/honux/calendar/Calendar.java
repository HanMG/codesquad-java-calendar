/*
 *  코드스쿼드 캘린더 만들기 무한입력 1~12사이가 아닐경우 예외
 */
package honux.calendar;
import java.util.Scanner;

public class Calendar
{
	private static final int[]MAX_DAYS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	public  int getMaxDaysOfMonth(int month) {
		return MAX_DAYS[month - 1];
	}
	
	public void printSampleCalendar() {
		System.out.println(" 일   월    화    수    목    금    토");
		System.out.println("--------------------");
		System.out.println(" 1  2  3  4  5  6  7");
		System.out.println(" 8  9 10 11 12 13 14");
		System.out.println("15 16 17 18 19 20 21");
		System.out.println("22 23 24 25 26 27 28");
		System.out.println("29 30 \n");
	}
	
	public static void main(String[] args)
	{	
		//숫자를 입력받아 해당하는 달의 최대 일수를 출력하는 프로그램
		Scanner scan = new Scanner(System.in);
		Calendar cal = new Calendar();
		String PROMPT = "cal> ";
		int inputMonth = 0 ;	
		int inputTimes = 0;
		/*
		 * System.out.printf("몇 번 실행할 지 숫자를 입력해주세요 : ");
		 * 
		 * inputTimes = scan.nextInt();
		 */	
		
		while (true)
		{
			System.out.println("--달을 입력하세요!!  *-1 입력시 종료*");
			System.out.print(PROMPT);
			inputMonth = scan.nextInt();		
			if(inputMonth == -1) {
				System.out.println("-1 입력받음");
				break;
			}
			else if(inputMonth > 12) {
				System.out.println("1~12 사이의 값을 넣어주세요.");
				continue;
			}			
			System.out.printf("%d월은 %d일까지 있습니다. \n\n", inputMonth, cal.getMaxDaysOfMonth(inputMonth));
			
		};
		System.out.println("출력완료");
		
		//cal.printSampleCalendar();
		scan.close();		
	}

}
