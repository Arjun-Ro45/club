import java.io.*;
public class BuffEx
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the radius:");
		double r= Double.parseDouble(reader.readLine());
		double area=3.14*r*r;
		System.out.println("area is :"+area);
	}
}