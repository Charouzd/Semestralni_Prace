package App;



import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDate;


/**
 *<h1>Absolvent </h1>
 * <p>object class inheritate from Student class
 * <p>creates object(Absolvent) with five non inherited proprieties.
 * 1) Score - point acquire
 * 2) Grade - final grade calculated by dividing Score by MaxScore and then choosen by fieled of grades
 * 3) MaxScore - maximum points a student can acquire
 * 4) Field of grades - array of lowest score you need for the mark 
 * 5) Passed - boolean vaule, that defines if student passed the test or not
 * </p>
 * <p>Important Methods
 * Grade - return grade and decide if student passed or not
 * Comparable - to sort absolvents
 * toString 
 * </p>
 * @author Filip Charouzd
 */

public class Absolvent2 implements Comparable<Absolvent> {
    private final Student student;
    private final TestResults result;
    private int grade;
    private final double maxScore=50;
    private final double[] grades={88,75,58, 45};
    private boolean passed;
    

    public Absolvent2(Student student, TestResults result) {
        this.student = student;
        this.result = result;
    }
   
   private void grade(){
      double score = result.getScore();
      if (result.getScore()<0){
      score=maxScore-maxScore;
      }else if(result.getScore()>maxScore){
      score=maxScore;
      }
       double grade= (score/maxScore)*100;
       if( grade > grades[0] ){
           this.grade = 1;
           passed=true;
       }else if(grade > grades[1] ){
           this.grade=2;
           passed=true;
       }else if(grade > grades[2] ){
           this.grade=3;
           passed=true;
       }else if(grade > grades[3] ){
           this.grade=4;
           passed=true;
       }else{
           passed=false;          
       }
   }

    public double getScore() {
        return result.getScore();
    }

    public int getGrade() {
        return grade;
    }


    @Override
    public String toString() {
        if(passed==true){
        return String.format("%s", "Student's number:" + student.getNumber() +"  Name:" + student.getName()+" " + student.getLastName() + "(" + student.getSex() + ") born in " + student.getBorn() +" seccesfuly gradueted for "+grade+"("+(result.getScore()*100/maxScore)+"%)");
    }else{
            return String.format("%s", "Student's number:" + student.getNumber() +"  Name:" + student.getName()+" " + student.getLastName() + "(" + student.getSex() + ") born in " + student.getBorn() +" was unseccesfull because he aquire "+(result.getScore()*100/maxScore)+"%)");
        }
    }
// comparator vrací -1;0;1 
    @Override
        public int compareTo(Absolvent o) {
       return  Double.compare(result.getScore(), o.getScore());
   
  }

   
   }


