 class Print
 {
	 public String delimeter="";
	 public void A(){
		System.out.println(delimeter);
		System.out.println("A");
		System.out.println("A");
	}
	public void B(){
		System.out.println(delimeter);
		System.out.println("B");
		System.out.println("B");
	}
 }
 
 class MyOOP 
{
	public static void main(String[] args) 
	{
		Print p1=new Print();
		p1.delimeter="--------";
		p1.A();
		p1.B();
		Print p2=new Print();
		p2.delimeter="*******";
		p2.A();
		p2.A();
		p2.B();
		p1.A();
		
	}
	
}
