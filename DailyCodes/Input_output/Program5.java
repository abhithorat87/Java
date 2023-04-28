import java.io.*;
class Demo2{
	public static void main(String[] args)throws IOException{
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		System.out.println("Enter Name : ");
		String name=br.readLine();

		System.out.println("Your name : "+name);

		System.out.println("Enter Age : ");
                int Age=Integer.parseInt(br.readLine());

		System.out.println("Your age : "+Age);

	}
}
