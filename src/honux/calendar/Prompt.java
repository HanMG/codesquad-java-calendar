package honux.calendar;

import java.util.Scanner;

public class Prompt
{
	private final String PROMPT = "cal> ";
	
	public void runPrompt()
	{
		Scanner scan = new Scanner(System.in);
		Calendar cal = new Calendar();

		int inputMonth = 0;

		while (true)
		{
			System.out.println("--달을 입력하세요!!  *-1 입력시 종료*");
			System.out.print(PROMPT);
			inputMonth = scan.nextInt();
			if (inputMonth == -1)
			{				
				break;
			} 
			else if (inputMonth > 12)
			{
				System.out.println("1~12 사이의 값을 넣어주세요.");
				continue;
			}
			cal.printCalendar(2019, inputMonth);

		};
		System.out.println("출력완료");

		scan.close();
	}

	public static void main(String[] args)
	{
		// 숫자를 입력받아 해당하는 달의 최대 일수를 출력하는 프로그램
		Prompt p = new Prompt();
		p.runPrompt();
	}
}
