import java.util.Scanner;
class Password
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		int start=0;
			int pass = 1234;
			do
			{
				System.out.println("Enter the password");
				int ip = sc.nextInt();
				if (ip==pass)
				{
					System.out.println("Logged in successfully");
					break;
				}
			else
				{
				 System.out.println("Password is incorrect");
				}
				start++;
			}
			while (start<=3);
			if (start>=3)
			{
		        System.out.println("Attempt over");
	}
}
}