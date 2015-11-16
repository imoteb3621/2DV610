/**
 * @author taner on 2015-11-16.
 */
/**
 * @author taner on 2015-11-16.
 */
public class Student {
    public String university;
    public String student;
    public int age;
    public int id;
    public int penalty;
    public boolean isMember;
    public boolean hasPenalty;
    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getStudent() {
        return student;
    }

    public void setStudent(String student) {
        this.student = student;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPenalty() {
        return penalty;
    }

    public void setPenalty(int penalty) {
        this.penalty = penalty;
    }

    public boolean hasNoPenalty(){

        return this.getPenalty()>=3;
    }
    public boolean isMember(){
      
        return this.getUniversity() == "Linneaus University";
    }
}