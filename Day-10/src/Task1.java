import java.util.concurrent.PriorityBlockingQueue;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityBlockingQueue<Integer> pbq = new PriorityBlockingQueue<Integer>();

		// add numbers
		pbq.add(1);
		pbq.add(2);
		pbq.add(3);
		pbq.add(4);
		pbq.add(5);

		// print queue
		System.out.println("PriorityBlockingQueue:" + pbq);
	}

}
