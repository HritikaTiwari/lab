package collectionEx;

class ThreadEx implements Runnable
{
	public void run()
	{
		for(int i=1;i<10;i++)
		{
			System.out.println("Thread");
		}
	}
}
 class Tesst {
public static void main(String[] args)
{
	ThreadEx t =new ThreadEx();
	Thread t1= new Thread(t);
	t1.start();
}
}
