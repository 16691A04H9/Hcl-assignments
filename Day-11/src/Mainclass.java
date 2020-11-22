
public class Mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a1="hello";
		FunctionInterface f=(a)->{System.out.println("length="+a.length);};
		f.strings(a1);
		FunctionInterface f1=(a)->{System.out.println(a+"world");};
		f1.strings(a1);
		
	}

}
