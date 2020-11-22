
public class ThreadMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Thread t1= new Thread();
		ThreadFunction tf=new ThreadFunction()
				{
					public void run()
					{
						System.out.println("hello world");
					}
				};
		tf=()	->{
				for(int i=0;i<3;i++)
				{
					System.out.println(i);
				}
				};
				tf.run();
	}

}
