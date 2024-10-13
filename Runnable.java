package multithread;
class A1 extends Thread
{
	public void run()
	{
		for(int i=0;i<=5;i++)
		{
			System.out.println(Thread.currentThread().getName());
		}
	}
}

public class Runnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  A1 ob=new A1();
  Thread t1=new Thread(ob);
  t1.start();
  for(int i=0;i<5;i++)
  {
	  System.out.println(Thread.currentThread().getName());
  }
  
	}

}
