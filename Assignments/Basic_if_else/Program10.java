//Real time example

class Demo{
        public static void main(String[] abhi){
		int tenthmarks=82;
		int twelthmarks=58;
		if(tenthmarks>=60 && twelthmarks>=60){
			System.out.println("You are eligible for placements");
		}else if(tenthmarks>100 || tenthmarks<0 || twelthmarks<0 || twelthmarks>100){
                        System.out.println("You Enter wrong data");
                }else
			System.out.println("You are not eligible for placements");
        }
}

