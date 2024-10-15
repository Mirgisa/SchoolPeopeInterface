//Create SchoolPeople Interface which have printJobDescription, printPeople, addPerson, removePerson, executeJob functions.
//Create SchoolWorker abstract class implement SchoolPeople
// implement necessarry functions from interface and create required fields
// Create SchoolStudent abstract class implement SchoolPeople
//implement necessarry functions from interface and create required fields
//Create Person class without inheriting anything and have basic peson information(then you will store person list in the abstract classes
//Create FirstGradeStudents extends SchoolStudent
//implement necessarry functions from abstract class and create required fields
//Create  SchoolCleaners extends SchoolWorker
//implement necessarry functions from abstract class and create required fields
// Create  SchoolTeachers extends SchoolWorker
// implement necessarry functions from abstract class and create required fields
//
//        Write your main class to have 1 FirstGradeStudents, 1 SchoolCleaners  and 1 SchoolTeachers
//
//also create 15 people and assign these people to classes.

import java.util.ArrayList;
import java.util.List;

public interface SchoolPeople {
    void printJobDescription();
    List<Person> printPeople();
    void addPerson(Person person);
    void removePerson(Person person);
    void executeJob();
}
abstract class SchoolWorker implements SchoolPeople{
    protected List<Person> workers = new ArrayList<>();
    @Override
    public void addPerson(Person person) {
        workers.add(person);
    }

    @Override
    public void removePerson(Person person) {
        workers.remove(person);
    }

    @Override
    public List<Person> printPeople() {
        System.out.println("Workers: ");
        for (Person worker : workers) {
            System.out.println(worker);
        }
        return null;
    }
}
abstract class SchoolStudent implements SchoolPeople{
    protected List<Person> students = new ArrayList<>();
    @Override
    public void addPerson(Person person) {
        students.add(person);
    }

    @Override
    public void removePerson(Person person) {
        students.remove(person);
    }

    @Override
    public List<Person> printPeople() {
        System.out.println("Students: ");
        for (Person student : students) {
            System.out.println(student);
        }
        return null;
    }
}
class Person{
    String name;
    int age;
    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
class FirstGradeStudents extends SchoolStudent{

    private String grade;

    public FirstGradeStudents() {
        this.grade = "First Grade";
    }

    @Override
    public void printJobDescription() {
        System.out.println("First-grade students attend classes and learn basic subjects.");
    }

    @Override
    public void executeJob() {
        System.out.println("First-grade students are studying!");
    }
}
class SchoolCleaners extends SchoolWorker{


    @Override
    public void printJobDescription() {
        System.out.println("School cleaners maintain the cleanliness of the school.");
    }

    @Override
    public void executeJob() {
        System.out.println("School cleaners are cleaning the school!");
    }
}
class SchoolTeachers extends SchoolWorker{


    @Override
    public void printJobDescription() {
        System.out.println("School teachers teach students and help them learn new things.");
    }

    @Override
    public void executeJob() {
        System.out.println("School teachers are teaching!");
    }
}
