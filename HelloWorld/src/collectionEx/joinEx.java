package collectionEx;
class test6 extends Thread
{
	public void run()
	{
		for(int i=1;i<10;i++)
		{
			System.out.println("child Thread");
		}
	}
}
public class joinEx {
	public static void main(String[] args) throws InterruptedException
	{
		test6 t1= new test6();
		t1.start();
		t1.join();
		for(int i=1;i<10;i++)
		{
			
			System.out.println("Main Thread");
		}

	}
	}

