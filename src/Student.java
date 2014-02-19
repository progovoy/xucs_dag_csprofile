/**
 * @author Christopher Bell
**/

public class Student {
	private int idNumber;
	private String lastName;
	private String firstName;
	private char gender;
	private String ethnicity;
	private	String race;
	private String maritalStatus;
	private String major;
	private String majorDept;
	private String DOB;
	private String homeZip;
	private String highSchool;
	private String highSchoolZip;
	private String highSchoolGPA;
	private String highSchoolRank;
	private int actScore;
	private int satScore;
    private Transcript transcript;
    
    public Student() {
        this.idNumber       = 900099999;
        this.lastName       = "Smithy";
        this.firstName      = "Awesome";
        this.gender         = 'M';
        this.ethnicity      = "Everything";
        this.race           = "Everything";
        this.maritalStatus  = "Single";
        this.major          = "Computer Awesome Science";
        this.majorDept      = "The Great Computer Science Dept";
        this.DOB            = "1/18/1993";
        this.homeZip        = "70119";
        this.highSchool     = "Riverdale High School";
        this.highSchoolZip  = "70119";
        this.highSchoolGPA  = "4";
        this.highSchoolRank = "1";
        this.actScore       = 99999;
        this.satScore       = 99999;
        transcript          = new Transcript();
    }
    

    // This function should be called when the student has all the given values.
	public Student(int newIdNumber, String newLastName, String newFirstName,
                   char newGender, String newEthnicity, String newRace,
                   String newMaritalStatus, String newMajor, String newMajorDept,
                   String newDOB, String newHomeZip, String newHighSchool,
                   String newHighSchoolZip, String newHighSchoolGPA,
                   String newHighSchoolRank, int newActScore, int newSatScore) {
        this.idNumber       = newIdNumber;
        this.lastName       = newLastName;
        this.firstName      = newFirstName;
        this.gender         = newGender;
        this.ethnicity      = newEthnicity;
        this.race           = newRace;
        this.maritalStatus  = newMaritalStatus;
        this.major          = newMajor;
        this.majorDept      = newMajorDept;
        this.DOB            = newDOB;
        this.homeZip        = newHomeZip;
        this.highSchool     = newHighSchool;
        this.highSchoolZip  = newHighSchoolZip;
        this.highSchoolGPA  = newHighSchoolGPA;
        this.highSchoolRank = newHighSchoolRank;
        this.actScore       = newActScore;
        this.satScore       = newSatScore;
	}

}
