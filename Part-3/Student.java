public class Student{
    private int nextStudentCounter = 1;
    private int studentId;
    private String name;

    public Student(String name){
        this.studentId = nextStudentCounter++;
        this.name = name;
    }

    public int studentId(){
        return studentId;
    }

    public String name(){
        return name;
    }
    
    public void displayDetails(){
        System.out.println("Student ID: "+studentId+", Name: "+name);
    }
}