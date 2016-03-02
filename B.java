class A
{
	int a=0,b=0;
	public void add(int a, int b)
	{
		System.out.println("Add = "+(a+b));
	}
}

class B extends A
{
	int x=20,y=10;
	public void Sub(int x, int y)
	{
		System.out.println("Sub = "+(x+y));
	}
	public static void main(String []args)
	{
		B ob =new B();
		System.out.println("======================By useing B Class Object==============");
		ob.add(ob.x,ob.y);
		ob.Sub(ob.x,ob.y);
		System.out.println("======================By useing A Class Object==============");
		A ob1= new A();
		ob1.add(ob.x,ob.y);
		//ob1.Sub(ob.x,ob.y);
	}
	
}