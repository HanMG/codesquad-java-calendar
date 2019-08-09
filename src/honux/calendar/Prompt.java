package honux.calendar;

import java.util.Scanner;

public class Prompt
{	

	public void runPrompt()
	{
		Scanner scan = new Scanner(System.in);
		Calendar cal = new Calendar();

		int inputMonth = 0;
		int inputYear = 0;
		int weekDay = 0;

		while (true)
		{
			System.out.println("--연도를 입력하세요!!  *-1 입력시 종료*");
			System.out.print("YEAR> ");
			inputYear = scan.nextInt();
			if (inputYear == -1)
			{
				break;
			}
			System.out.println("--달을 입력하세요!!  *-1 입력시 종료*");
			System.out.print("MONTH> ");
			inputMonth = scan.nextInt();
			if (inputMonth == -1)
			{
				break;
			} else if (inputMonth > 12 || inputMonth < 1)
			{
				System.out.println("1~12 사이의 값을 넣어주세요.");
				continue;
			}			

			cal.printCalendar(inputYear, inputMonth);

		}
		;
		System.out.println("-------출력종료-------");

		scan.close();
	}

	public static void main(String[] args)
	{
		// 숫자를 입력받아 해당하는 달의 최대 일수를 출력하는 프로그램
		Prompt p = new Prompt();
		p.runPrompt();
	}
}
