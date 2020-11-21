import java.util.Scanner;

public class Task5 {

	enum Planets {
		Mercury, Venus, Earth, Mars, Jupiter, Saturn, Neptune, Uranus, Pluto
	}

	public static void main(String args[]) {
		int i = 1;
		for (Planets q : Planets.values()) {
			System.out.println(i + ". " + q);
			i++;
		}
		Scanner s = new Scanner(System.in);
		int j = s.nextInt();
		System.out.println("enter weight");
		int w=s.nextInt();
		switch (j) {
		case 1:
			Planets p = Planets.Mercury;
			int weight=w*4;
			System.out.println(weight);
			break;
		case 2:
			Planets p1=Planets.Venus;
			int m=w*5;
			System.out.println(m);
			break;
		case 3:
			Planets p2=Planets.Earth;
			System.out.println(w);
			break;
		case 4:
			Planets p3=Planets.Mars;
			int m1=w*6;
			System.out.println(m1);
			break;
		case 5:
			Planets p4=Planets.Jupiter;
			int m2=w*7;
			System.out.println(m2);
			break;
		case 6:
			Planets p5=Planets.Saturn;
			int m3=w*8;
			System.out.println(m3);
			break;
		case 7:
			Planets p6=Planets.Neptune;
			int m4=w*9;
			System.out.println(m4);
			break;
		case 8:
			Planets p7=Planets.Uranus;
			int m5=w*10;
			System.out.println(m5);
			break;
		case 9:
			Planets p8=Planets.Pluto;
			int m6=w*11;
			System.out.println(m6);
			break;
			
		}

	}
}
