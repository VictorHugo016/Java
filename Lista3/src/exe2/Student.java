package exe2;

public class Student {
    private int ID;
    private String name;

    public Student() {
    }

    public Student(int ID, String name) {
        this.setID(ID);
        this.setName(name);
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                '}';
    }
}
