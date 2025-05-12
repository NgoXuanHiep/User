
import org.junit.Test;
import static org.junit.Assert.*;
import com.mycompany.student.Student;

public class StudentTest {

    @Test
    public void testStudentConstructor() {
        Student student = new Student("S001", "An", 20);
        assertEquals("S001", student.getStudentId());
        assertEquals("An", student.getName());
        assertEquals(20, student.getAge());
    }

    @Test
    public void testSetAge() {
        Student student = new Student("S002", "Bình", 18);
        student.setAge(22);
        assertEquals(22, student.getAge());
    }

    @Test
    public void testUpdateName() {
        Student student = new Student("S003", "Cường", 21);
        student.updateName("Cường Nguyễn");
        assertEquals("Cường Nguyễn", student.getName());
    }
}
