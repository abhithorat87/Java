

class Demo{
	public static void main(String[] abhi){
		Demo obj=new Demo();
		obj.fun(10);
		obj.fun(10.5f);
		obj.fun('A');
	}
	void fun(float x){
		System.out.println("In main");
		System.out.println(x);
	}
}
