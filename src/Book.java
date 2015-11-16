/**
 * @author taner on 2015-11-16.
 */
public class Book {
    private Student student;
    private String IBSN;
    private String bookName;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        if(student.isMember()){
            if(student.hasNoPenalty()){
                this.student = student;
            }else{
                throw new IllegalArgumentException("You have penalties");
            }
        }else{
            throw new IllegalArgumentException("You are not member");
        }
    }

    public String getIBSN() {
        return IBSN;
    }

    public void setIBSN(String IBSN) {
        this.IBSN = IBSN;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
}