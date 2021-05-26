package App;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import utils.EvaluateInterface;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import utils.Comparing;

/**
 * <h1>Evaluation class</h1>
 * <p>
 * class has three proprieties and implements ownInterface. - List of student -
 * List of results - List of absolvents there are also methods to work with
 * proprieties
 * </p>
 *
 * @author Filip Charouzd
 */
public class Evalueting implements EvaluateInterface {

    private final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy");
    private final List<Student> students;
    private final List<TestResults> results;
    private final List<Absolvent> absolvents;

    public Evalueting() {

        students = new ArrayList<>();
        results = new ArrayList<>();
        absolvents = new ArrayList<>();
    }

    /**
     * <h1>saveToTxt</h1>
     * <p>
     * This Method creates new file.txt and write down all absolvents in last
     * form choosen by user in sort option in menu.
     * </p>
     *
     * @param fileName - name of the file that you want to create.
     * @throws IOException Throws exception in case of any problem with file
     */
    @Override
    public void saveToTxt(String fileName) throws IOException {
        String path = "results//" + fileName + ".txt";
        File myObj = new File(path);
        System.out.println("File created: " + myObj.getName());
        try (FileWriter myWriter = new FileWriter(path)) {
            myWriter.write(showAbslovents());
        }

    }

    /**
     * <h1>saveToBin</h1>
     * <p>
     * This Method creates new file.dat and write down all absolvents in last
     * form choosen by user in sort option in menu. file is crated in subfile of
     * project named results
     * </p>
     *
     * @param fileName - just name of file without typing
     * @throws java.io.FileNotFoundException - it is thrown when fili is not
     * foud
     * @throws IOException - it is thrown when file ureadable
     */
    @Override
    public void saveToBin(String fileName) throws FileNotFoundException, IOException {
        try (DataOutputStream out = new DataOutputStream(new FileOutputStream("results//" + fileName + ".dat", true))) {
            out.writeUTF(showAbslovents());
        }
    }

    /**
     * <h1>sortByScoreFromWorst</h1>
     * <p>
     * This method sort absolvents by score from the worst to best one. Type of
     * sorting compare
     * </p>
     */
    @Override
    public void sortByScoreFromWorst() {
        Collections.sort(absolvents, new Comparing());
    }

    /**
     * <h1>Sorting from the best</h1>
     * <p>
     * This method sort absolvents by score fromt the best to worst one. Type of
     * sorting compare
     * </p>
     */
    @Override
    public void sortByScoreFromBest() {

        Absolvent temp;
        for (int i = 0; i < absolvents.size(); i++) {
            for (int j = 0; j < absolvents.size() - i - 1; j++) {
                if (absolvents.get(j).compareTo(absolvents.get(j + 1)) < 0) { //Comparable
                    temp = absolvents.get(j);
                    absolvents.set(j, absolvents.get(j + 1));
                    absolvents.set(j + 1, temp);
                }
            }
        }

    }

    /**
     * <h1>Evalueting method</h1>
     * <p>
     * from list of results find all students from students list. If student is
     * not found, he stays as a student. After evaluation students are also
     * absolvents so they are not removed from list
     * </p>
     */
    @Override
    public void getAbsolvets() {
        int score, num;
        Absolvent absolvent;
        for (int i = 0; i < students.size(); i++) {
            num = students.get(i).getNumber();
            for (int j = 0; i < results.size(); j++) {
                try {

                    if (num == results.get(j).getNumber()) {
                        absolvent = new Absolvent(students.get(i), results.get(j).getScore());
                        absolvents.add(absolvent);
                        break;
                    }
                } catch (Exception e) {
                    break;
                }
            }
        }
    }


/**
 * <h1>Loading resulst</h1>
 * <p>
 * this method reads from .csv file result and store them into list
 * </p>
 *
 * @param fileName - way to file with results
 * @throws FileNotFoundException - it is thrown when fili is not foud
 * @throws IOException - it is thrown when file ureadable
 */
@Override
        public void loadResults(String fileName) throws FileNotFoundException, IOException, NullPointerException{
        ArrayList<Integer> radky= new ArrayList();
        int radek=0;
        try (BufferedReader br = new BufferedReader(new FileReader(new File(fileName)))) {//načítání obsahu souboru pomocí streamu; Try ho pak zavře až skočí
            //proměnné
            String[] colums;
            int number, score;
            String line;
            TestResults test;
            br.readLine();//soubor má záhlavý, takže první řádek si načtu(takže dál program bude brát data od tohoto řádku) a prostě s ním nic neudělám
            //načítání ze souboru
            while ((line = br.readLine()) != null) {
                radek++;
               try{ colums = line.split(",");
                number = Integer.parseInt(colums[0]);
                score = Integer.parseInt(colums[1]);
                test = new TestResults(number, score);
                results.add(test);
               }catch(NumberFormatException e){
                   radky.add(radek);                                 
               }
            }
            if(!radky.isEmpty()){
                String s="Nepodarilo se nacist radky:";
                        for(Integer r:radky){
                            s+=r;
                        }
            throw new IllegalArgumentException(s); 
            }
        }

    }

