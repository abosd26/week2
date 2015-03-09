import java.io.*;
import java.util.Scanner;

class Week2hw6
{
	public static void main(String[] args)
	{
		boolean exit = false;
		int option, count = 0, num;
		String[] name = new String[100];
		int[] grade = new int[100];
		Scanner s = new Scanner(System.in);
		while(true)
		{
			System.out.println("請輸入 1)新增學生資料 2)顯示全部學生資料 3)查詢特定學生資料  -1)離開 : ");
			option = s.nextInt();
			switch(option)
			{
				case 1:
					try
					{
						System.out.println("請輸入學生姓名 : ");
						name[count] = s.next();
						System.out.println("請輸入學生成績 : ");
						grade[count] = Integer.parseInt(s.next());
						count++;
					}
					catch(Exception e)
					{
						System.out.println("錯誤 : " + e);
					}
					break;
				case 2:
					System.out.println("編號\t姓名\t成績");
					for(int i = 0; i < count; i++)
					{
						System.out.println((i + 1) + "\t" + name[i] + "\t" + grade[i]);
					}
					break;
				case 3:
					System.out.println("請輸入編號 : ");
					num = s.nextInt();
					if(num > 0 && num <= count)
					{
						System.out.println("編號\t姓名\t成績");
						System.out.println(num + "\t" + name[num - 1] + "\t" + grade[num - 1]);
					}
					else
					{
						System.out.println("查無資料!");
					}
					break;
				case -1:
					exit = true;
					break;
				default:
					System.out.println("無此選項!");
					break;
			}
			if(exit)
			{
				break;
			}
		}
	}
}