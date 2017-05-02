package lambdas;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lambdas
{
    public static void main(String[] args)
    {
        List<Person> people = new ArrayList<>();
        Person person1 = new Person("Reem", "Alharbi", 22);
        Person person2 = new Person("Nathan", "Callahan", 24);
        Person person3 = new Person("Luke", "Moss", 28);
        Person person4 = new Person("Scott", "Strothmann", 31);
        people.add(person1);
        people.add(person2);
        people.add(person3);
        people.add(person4);
        
        //lamdba expression (functional operation)
        Collections.sort(people, (Person p1, Person p2) -> {
            return p1.getAge().compareTo(p2.getAge());
        });
        
        //lamdba expression (functional operation)
        people.forEach((person) -> {
            System.out.println(person.getFirstName());
        });
    }
}

class Person
{
    int age;
    String first, last;
    
    public Person(String first, String last, int age)
    {
        this.first = first;
        this.last = last;
        this.age = age;
    }
    
    public Integer getAge()
    {
        return age;
    }
    
    public String getFirstName()
    {
        return first;
    }
}