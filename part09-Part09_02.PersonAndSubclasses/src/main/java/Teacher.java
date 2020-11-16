
public class Teacher extends Person {
    
    private int salary;

    public Teacher(String name, String adress, int salary) {
        super(name, adress);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }
    
    @Override
    public String toString() {
        return super.toString() + "\n  salary " + salary + " euro/month";
    }
    
}
