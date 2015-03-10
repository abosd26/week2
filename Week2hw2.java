class Week2hw2
{
	public static void main(String[] args)
	{
		int[] num = {1, 2, 3, 4, 5, 6, 7};
		int sum = 0;
		double average;
		for(int i : num)
		{
			sum += i;
		}
		average = sum / num.length;
		System.out.println("sum : " + sum);
		System.out.println("average : " + average);
	}
}