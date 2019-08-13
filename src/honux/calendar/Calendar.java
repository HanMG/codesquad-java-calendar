/*
 *  코드스쿼드 캘린더 만들기 가상의 달력 찍기
 */

//월을 입력하면 해당월의 달력을 출력한다.
//달력은 모양은 1단계에서 작성한 모양으로 만든다.
//1일은 일요일로 정해도 무방하다.
//-1을 입력받기 전까지 반복 입력받는다.
//프롬프트를 출력한다.

package honux.calendar;

public class Calendar
{
	private static final int[] MAX_DAYS =
	{ 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };	

	private static final int[] LEAP_MAX_YEARS =
	{ 0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };	

	
	public boolean isLeapYear(int year)
	{
		if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0))
			return true;
		else
			return false;
	}
	
	public int getMaxDaysOfMonth(int year, int month)
	{
		if (isLeapYear(year))
		{
			return LEAP_MAX_YEARS[month];
		} else
		{
			return MAX_DAYS[month];
		}
	}

	public void printCalendar(int year, int month)
	{
		System.out.printf("     <<%d년 %d월>>\n", year, month);
		System.out.println("  일    월   화  수   목   금   토");
		System.out.println("---------------------");

		// get weekday automatically
		int weekday = getWeekDay(year, month, 1);
		
		// print blank space
		for (int i = 0; i < weekday; i++)
		{
			System.out.print("   ");
		}
		int maxDay = getMaxDaysOfMonth(year, month);

		int count = 7 - weekday;
		int delim = (count < 7) ? count : 0;

		// first line
		for (int i = 1; i <= count; i++)
		{
			System.out.printf("%3d", i);
		}

		// print second line to last
		System.out.println();
		count++;
		for (int i = count; i <= maxDay; i++)
		{
			System.out.printf("%3d", i);
			if (i % 7 == delim)
			{
				System.out.println();
			}
		}
		System.out.println("\n");		
	}
	
	private int getWeekDay(int year, int month, int day) 
	{
		int syear = 1970;		
		/* int sday = 1; */
		final int STANDARD_WEEKDAY = 3; //1970-01-01 = Thursday
		
		int count = 0;
		
		for( int i = syear; i < year; i++) 
		{
			int delta = isLeapYear(i) ? 366 : 365;
			count += delta;
			
		}		
		
		for( int i = 1; i < month; i++) 
		{
			int delta = getMaxDaysOfMonth(year, i);
			count += delta;
		}
		
		count += day;
		
		int weekday = (count + STANDARD_WEEKDAY) % 7;
		
		/* System.out.println(count); */
		return weekday;
	}
	
	public static void main(String[] args)
	{
		Calendar cal = new Calendar();
		System.out.println(cal.getWeekDay(1970, 1, 1) == 3);
		System.out.println(cal.getWeekDay(1971, 1, 1) == 4);
		System.out.println(cal.getWeekDay(1972, 1, 1) == 5);
		System.out.println(cal.getWeekDay(1973, 1, 1) == 0);
		System.out.println(cal.getWeekDay(1974, 1, 1) == 1);		
		
		 
	}

}
