public class CollegeStudent extends Student{
    
    private String major;
    private int year;

    public CollegeStudent(String name, int age, String gender, String idNum, double gpa, String major1, int year1){

        super(name, age, gender, idNum, gpa);

        major = major1;
        year = year1;
    }

    public String getMajor(){
        return major;
    }
    public void setMajor(String major){
        this.major = major;
    }
    public void setYear(int year){
        this.year = year;
    }
    public int getYear(){
        return year;
    }

    public String toString(){
       
        return super.toString() + ",major: " + major + "year:" + year + ", is a teacher!";
    }
}
