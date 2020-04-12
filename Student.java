
class Student {
	String index;
	String firstName;
	String lastName;
	List<Integer> grades;

	//TODO constructor

	public Student(String index, String firstName, String lastName, List<Integer> grades) {
		this.index = index;
		this.firstName = firstName;
		this.lastName = lastName;
		this.grades = grades;
	}

	public void setIndex(String index) {
		this.index = index;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setGrades(List<Integer> grades) {
		this.grades = grades;
	}

	public String getIndex() {
		return index;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public List<Integer> getGrades() {
		return grades;
	}

	//TODO seters & getters

	public double getAverage() {
		//TODO
		return grades.stream().mapToDouble(i->i).average().orElse(0);
	}

	public int ECTSCredits() {
		//TODO
		long count = grades.stream().filter(grade-> grade>=6).mapToDouble(i->i).count();
		return (int)count * 6;

	}
}