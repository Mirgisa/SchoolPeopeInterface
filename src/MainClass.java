import java.util.ArrayList;
import java.util.List;

public class MainClass{
    public static void main(String[] args) {
        FirstGradeStudents firstGradeStudents = new FirstGradeStudents();
        SchoolCleaners cleaner = new SchoolCleaners();
        SchoolTeachers teacher = new SchoolTeachers();

        List<Person> people = new ArrayList<>();
        for (int i = 1;i<=15; i++){
            people.add(new Person("Person"+i, 20+i));
        }
        for(int i = 0; i<5; i++){
            firstGradeStudents.addPerson(people.get(i));
        }
        for(int i = 5; i<10; i++){
            cleaner.addPerson(people.get(i));
        }
        for(int i = 10; i<15; i++){
            teacher.addPerson(people.get(i));
        }
        firstGradeStudents.addPerson(people.get(0));
        cleaner.addPerson(people.get(1));
        teacher.addPerson(people.get(2));



        System.out.println("Job Descriptions");
        firstGradeStudents.printJobDescription();
        cleaner.printJobDescription();
        teacher.printJobDescription();

        // Execute jobs
        System.out.println("Executing Jobs");
        firstGradeStudents.executeJob();
        cleaner.executeJob();
        teacher.executeJob();


    }
    
}
