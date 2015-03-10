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
	double Pie(int degree)
	{
		return 3.14 * r * r * degree / 360;
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
	double Pie(int degree)
	{
		return 3.14 * r * r2 * degree / 360;
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
			System.out.println("請輸入 1)新增橢圓 2)查看所有橢圓 3)查看扇形面積 -1)離開 : ");
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
						System.out.println("請輸入角度 : ");
						d = s.nextInt();
						if(d > 0 && d <= 360)
						{
							System.out.println("編號\t半長軸\t半短軸\t角度\t扇形面積");
							System.out.println(num + "\t" + o.get(num - 1).r + "\t" + o.get(num - 1).r2 + "\t" + d + "\t" + nf.format(o.get(num - 1).Pie(d)));
						}
						else
						{
							System.out.println("角度錯誤!");
						}
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

