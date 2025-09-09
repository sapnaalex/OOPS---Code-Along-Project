public class Course{
    private static int nextCourseIdCounter = 101;
    private int courseId;
    private String courseName;

    public Course(String courseName){
        this.courseId = nextCourseIdCounter++;
        this.courseName = courseName;
    }

    public int courseId(){
        return courseId;
    }

    public String courseName(){
        return courseName;
    }

    public void displayDetails(){
        System.out.println("Course ID: C"+courseId+", Name: "+courseName);
    }
}