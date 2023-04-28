
/* Methods
  1) Static
  2) Non-Static
 */

class Demo{
	int x=10;
	static int y=20;
	void fun(){
		System.out.println("In fun method");
	}
	static void gun(){
		System.out.println("In gun method");
	}
	public static void main(String[] abhi){
		System.out.println(y);
		Demo obj=new Demo();
		System.out.println(obj.x);
		obj.fun();
		gun();
	}
}
