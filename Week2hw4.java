import java.io.*;
import java.util.Scanner;

class Week2hw4
{
	public static void main(String[] args)
	{
		float x, y;
		int option;
		Scanner s = new Scanner(System.in);
		System.out.println("請輸入2個浮點數 : ");
		x = s.nextFloat();
		y = s.nextFloat();
		System.out.println("請選擇運算子 1)+ 2)- 3)* 4)/ : ");
		option = s.nextInt();
		switch(option)
		{
			case 1:
				System.out.println(x + "+" + y + "=" + (x + y));
				break;
			case 2:
				System.out.println(x + "-" + y + "=" + (x - y));
				break;
			case 3:
				System.out.println(x + "*" + y + "=" + (x * y));
				break;
			case 4:
				if(y == 0)
				{
					System.out.println("錯誤!除數不可為0!");
				}
				else
				{
					System.out.println(x + "/" + y + "=" + (x / y));
				}
				break;
			default:
				System.out.println("錯誤!無此選項!");
				break;
		}
	}
}