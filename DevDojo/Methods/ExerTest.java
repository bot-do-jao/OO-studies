import DevDojo.Local;
import DevDojo.Seminar;
import DevDojo.Student;
import DevDojo.Teacher;

public class ExerTest {
	public static void main(String[] args) {
		Local local = new Local("Konoha");
		Teacher sensei = new Teacher("Kakashi", "picudo");
		Student kouhai = new Student("Konohamaru", 12);
		Student senpai = new Student("Naruto", 16);
		Student[] senpais = {senpai};
		Student[] students = {senpai, kouhai};
		
		Seminar jonin = new Seminar("Jonin course", local,senpais, sensei );
		Seminar genin = new Seminar("Genin application", local, students, sensei);
		
		jonin.construct();
		System.out.println();
		genin.construct();
		
		
		
	}
}
