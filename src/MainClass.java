import java.util.ArrayList;
import java.util.List;

public class MainClass{
    public static void main(String[] args) {
        FirstGradeStudents firstGradeStudents = new FirstGradeStudents("Informatics",3.4);
        SchoolCleaners cleaner = new SchoolCleaners("Cleaner");
        SchoolWorker teacher = new SchoolTeachers("Teacher");

        firstGradeStudents.getGrade();
        cleaner.removePerson();
        teacher.addPerson();
        List<Person> people = new ArrayList<>();
        for (int i = 1)
    }
    
}
