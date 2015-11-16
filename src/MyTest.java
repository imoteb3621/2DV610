/**
 * @author taner on 2015-11-16.
 */
import junit.framework.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.*;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class MyTest {
    private Student validStudent;
    private Student notValidStudent;
    private Book book;

    @Before
    public void setUp(){
        book = new Book();
        validStudent = mock(Student.class);
        notValidStudent = mock(Student.class);


        when(notValidStudent.isMember()).thenReturn(false);
        when(notValidStudent.hasNoPenalty()).thenReturn(false);

        when(validStudent.isMember()).thenReturn(true);
        when(validStudent.hasNoPenalty()).thenReturn(true);
        book.setBookName("Java Fundamentals");
        book.setIBSN("123456");

    }
    @Test(expected = IllegalArgumentException.class)
    public void testSetStudentNotValid(){
        book.setStudent(notValidStudent);

    }
    @Test
    public void testPenalty(){
        Student student = new Student();
        student.setPenalty(2);
        assertEquals(false, student.hasNoPenalty());
    }
    @Test
    public void testMember(){
        Student student = new Student();
        student.setUniversity("Linneaus University");
        assertEquals(true, student.isMember());
    }

}

