package entities;

public class Student {

	public String name;
	public double grade1;
	public double grade2;
	public double grade3;

	public double finalGrade() {
		return grade1 + grade2 + grade3;
	}

	public double missingPoints() {

		if (finalGrade() < 60) {
			return 60 - finalGrade();
		} else {
			return 0.0;
		}

	}

	public String situation() {

		if (missingPoints() != 0.0) {
			return "FAILED\nFALTARAM " + String.format("%.2f", missingPoints()) + " PONTOS";
		} else {
			return "PASS";
		}

	}

}