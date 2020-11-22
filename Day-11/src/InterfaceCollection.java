import java.util.HashMap;

public class InterfaceCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap hm=new HashMap();
		hm.put(10, 45);
		hm.forEach((a,b)-> System.out.println(a+" "+b));
	}

}
