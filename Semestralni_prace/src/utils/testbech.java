/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;
import App.Absolvent;
import App.Student;
import App.TestResults;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
/**
 *
 * @author Filip Charouzd
 */
public class testbech {

    /**
     * @param args the command line arguments
     */
    public static double grade(double score){
    double[] grades={88,75,58, 45};
    double max=50;
    double grade = Double.NaN;
     boolean passed;
    double percentageSucces= score*100/max;
    if( percentageSucces > grades[0] ){
           grade = 1;
         passed = true;
       }else if(percentageSucces > grades[1] ){
           grade=2;
           passed=true;
       }else if(percentageSucces > grades[2] ){
           grade=3;
           passed=true;
       }else if(percentageSucces > grades[3] ){
           grade=4;
           passed=true;
       }else{
           passed=false;          
       }
        return grade;
    
    }
   static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy");
    public static void main(String[] args) {
      
            String name= "Filip";
                    String lastName="Charouzd";
            LocalDate born = LocalDate.parse("16.09.2000", dtf);
            int number=1234567;
            char sex = "M".charAt(0);            
    Student stud = new Student(name,lastName,sex,born,number);
    TestResults test= new TestResults(number,48);
    Absolvent abs= new Absolvent(stud,test);
     System.out.println(abs.toString()); 
            System.out.println(grade(48));
    
        
    }
    
}
