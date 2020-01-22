package entities;

public class Student {
	public String name;
	public double firstTrimester;
	public double secondTrimester;
	public double thirdTrimester;
	
	public double finalGrade() {
		return firstTrimester + secondTrimester + thirdTrimester; 
	}
	
	public String finalResult () {
		double finalGrade = finalGrade();
		if (finalGrade >= 60) {
			return "Final result: PASS";
		} 
		else {
			return "Final result: Failed" + String.format("%nMissing %.2f points %n", 60 - finalGrade);
		}
	}
}

