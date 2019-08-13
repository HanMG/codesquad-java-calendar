package honux.calendar;

import java.util.Scanner;

public class Prompt
{	

	public void printMenu() {
		System.out.println("+----------------------+");
		System.out.println("| 1. 일정 등록");           
		System.out.println("| 2. 일정 검색");
		System.out.println("| 3. 달력 보기");
		System.out.println("| h. 도움말 q. 종료");
		System.out.println("+----------------------+");
		System.out.println("명령 (1, 2, 3, h, q)");		
	}
	
	public void runPrompt()
	{
		Scanner scan = new Scanner(System.in);
		Calendar cal = new Calendar();

		
		
		while (true) {
			System.out.println("명령 (1, 2, 3, h, q)");
			String cmd = scan.next();
			if(cmd.equals("1")) {
				cmdRegister();
			}
			else if(cmd.equals("2")) {
				cmdSearch();
			}
			else if(cmd.equals("3")) {
				cmdCal(scan, cal);
			}
			else if(cmd.equals("h")) {
				printMenu();
			}
			else if(cmd.equals("q")) {
				break;
			}
		}

		
		System.out.println("-------출력종료-------");

		scan.close();
	}

	private void cmdCal(Scanner s, Calendar c)
	{
		int inputMonth = 0; // 달 입력
		int inputYear = 0; // 연도 입력
		// TODO Auto-generated method stub
		
			System.out.println("--연도를 입력하세요");
			System.out.print("YEAR> ");
			inputYear = s.nextInt();
			
			System.out.println("--달을 입력하세요.");
			System.out.print("MONTH> ");
			inputMonth = s.nextInt();			
			if (inputMonth > 12 || inputMonth < 1)
			{
				System.out.println("1~12 사이의 값을 넣어주세요.");
				return;
			
			}			
			c.printCalendar(inputYear, inputMonth);

		
	}

	private void cmdSearch()
	{
		// TODO Auto-generated method stub
		
	}

	private void cmdRegister()
	{
		// TODO Auto-generated method stub
		
	}

	public static void main(String[] args)
	{
		// 숫자를 입력받아 해당하는 달의 최대 일수를 출력하는 프로그램
		Prompt p = new Prompt();
		p.runPrompt();
	}
}
