import java.io.*;
import java.util.Scanner;

class Week2hw3
{
	public static void main(String[] args)
	{
		String name;
		int[] birthdate = new int[3];
		Scanner s = new Scanner(System.in);
		System.out.println("�п�J�m�W : ");
		name = s.nextLine();
		System.out.println("�п�J�X�ͦ~���(�褸) : ");
		birthdate[0] = s.nextInt();
		birthdate[1] = s.nextInt();
		birthdate[2] = s.nextInt();
		System.out.println("�m�W : " + name);
		System.out.println("�X�ͤ�� : " + "����" + (birthdate[0] - 1911) + "�~" + birthdate[1] + "��" + birthdate[2] + "��");
	}
}