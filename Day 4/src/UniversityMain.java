
public class UniversityMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		University u=new University();
		u.closed();
		University.Electronics q=new University.Electronics();
		///q.students();
		///q.teachers();
		q.closes();
		University.Computers c=u.new Computers();
		c.students();
		c.teachers();
		University1 mechanical=new University1()
		{
			public void students()
			{
				System.out.println("All Students of mechanical are suspended");
			}

			@Override
			public void teachers() {
				// TODO Auto-generated method stub
				System.out.println("holidays and search for new college");
			}
			
		};
		mechanical.students();
		mechanical.teachers();
		
	}

}
