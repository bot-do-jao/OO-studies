package MetodosDomain;

public class University {
	private String name;
	private Professor[] professors;
	
	public University(String name) {
		this.name = name;
	}

	public University(String name, Professor[] professors) {
		this.name = name;
		this.professors = professors;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Professor[] getProfessors() {
		return professors;
	}

	public void setProfessors(Professor[] professors) {
		this.professors = professors;
	}
	
	public void construct() {
		System.out.println(this.name);
		if (professors != null) {
			for (Professor professor : professors) {
				System.out.println(professor.getName());
			}
		}
	}
	
}
