package App;

/**
 * <h1>Absolvent </h1>
 * <p>
 * object class inheritate from Student class
 * <p>
 * creates object(Absolvent) with five non inherited proprieties. 1) Score -
 * point acquire 2) Grade - final percentageSucces calculated by dividing Score
 * by MaxScore and then choosen by fieled of grades 3) MaxScore - maximum points
 * a student can acquire 4) Field of grades - array of lowest score you need for
 * the mark 5) Passed - boolean vaule, that defines if student passed the test
 * or not
 * </p>
 * <p>
 * Important Methods Grade - return percentageSucces and decide if student
 * passed or not Comparable - to sort absolvents toString
 * </p>
 *
 * @author Filip Charouzd
 */
public class Absolvent implements Comparable<Absolvent> {

    private final Student student;
    private final TestResults result;
    
    
    public Absolvent(Student student, TestResults result) {
        this.student = student;
        this.result = result;
        result.grade();
    }

    


    public double getScore() {
        return result.getScore();
    }

    public double getGrade() {
        return result.getGrade();
    }

    @Override
    public String toString() {
        if (result.isPassed()) {
            return String.format("%s", "Student's number:" + student.getNumber() + "  Name:" + student.getName() + " " + student.getLastName() + "(" + student.getSex() + ") born in " + student.getBorn() + " succesfuly gradueted for " + result.getGrade() + "(" + result.getPercentage() + "%)");
        } else {
            return String.format("%s", "Student's number:" + student.getNumber() + "  Name:" + student.getName() + " " + student.getLastName() + "(" + student.getSex() + ") born in " + student.getBorn() + " was unseccesfull because he aquire "  + result.getPercentage() + "%)");
        }
    }
// comparator vrací -1;0;1 

    @Override
    public int compareTo(Absolvent o) {
        return Double.compare(result.getScore(), o.getScore());

    }

}
