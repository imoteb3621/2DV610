/**
 * @author taner on 2015-11-16.
 */
public class Book {
    private Student student;
    private String IBSNnumber;
    private String bookName;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {

    }

    public String getIBSNnumber() {
        return IBSNnumber;
    }

    public void setIBSNnumber(String IBSNnumber) {
        this.IBSNnumber = IBSNnumber;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
}