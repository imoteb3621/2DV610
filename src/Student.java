/**
 * @author taner on 2015-11-16.
 */
/**
 * @author taner on 2015-11-16.
 */
public class Student {
    public String universityName;
    public String studentName;
    public int studentAge;
    public int studentId;
    public int penalty;
    public boolean isMember;

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getPenalty() {
        return penalty;
    }

    public void setPenalty(int penalty) {
        this.penalty = penalty;
    }

    public boolean hasNoPenalty(){
        if(this.penalty>=3){
            return false;
        }else {
            return true;
        }
    }
    public boolean isMember(){
        return isMember;
    }
}