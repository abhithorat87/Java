
import java.io.*;
class Cricket{
	public static void main(String[] abhi)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter your favorite Batsman Name : ");
		String bat=br.readLine();
		
		System.out.println("Enter your favourite bowler name : ");
		String bowl=br.readLine();

		System.out.println("Your favourite Batsman name is : "+bat);
		System.out.println("Your favourite Bowler name is : "+bowl);
		
	}

}
