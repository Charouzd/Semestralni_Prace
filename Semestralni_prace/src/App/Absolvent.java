package App;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDate;

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
    private double grade = Double.NaN;
    private final double maxScore = 50;
    private final double[] grades = {88, 75, 58, 45};
    public boolean passed;

    public Absolvent(Student student, TestResults result) {
        this.student = student;
        this.result = result;
        grade();
    }

    private double getPercentage() {
        return (result.getScore() / maxScore) * 100;

    }

    private void grade() {
       

        double percentageSucces = getPercentage();
        passed = true;
        if (percentageSucces > grades[0]) {
            grade = 1;
            passed = true;
        } else if (percentageSucces > grades[1]) {
            grade = 2;
            passed = true;
        } else if (percentageSucces > grades[2]) {
            grade = 3;
            passed = true;
        } else if (percentageSucces > grades[3]) {
            grade = 4;
            passed = true;
        } else {
            passed = false;
        }

    }

    public double getScore() {
        return result.getScore();
    }

    public double getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        if (this.passed) {
            return String.format("%s", "Student's number:" + student.getNumber() + "  Name:" + student.getName() + " " + student.getLastName() + "(" + student.getSex() + ") born in " + student.getBorn() + " seccesfuly gradueted for " + grade + "(" + getPercentage() + "%)");
        } else {
            return String.format("%s", "Student's number:" + student.getNumber() + "  Name:" + student.getName() + " " + student.getLastName() + "(" + student.getSex() + ") born in " + student.getBorn() + " was unseccesfull because he aquire " + grade + " " + getPercentage() + "%)");
        }
    }
// comparator vrací -1;0;1 

    @Override
    public int compareTo(Absolvent o) {
        return Double.compare(result.getScore(), o.getScore());

    }

}
