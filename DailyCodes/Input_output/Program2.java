import java.util.Scanner;
class DreamCompany{
        public static void main(String[] abhi){
                Scanner sc=new Scanner(System.in);
		System.out.println("Enter your dream company name : ");
                String name=sc.next();
		System.out.println("Enter your dream package : ");
		Float pack=sc.nextFloat();

                System.out.println("Your dream company name is : "+name);
                System.out.println("Your dream package is : "+pack);
        }
}

