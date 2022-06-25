package DevDojo;

public class Teacher {
	private String name;
	private String specialty;
	private Seminar[] seminar;
	
	public Teacher(String name, String specialty) {
		this.name = name;
		this.specialty = specialty;
	}
	
	public Teacher(String name, String specialty, Seminar[] seminar) {
		this.name = name;
		this.specialty = specialty;
		this.seminar = seminar;
	}
	
	public Seminar[] getSeminar() {
		return seminar;
	}


	public void setSeminar(Seminar[] seminar) {
		this.seminar = seminar;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSpecialty() {
		return specialty;
	}

	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}
	
	
}
