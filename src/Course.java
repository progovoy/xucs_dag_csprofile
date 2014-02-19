/**
 * @authors Christopher Bell, Nick Schello
**/

import java.util.ArrayList;
import java.util.Scanner; 
import java.io.File;

public class Course {
	private int idNumber;		// Student's ID Number
	private int termNumber;		// Date and semester taken
	private String subject;		// Topic of course		
	private String courseNumber;  	// Identifies course
	private int hours;            	// Credit hours the course is worth 
	private char midTermGrade;	// Mid term grade
	private char finalGrade;	// Final Grade 
	private int gradeValue; //Integer Value of final grade
	
	public Course(int id, int termNum, String sub, String courseNum, int hours, char mid, char fin) {
		this.idNumber       = id;
		this.termNumber     = termNum;
		this.subject        = sub;
		this.courseNumber   = courseNum;
		this.hours          = hours;
		this.midTermGrade   = mid;
		this.finalGrade     = fin;
		this.gradeValue     = ' ';
	}

	public int calculateGradeValue(Course a) {
		if (a.finalGrade == 'A')
			a.gradeValue = 4;
		else if(a.finalGrade == 'B')
			a.gradeValue = 3;
		else if(a.finalGrade == 'C')
			a.gradeValue = 2;
		else if(a.finalGrade == 'D')
			a.gradeValue = 1;
		else if(a.finalGrade == 'F')
			a.gradeValue = 0;
		return a.gradeValue;
	}
    
	public int getIdNumber() {
		return idNumber;
	}
    
	public int getTermNumber() {
		return termNumber;
	}
    
	public String getSubject() {
		return subject;
	}
    
	public String getCourseNum() {
		return courseNumber;
	}
    
	public int getHours() {
		return hours;
	}
    
	public char getMidTermGrade() {
		return midTermGrade;
	}
    
	public char getFinalGrade() {
		return finalGrade;
	}
    
	public int getGradeValue() {
		return gradeValue;
	}

	public boolean isNumber(String str) {  
		try {
			double d = Double.parseDouble(str);
		}catch(NumberFormatException n){
			return false;
		}
		return true;  
	}
    
	public void setGradeValue(int x) {
		gradeValue = x;
	}
    
	public void print() {
		System.out.println("ID: "+idNumber);
		System.out.println("Term: "+termNumber);
		System.out.println("Subject: "+subject);
		System.out.println("Course: "+courseNumber);
		System.out.println("Hours: "+hours);
		System.out.println("MidTerm Grade: "+midTermGrade);
		System.out.println("Final Grade: "+finalGrade);
		System.out.println("Final Grade Value: "+gradeValue);
	}
    
    public void readCourse(File fileName) {
    	try {
    		Scanner input = new Scanner(fileName);
    		ArrayList<String> placeHolder = new ArrayList<String>();
    		while(input.hasNext()) {
    			placeHolder.add(input.nextLine());
    		}
    	}catch(Exception e) {
    		System.err.println("Error reading course file.");
    	}
    }
	
	public boolean validateCourse() {

		if(!validateIdNumber())
			return false;
		else if(!validateTermNumber())
			return false;
		else if(!validateSubject())
			return false;
		else if(!validateCourseNumber())
			return false;
		else if(!validateHours())
			return false;
		else if(!validateMidTermGrade())
			return false;
		else if(!validateFinalGrade())
			return false;
		else
			return false;
	}
	
	public boolean validateCourseNumber() {
		if(isNumber(courseNumber))
			return true;
		else
			return false;
	}

	public boolean validateFinalGrade() {
		if(finalGrade =='A' || finalGrade =='B' || finalGrade =='C' ||
			finalGrade =='D' || finalGrade =='F' || finalGrade =='W' ||
			finalGrade =='I')
			return true;
		else
			return false;
	}

	public boolean validateHours() {
		if(hours >= 1 && hours <= 4)
			return true;
		else
			return false;
	}

	public boolean validateIdNumber() {
		if(idNumber > 999999999 || idNumber < 900000000)
			return false;
		else
			return true;
	}


	public boolean validateMidTermGrade() {
		if(midTermGrade =='A' || midTermGrade =='B'|| 
			midTermGrade == 'C' || midTermGrade == 'D' ||
			midTermGrade == 'F' || midTermGrade == 'W')
			return true;
		else
			return false;
	}

	public boolean validateSubject() {

		return true;
	} 

	public boolean validateTermNumber() {

		return true;
	}
}

