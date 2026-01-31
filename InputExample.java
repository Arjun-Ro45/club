import java.util.Scanner;
public class InputExample
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String input=sc.nextLine();
		String[] parts=input.split(",");
		int n1=Integer.parseInt(parts[0].trim());
		int n2=Integer.parseInt(parts[1].trim());
		System.out.println("First Number:"+n1);
		System.out.println("Second Number:"+n2);
		sc.close();
	}
}

		
