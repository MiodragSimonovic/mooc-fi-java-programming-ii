
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Employees {
    
    private List<Person> persons;

    public Employees() {
        persons = new ArrayList<Person>();
    }
    
    public void add(Person personToAdd) {
        persons.add(personToAdd);
    }
    
    public void add(List<Person> peopleToAdd) {
        persons.addAll(peopleToAdd);
    }
    
    public void print() {
        persons.stream().forEach(person -> System.out.println(person));
    }
    
    public void print(Education education) {
        Iterator<Person> i = persons.iterator();
        while(i.hasNext()) {
            Person person = i.next();
            if (person.getEducation() == education) {
                System.out.println(person);
            }
        }
    }
    
    public void fire(Education education) {
        Iterator<Person> i = persons.iterator();
        while (i.hasNext()) {
            if (i.next().getEducation() == education) {
                i.remove();
            }
        }
    }
    
}
