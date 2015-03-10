import java.io.*;
import java.util.Scanner;
import java.text.*;
import java.util.*;

class Circle
{
	double r;
	Circle(double r)
	{
		this.r = r;
	}
	double area()
	{
		return 3.14 * r * r;
	}
	double perimeter()
	{
		return 3.14 * r * 2;
	}
}
class Oval extends Circle
{
	double r2;
	Oval(double r, double r2)
	{
		super(r);
		this.r2 = r2;
	}
	double area()
	{
		return 3.14 * r * r2;
	}
	double perimeter()
	{
		return 2 * 3.14 * r2 + 4 * (r - r2);
	}
}
class Week2hw9
{
	public static void main(String[] args)
	{
		NumberFormat nf = NumberFormat.getInstance(); 
		nf.setMaximumFractionDigits( 2 );
		boolean exit = false;
		String temp, temp2;
		int option, num, d;
		ArrayList<Oval> o = new ArrayList<Oval>();
		Scanner s = new Scanner(System.in);
		while(true)
		{
			System.out.println("請輸入 1)新增橢圓 2)查看所有橢圓 3)查看橢圓周長及面積 -1)離開 : ");
			option = s.nextInt();
			switch(option)
			{
				case 1:
					try
					{
						System.out.println("請輸入半長軸 : ");
						temp = s.next();
						System.out.println("請輸入半短軸 : ");
						temp2 = s.next();
						if(Double.parseDouble(temp) > 0 && Double.parseDouble(temp2) > 0)
						{
							if(Double.parseDouble(temp) >= Double.parseDouble(temp2))
							{
								Oval ot = new Oval(Double.parseDouble(temp), Double.parseDouble(temp2));
								o.add(ot);
							}
							else
							{
								System.out.println("錯誤!半長軸須大於等於半短軸!");
							}
						}
						else
						{
							System.out.println("錯誤!半長(短)軸須大於0!");
						}
					}
					catch(Exception e)
					{
						System.out.println("錯誤 : " + e);
					}
					break;
				case 2:
					System.out.println("編號\t半長軸\t半短軸");
					for(int i = 0 ; i < o.size(); i++)
					{
						System.out.println((i + 1) + "\t" + o.get(i).r + "\t" + o.get(i).r);
					}
					break;
				case 3:
					System.out.println("請輸入編號 : ");
					num = s.nextInt();
					if(num <= o.size() && num > 0)
					{
						System.out.println("編號\t半長軸\t半短軸\t周長\t面積");
						System.out.println(num + "\t" + o.get(num - 1).r + "\t" + o.get(num - 1).r2 + "\t" + nf.format(o.get(num - 1).perimeter()) + "\t" + nf.format(o.get(num - 1).area()));
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

