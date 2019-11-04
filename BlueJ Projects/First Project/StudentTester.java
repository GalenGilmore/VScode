
public class StudentTester
{
    public static void main (String[] args){
        
        Student student1 = new Student();
        student1.addAssignment(8, 10);
        student1.addAssignment(10, 10);
        System.out.println(student1);
        
        
        Student student2 = new Student("Galen Gilmore");
        student2.addAssignment(11, 10);
        student2.addAssignment(12, 10);
        System.out.println(student2);
        
    }
}
