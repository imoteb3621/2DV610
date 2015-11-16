/**
 * @author taner on 2015-11-16.
 */
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.*;
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
        book.setIBSNnumber("123456");

    }
    @Test(expected = IllegalArgumentException.class)
    public void testSetStudentNotValid(){
        book.setStudent(notValidStudent);

    }

}

