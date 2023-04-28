

import java.io.*;
class TryDemo{
        public static void main(String[] abhi)throws IOException{
                BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
                BufferedReader br2=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter your name : ");
		String name=br1.readLine();
		System.out.println("Your name is : "+name);


		br1.close();

		System.out.println("Enter your location : ");
		String loc=br2.readLine();

//		System.out.println("Your name is : "+name);
		System.out.println("Your location is : "+loc);
        }
}

