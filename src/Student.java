public class Student extends Person {
    String course;

    public void study(){
        System.out.println("Student study");
    }
    public String toString(){
        return "Student name: "+name+" email: "+email+" course: "+course;
    }
}
