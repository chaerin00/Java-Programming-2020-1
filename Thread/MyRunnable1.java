class MyRunnable1 implements Runnable 
{
	public void run(){
		int sum=0;
		for(int i=10;i>=0;i--){
			sum=sum+i;
			System.out.println("An"+i+" ");
		}
		System.out.println("An-SUM"+sum+" " );
	}
}
