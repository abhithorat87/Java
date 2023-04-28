//Print the countdown of days

class CountDown{
        public static void main(String[] abhi){
		int day=-1;
		if(day>0){
			while(day!=0){
				System.out.println(day+" Days assignment is remaining");
				day--;
			}
		}else if(day==0)
			System.out.println("0 days assignment id overdue");
		else
			System.out.println("Wrong day");
        }
}

