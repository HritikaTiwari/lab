package collectionEx;

class ThreadExx extends Thread
{
	public void run()
	{
		for(int i=1;i<10;i++)
		{
			System.out.println("User Thread"+ Thread.currentThread());
		}
	}
}
 class ttest {
public static void main(String[] args)
{
	ThreadExx t= new ThreadExx();
	for(int i=1;i<10;i++)
	{
		Thread.currentThread().setName("dontsleep");
		Thread.currentThread().setPriority(10);
		System.out.println("Main Thread"+ Thread.currentThread());
	}

}
}
