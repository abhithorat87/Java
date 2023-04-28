/*
 WAP in which student should enter marks of 5 different subjects.If all subjectshaving above passing marks add them and provide to switch case to print grades (first class ,second class),if student get fail in any subject program should print "You fail in exam"

 */

import java.util.Scanner;
class SwitchDemo{
	public static void main(String[] abhi){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter subject 1 marks : ");
		int sub1=sc.nextInt();
		System.out.println("Enter subject 2 marks : ");
                int sub2=sc.nextInt();
		System.out.println("Enter subject 3 marks : ");
                int sub3=sc.nextInt();
		System.out.println("Enter subject 4 marks : ");
                int sub4=sc.nextInt();
		System.out.println("Enter subject 5 marks : ");
                int sub5=sc.nextInt();
		int sum=0;
		if(sub1>=36 && sub2>=36 && sub3>=36 && sub4>=36 ||sub5>36){
			sum=sub1+sub2+sub3+sub4+sub5;
			switch(sum){
				case sum>
			
			}
		}
	}
}
