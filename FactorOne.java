import java.util.Scanner;
public class FactorOne {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = in.nextInt();
		
//	int n = Integer.parseInt(System.console().readLine());
	for(int factor=2;factor<= Math.sqrt(n);factor++)
	{
		if((n%factor) == 0)
		{
			System.out.println(+ factor);
			//n=n/factor;
		}
	}
	}
}



