class Company 
{
	Manager chaerin;
	Employee Yoon,Yong,ik;
	Employee employees[];

	public Company(){
		chaerin=new Manager("An chaerin","1912360","IT����");
		Yoon=new Employee("Yoon","00000");
		Yong=new Employee("Yong","11111");
		ik=new Employee("ik","22222");

		employees=new Employee[4];
		employees[0]=chaerin;
		employees[1]=Yoon;
		employees[2]=Yong;
		employees[3]=ik;

	}
	public void makeMoney(){
		int n=employees.length;
		for(int i=0;i<n;i++){
			employees[i].work();
		}
	}

	public static void main(String[] args) 
	{
		Company mycom=new Company();
		mycom.makeMoney();
	}
}
