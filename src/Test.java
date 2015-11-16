/**
 * @author taner on 2015-11-16.
 */
public class Test {
    public static void main (String [] args){
        Student s1 = new Student();
        s1.setUniversity("Linneaus University");
        s1.setPenalty(1);

        System.out.println(s1.hasNoPenalty());
    }
}
