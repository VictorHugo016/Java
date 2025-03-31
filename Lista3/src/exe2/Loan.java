package exe2;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class Loan {
    private int ID;
    private Date date;
    private List<LoanItem> items;

    private Student student;

    public Loan() {
        this.items = new ArrayList<LoanItem>();
        this.student = student();
        this.date = new Date();
    }

    public Loan(int ID, Date date) {
        this.ID = ID;
        this.date = new Date();
        this.student = student;
        this.items = new ArrayList<LoanItem>;
    }

    public int getID() {
        return ID;
    }

    public Date getDate() {
        return date;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Loan{" +
                "ID=" + ID +
                ", date=" + date +
                '}';
    }
     public void addLoanItem(int ID, int daysLoaned, Book book){

     }

}