    /**
     * <h1>Load file of students</h1>
     * <p>
     * this method reads from .csv file informations are converted to right
     * types and stored in list of students
     * </p>
     *
     * @param fileName name and path to file C://xxx//x.csv
     * @throws FileNotFoundException - it is thrown when fili is not foud 
     * @throws IOException - it is thrown when file ureadable
     */
    @Override
        public void loadStudents(String fileName) throws FileNotFoundException, IOException, IllegalArgumentException {
        ArrayList<Integer> radky= new ArrayList();
        int radek=0;
        try (BufferedReader br = new BufferedReader(new FileReader(new File(fileName)))) {//načítání obsahu souboru pomocí streamu; Try ho pak zavře až skočí
            //proměnné
            String[] colums;
            String line, name, lastName;
            LocalDate born;
            int number;
            char sex;
            Student stud;
            br.readLine();//soubor má záhlavý, takže první řádek si načtu(takže dál program bude brát data od tohoto řádku) a prostě s ním nic neudělám
            //načítání ze souboru
            while ((line = br.readLine()) != null) {
                radek++;
                try{
                colums = line.split(",");
                name = colums[0];
                lastName = colums[1];
                sex = colums[2].charAt(0);
                born = LocalDate.parse(colums[3], dtf);
                number = Integer.parseInt(colums[4]);
                stud = new Student(name, lastName, sex, born, number);
                students.add(stud);
                }catch(NumberFormatException e){
                   radky.add(radek);                                 
               }
                if(!radky.isEmpty()){
                String s="Nepodarilo se nacist radky:";
                        for(Integer r:radky){
                            s+=r;
                        }
            throw new IllegalArgumentException(s); 
            }
            }
        }
    }

    /**
     * <h1>Add student to List</h1>
     * <p>
     * This method takes object student and add him to current list of students
     * </p>
     *
     * @param stud - Student you want to add
     */
    @Override
        public void addStudent(Student stud) {
        students.add(stud);
    }

    /**
     * <h1>Add result to List</h1>
     * <p>
     * This method takes object TestResult and add it to current list of results
     * </p>
     *
     * @param test - Result you want to add
     */
    @Override
        public void addResult(TestResults test) {
        results.add(test);
    }

    /**
     * <h1>Show sizes of lists</h1>
     * <p>
     * This method returns how many student and result user has loaded
     * </p>
     *
     * @return number of students and result loaded
     */
    @Override
        public String showSize() {

        return String.format("%s", "počet studentů:" + (students.size()) + " počet výsledků" + results.size());
    }

    /**
     * <h1>showStudents</h1>
     * <p>
     * Display all students on the current list in formated output.
     * </p>
     *
     * @return String of all students
     */
    @Override
        public String showStudents() {
        StringBuilder sb = new StringBuilder();
        students.forEach((b) -> {
            sb.append(b).append("\n");
        });
        return sb.toString();
    }
/**
     * <h1>showAbsolvents</h1>
     * <p>
     * Display all Absolvents on the current list in formated output.
     * </p>
     *
     * @return String of all absolvets
     */
    @Override
        public String showAbslovents() {
        StringBuilder sb = new StringBuilder();
        absolvents.forEach((b) -> {
            sb.append(b).append("\n");
        });
        return sb.toString();
    

}
/**
     * <h1>ComparatorByScore</h1>
     * <p>
     * This method compare two absolvents
     * </p>
     *
     * @return String of all students
     */
    private static class ComparatorByScore<T> {

    public ComparatorByScore() {
    }
}

/**
 * Saves absolvents to pdf file named .pdf
 *
 * @param fileName - name of the file
 * @throws com.itextpdf.text.DocumentException - chyba pri zápisu
 * @throws java.io.FileNotFoundException - Soubor nenaLEZEN
 */

    @Override
    public  void saveToPdf(String fileName) throws DocumentException, FileNotFoundException {
     
            Document document = new Document(); 
            PdfWriter.getInstance(document, new FileOutputStream("results\\" +fileName+".pdf")); 

            String absolvent = showAbslovents();
            document.open(); 
            document.add(new Paragraph("Seznam Absolventů zkoušky:"));
            document.add(new Paragraph(absolvent));
            document.close();   


}
}