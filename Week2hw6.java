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
			System.out.println("�п�J 1)�s�W�ǥ͸�� 2)��ܥ����ǥ͸�� 3)�d�߯S�w�ǥ͸��  -1)���} : ");
			option = s.nextInt();
			switch(option)
			{
				case 1:
					try
					{
						System.out.println("�п�J�ǥͩm�W : ");
						name[count] = s.next();
						System.out.println("�п�J�ǥͦ��Z : ");
						grade[count] = Integer.parseInt(s.next());
						count++;
					}
					catch(Exception e)
					{
						System.out.println("���~ : " + e);
					}
					break;
				case 2:
					System.out.println("�s��\t�m�W\t���Z");
					for(int i = 0; i < count; i++)
					{
						System.out.println((i + 1) + "\t" + name[i] + "\t" + grade[i]);
					}
					break;
				case 3:
					System.out.println("�п�J�s�� : ");
					num = s.nextInt();
					if(num > 0 && num <= count)
					{
						System.out.println("�s��\t�m�W\t���Z");
						System.out.println(num + "\t" + name[num - 1] + "\t" + grade[num - 1]);
					}
					else
					{
						System.out.println("�d�L���!");
					}
					break;
				case -1:
					exit = true;
					break;
				default:
					System.out.println("�L���ﶵ!");
					break;
			}
			if(exit)
			{
				break;
			}
		}
	}
}