import java.io.*;
import java.util.Scanner;

class Week2hw4
{
	public static void main(String[] args)
	{
		float x, y;
		int option;
		Scanner s = new Scanner(System.in);
		System.out.println("�п�J2�ӯB�I�� : ");
		x = s.nextFloat();
		y = s.nextFloat();
		System.out.println("�п�ܹB��l 1)+ 2)- 3)* 4)/ : ");
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
					System.out.println("���~!���Ƥ��i��0!");
				}
				else
				{
					System.out.println(x + "/" + y + "=" + (x / y));
				}
				break;
			default:
				System.out.println("���~!�L���ﶵ!");
				break;
		}
	}
}