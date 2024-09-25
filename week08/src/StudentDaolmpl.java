import java.util.ArrayList;
import java.util.List;

public class StudentDaolmpl  implements StudentDao{

    //list is working as a database
    List<Student> students;

    public StudentDaolmpl(){
        students = new ArrayList<Student>();
        Student student1 = new Student("Amal",0);
        Student student2 = new Student("John", 1);
        students.add(student1);
        students.add(student2);


    }

    @Override
    public void deleteStudent(Student student){
        students.remove(student.getRollNo());
        System.out.println("Student: Roll No" + student.getRollNo()+", deleted from the database");
    }

    //retrive list of students from the database
     @Override
    public List<Student> getAllStudents(){
        return students;
     }

     @Override
    public  Student getStudent(int rollNo){
        return students.get(rollNo);
     }

     @Override
    public void updateStudent(Student student){
         System.out.println("Student: Roll No "+ student.getRollNo()+",updated in the database");
     }
}
