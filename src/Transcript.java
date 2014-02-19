/**
  * @authors Christopher Bell, Nick Schello
**/

import java.util.ArrayList;
import java.util.Collections;

public class Transcript {
    private float averageGPA;
    private int numOfTakenCourses;
    private int minimum;
    private int maximum;
    private int stdGpa;
    private int timeTaken;
    private ArrayList<Course> takenCourses;
	private ArrayList<Integer> gradeValues;
	
	public Transcript() {
        takenCourses    = new ArrayList<Course>();
        gradeValues     = new ArrayList<Integer>();
	}
    
    public void calculateAvgGPA() {
        float sum = 0;
        float count = gradeValues.size();
        for(int i=0; i<gradeValues.size(); i++)
            sum = sum + gradeValues.get(i);
        averageGPA = sum/count;
    }
    
    public void calculateMaxGpa() {
        Collections.sort(gradeValues);
        maximum = gradeValues.get(gradeValues.size()-1);
    }
    public void calculateMinGpa() {
    	Collections.sort(gradeValues);
    	minimum = gradeValues.get(0);
    }

    public void calculateCount() {
    	numOfTakenCourses = takenCourses.size();
    }
    public Course getCourse(int courseAtIndex){
    	return takenCourses.get(courseAtIndex);
    }
    public void printGradeValues() {
    	for(int i=0; i<gradeValues.size(); i++)
    		System.out.println("Current gradeset: " + gradeValues.get(i));
    }
    
    public void setCourseData(Course newCourse) {
		takenCourses.add(newCourse);
		gradeValues.add(newCourse.getGradeValue());
    }
}
