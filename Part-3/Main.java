import java.util.*;

public class Main{
    public static void main(String[]args){

        Student s1 = new Student("Sarah");
        Student s2 = new Student("Rhea");

        Course c1 = new Course("OOPS in Java");
        Course c2 = new Course("Mathematical Thinking");

        s1.displayDetails();
        s2.displayDetails();

        c1.displayDetails();
        c2.displayDetails();

        List<AttendanceRecord>attendanceLog = new ArrayList<>();
        

        attendanceLog.add(new AttendanceRecord(s1.studentId(), c1.courseId(), "Present"));
        attendanceLog.add(new AttendanceRecord(s1.studentId(), c2.courseId(), "Present"));
        attendanceLog.add(new AttendanceRecord(s2.studentId(), c2.courseId(), "Absent"));
        attendanceLog.add(new AttendanceRecord(s2.studentId(), c1.courseId(), "Invalid"));

        for(AttendanceRecord record: attendanceLog){
            record.displayRecord();
        }
    }
}