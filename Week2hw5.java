import java.io.*;
import java.util.Scanner;

class Week2hw5
{
	public static void main(String[] args)
	{
		int year, count = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("請輸入年份(西元) : ");
		year = s.nextInt();
		for(int i = 1; i < year; i++)
		{
			if((i % 400 == 0) || (i % 4 == 0 && i % 100 != 0))
			{
				System.out.print(i + "\t");
				count++;
			}
			if(count == 10)
			{
				System.out.println("");
				count = 0;
			}
		}
	}
}