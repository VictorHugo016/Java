package exe2;

import java.util.Date;
import java.util.List;

public class Loan {
    private Date date;
    private List<LoanItem> items;
    private Student student;

    public Loan() {
        this.items = new ArrayList<LoanItem>();
        this.date = new Date();
    }
        this.date = new Date();
        this.student = student;
    }

    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Loan{" +
                ", date=" + date +
                '}';
    }
}
