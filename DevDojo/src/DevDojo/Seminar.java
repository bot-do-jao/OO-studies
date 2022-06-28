package DevDojo;

public class Seminar {
	private String subject;
	private Local local;
	private Student[] students;
	private Teacher teacher;
	
	public Seminar(String subject, Local local) {
		this.subject = subject;
		this.local = local;
	}

	public Seminar(String subject, Local local, Teacher teacher) {
			this.subject = subject;
			this.local = local;
			this.teacher = teacher;
		}
	
	public Seminar(String subject, Local local, Student[] students, Teacher teacher) {
		this.subject = subject;
		this.local = local;
		this.students = students;
		this.teacher = teacher;
	}

	public void construct() {
		System.out.println("Subject: "+ this.subject);
		if (local != null) {
			System.out.println("Address: " + local.getAddress());
		}
		if(students != null) {
			System.out.println("Subscribed students: " + students.length);
			for (Student student : students) {
				System.out.println("Student name: " + student.getName());
			}
		}
		if(teacher != null) {
			System.out.println("Assigned teacher: " + teacher.getName());
			System.out.println("Teacher's specialty: " + teacher.getSpecialty());
		}
	}
	
	public String getSubject() {
		return subject;
	}

	
	public void setSubject(String subject) {
		this.subject = subject;
	}

	public Local getLocal() {
		return local;
	}

	public void setLocal(Local local) {
		this.local = local;
	}

	public Student[] getStudents() {
		return students;
	}

	public void setStudents(Student[] students) {
		this.students = students;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	
	
}
