class MyRunnable3 implements Runnable 
{
	public void run(){
		int sum=0;
		for(int i=10;i>=0;i--){
			sum=sum+i;
			System.out.println("Lin"+i+" ");
		}
		System.out.println("Lin-SUM"+sum+" " );
	}
}

