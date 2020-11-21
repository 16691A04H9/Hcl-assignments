
public class ParentClass {
	int a=67;
}
class subex extends ParentClass
{
	int a=87;
	public void display()
	{
		int a=77;
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(super.a);
	}
	public static void main(String args[])
	{
		subex e=new subex();
		e.display();
	}
}