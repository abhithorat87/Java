//Write a java program,in which according to month no print thenumber of days in that month

class Demo{
        public static void main(String[] abhi){
		int N=12;
		if(N==1)
			System.out.println("January has 31 days");
		else if(N==2)
			System.out.println("February has 28-29 days");
		else if(N==3)
			System.out.println("March has 31 days");
		else if(N==4)
			System.out.println("April has 30 days");
		else if(N==5)
			System.out.println("May has 31 days");
		else if(N==6)
			System.out.println("June has 30 days");
		else if(N==7)
			System.out.println("July has 31 days");
		else if(N==8)
			System.out.println("August has 31 days");
		else if(N==9)
			System.out.println("Septeber has 30 days");
		else if(N==10)
			System.out.println("October has 31 days");
		else if(N==11)
			System.out.println("November has 30 days");
		else if(N==12)
			System.out.println("December has 31 days");
		else
			System.out.println("Invalid Month");
        }
}

