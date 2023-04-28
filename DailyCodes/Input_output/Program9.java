
import java.io.*;
class Beulding{
	public static void main(String[] abhi)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Beulding name : ");
		String name=br.readLine();

		System.out.println("Enter wing name : ");
		char ch=(char)br.read();

		br.skip(1);

		System.out.println("Enter flat number : ");
		int flat=Integer.parseInt(br.readLine());

		System.out.println("Your beulding name is : "+name);
		System.out.println("Your wing is : "+ch);
		System.out.println("Your flat number is : "+flat);
	}
}
