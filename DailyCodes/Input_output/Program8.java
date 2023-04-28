
import java.io.*;
class Cricket{
	public static void main(String[] abhi)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter player name : ");
		String name=br.readLine();
		
		System.out.println("Enter JerNo : ");
		int jerno=Integer.parseInt(br.readLine());

		System.out.println("Enter average : ");
		float avg=Float.parseFloat(br.readLine());

		System.out.println("Player name is : "+name);
		System.out.println("Player JerNo is : "+jerno);
		System.out.println("Player Average is : "+avg);
	}
}
