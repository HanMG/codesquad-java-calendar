package honux.calendar;

import java.util.Scanner;

public class Prompt
{

	public int parseDay(String week)
	{
		if (week.equals("일"))
		{
			return 0;
		} else if (week.equals("월"))
		{
			return 1;
		} else if (week.equals("화"))
		{
			return 2;
		} else if (week.equals("수"))
		{
			return 3;
		} else if (week.equals("목"))
		{
			return 4;
		} else if (week.equals("금"))
		{
			return 5;
		} else if (week.equals("토"))
		{
			return 6;
		} else
			return 0;

	}

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

			System.out.println("--첫째 날의 요일을 입력하세요.(일, 월, 화, 수, 목, 금, 토)");
			System.out.print("DAY> ");
			String inputDay = scan.next();
			weekDay = parseDay(inputDay);

			cal.printCalendar(inputYear, inputMonth, weekDay);

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
