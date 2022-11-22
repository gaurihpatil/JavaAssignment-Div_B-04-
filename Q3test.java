public class Q3test {
public static void  main(String[] args){
    Q3 assignment1 = new Q3("abc",20,15);
    assignment1.calculateGrade();
    System.out.println("Assignment 1 results : \nStudent Mark : " + assignment1.getStudentMark() + "\nGrade : " + assignment1.getGrade());
}
}