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
    void executeJob(Person person);

    void printJobDescription();
    List<Person> printPeople();
    void addPerson();
    void removePerson();

    void addPerson(Person person);

    void removePerson(Person person);

    void executeJob();

}
abstract class SchoolWorker implements SchoolPeople{
    protected List<Person> people;
  //  protected String name;
    protected String jobTittle;
    public SchoolWorker( String jobTittle){
        this.jobTittle = jobTittle;
       // this.name = name;
        this.people = new ArrayList<>();
    }

    public String getJobTittle() {
        return jobTittle;
    }

    @Override
    public List<Person> printPeople() {
        return List.of();
    }

    @Override
    public void addPerson(Person person) {
        people.add(person);
        System.out.println("New School Workers :"+person.name+" "+ person.age);
    }

    @Override
    public void removePerson(Person person) {
        people.remove(person);
        System.out.println("The School Worker "+person.getName()+ " is Fired from work");

    }

    @Override
    public void executeJob(Person person) {
        System.out.println(person + " is Our worker");

    }

    @Override
    public void printJobDescription() {

    }
}
abstract class SchoolStudent implements SchoolPeople{
    protected List<Person> student;
    protected String department;
    protected double grade;
    public SchoolStudent( String department, double grade){
        this.department = department;
        this.grade = grade;
        this.student = new ArrayList<>();
    }

    public List<Person> getStudent() {
        return student;
    }

    public double getGrade() {
        return grade;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public void addPerson(Person person) {
        System.out.println("Student"+person.getName()+ " is added");
    }

    @Override
    public void removePerson() {

    }

    @Override
    public List<Person> printPeople() {
        return List.of();
    }

    @Override
    public void printJobDescription() {

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

    public FirstGradeStudents(String department, double grade) {
        super(department, grade);
    }

    @Override
    public void executeJob(Person person) {

    }

    @Override
    public void addPerson() {

    }

    @Override
    public void removePerson(Person person) {

    }

    @Override
    public void executeJob() {

    }
}
class SchoolCleaners extends SchoolWorker{

    public SchoolCleaners(String jobTittle) {
        super(jobTittle);
    }

    @Override
    public void addPerson() {

    }

    @Override
    public void removePerson() {

    }

    @Override
    public void executeJob() {

    }
}
class SchoolTeachers extends SchoolWorker{

    public SchoolTeachers(String jobTittle) {
        super(jobTittle);
    }

    @Override
    public void addPerson() {

    }

    @Override
    public void removePerson() {

    }

    @Override
    public void executeJob() {

    }
}
