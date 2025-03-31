import exe2.Student;
import exe2.Book
import exe2.Loan;

public class MainExe2 {
    public static void main(String[] args) {
        Student s1=new Student(1,"joão");

        Loan l1 = new Loan(11, s1);

        Book b1=new Book(1,"java", "a");
        Book b2=new Book(2,"JS", "b");
        Book b3=new Book(3,"python", "c");
    }
}
