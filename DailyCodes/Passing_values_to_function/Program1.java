
import java.util.*;
class Add{
	static void add(int a,int b){
		int ans=a+b;
		System.out.println(ans);
	}
	public static void main(String[] abhi){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter int values : ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		add(a,b);
	}
}
