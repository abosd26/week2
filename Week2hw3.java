import java.io.*;
import java.util.Scanner;

class Week2hw3
{
	public static void main(String[] args)
	{
		String name;
		int[] birthdate = new int[3];
		Scanner s = new Scanner(System.in);
		System.out.println("請輸入姓名 : ");
		name = s.nextLine();
		System.out.println("請輸入出生年月日(西元) : ");
		birthdate[0] = s.nextInt();
		birthdate[1] = s.nextInt();
		birthdate[2] = s.nextInt();
		System.out.println("姓名 : " + name);
		System.out.println("出生日期 : " + "民國" + (birthdate[0] - 1911) + "年" + birthdate[1] + "月" + birthdate[2] + "日");
	}
}