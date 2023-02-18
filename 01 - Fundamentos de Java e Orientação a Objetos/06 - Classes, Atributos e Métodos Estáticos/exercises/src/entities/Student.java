package entities;

public class Student {
	
	private String name;
	private double gradeA;
	private double gradeB;
	private double gradeC;
	
	public Student() {
	}

	public Student(String name, double gradeA, double gradeB, double gradeC) {
		this.name = name;
		if(gradeA > 0 && gradeA <= 30) {
			this.gradeA = gradeA;
		}
		if(gradeB > 0 && gradeB <= 35) {
			this.gradeB = gradeB;
		}
		if(gradeC > 0 && gradeC <= 35) {
			this.gradeA = gradeB;
		}
	}

	public double getGradeA() {
		return gradeA;
	}

	public void setGradeA(double gradeA) {
		this.gradeA = gradeA;
	}

	public double getGradeB() {
		return gradeB;
	}

	public void setGradeB(double gradeB) {
		this.gradeB = gradeB;
	}

	public double getGradeC() {
		return gradeC;
	}

	public void setGradeC(double gradeC) {
		this.gradeC = gradeC;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double gradeFinal() {
		return gradeA + gradeB + gradeC;
	}
	
}
