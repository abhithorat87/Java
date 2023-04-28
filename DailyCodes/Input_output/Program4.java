// InputStreamReader

import java.io.*;
class Demo1{
        public static void main(String[] abhi)throws IOException{
                InputStreamReader isr=new InputStreamReader(System.in);
		System.out.println("Enter char : ");
		char ch=(char)isr.read();
                System.out.println(ch);
        }
}

