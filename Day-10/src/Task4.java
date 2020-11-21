import java.util.Date;

public class Task4 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d=new Date(22,10,2020);
		Date d1=new Date(20,10,2020);
		System.out.println(d.after(d1));
		System.out.println(d.before(d1));
		System.out.println(d.equals(d1));
		System.out.println(d.getTime());
		System.out.println(d.toInstant());
		System.out.println(d1.getDay());
		System.out.println(d1.toLocaleString());
		System.out.println(d.toGMTString());
		}

}
