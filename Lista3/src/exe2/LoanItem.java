package exe2;
import exe2.Book;

public class LoanItem {
    private int ID, loanItem;

    private Book book;

    public LoanItem() {
    this.book = new Book();
    }
    public LoanItem(int ID, int loanItem) {
        this.setID(ID);
        this.setLoanItem(loanItem);
    }

    public int getID() {
        return ID;
    }

    public int getLoanItem() {
        return loanItem;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setLoanItem(int loanItem) {
        this.loanItem = loanItem;
    }

    @Override
    public String toString() {
        return  book +
                "\nLoanItem{" +
                "ID=" + ID +
                ", loanItem=" + loanItem +
                '}';
    }
}
