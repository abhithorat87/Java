// InputStreamReader

import java.io.*;
class Demo{
        public static void main(String[] abhi)throws IOException{
                InputStreamReader isr=new InputStreamReader(System.in);
		System.out.println("Enter char : ");
		int ch=isr.read();
                System.out.println(ch);
        }
}

