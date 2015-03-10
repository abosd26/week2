import java.io.*;
import java.util.Scanner;

class Date
{
	int year, month, day;
	Date(int year, int month, int day)
	{
		this.year = year;
		this.month = month;
		this.day = day;
	}
	void judge()
	{
		if((year <= 0) || (month < 1 || month > 12) || (day < 1 || day > 31))
		{
			System.out.println("日期格式錯誤!");
		}
		else
		{
			if(month == 4 || month == 6 || month == 9 || month == 11)
			{
				if(day > 30)
				{
					System.out.println("日期格式錯誤!");
				}
				else
				{
					System.out.println("日期格式正確!");
					System.out.println("西元" + year + "年" + month + "月" + day + "日");
				}
			}
			else if(month == 2)
			{
				if((year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) && day > 29)
				{
					System.out.println("日期格式錯誤!");
				}
				else if((year % 400 != 0 && (year % 4 != 0 || year % 100 == 0)) && day > 28)
				{
					System.out.println("日期格式錯誤!");
				}
				else
				{
					System.out.println("日期格式正確!");
					System.out.println("西元" + year + "年" + month + "月" + day + "日");
				}
			}
			else
			{
				System.out.println("日期格式正確!");
				System.out.println("西元" + year + "年" + month + "月" + day + "日");
			}

		}
	}
	public static void main(String[] args)
	{
		String y, m, d;
		Scanner s = new Scanner(System.in);
		try
		{
			System.out.println("請輸入年月日(西元) : ");
			y = s.next();
			m = s.next();
			d = s.next();
			Date date = new Date(Integer.parseInt(y), Integer.parseInt(m), Integer.parseInt(d));
			date.judge();
		}
		catch(Exception e)
		{
			System.out.println("error : " + e);
		}
		
	}
}