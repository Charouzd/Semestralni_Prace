package App;

import java.time.LocalDate;

/**
 * <h1>Student Class</h1>
 * <p>
 * Object class with proprieties describing a student. - Name and Lastname -
 * Sex/Genger <b>M</b>an or <b>W</b>oman - born means birthday in form
 * dd.MM.yyyy - Student number - unique graduation number contains several
 * information first number from left says genger(1/2 = M/W) next two numbers
 * define school next four numbers is queue number
 * </p>
 *
 * @author Filip Charouzd
 */
public class Student {

    protected int number;
    protected String name;
    protected String lastName;
    protected char sex;
    protected LocalDate born;

    public Student(String name, String lastName, char sex, LocalDate born, int num) {
        this.name = name;
        this.lastName = lastName;
        this.sex = sex;
        this.born = born;
        this.number = num;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBorn() {
        return born;
    }

    @Override
    public String toString() {
        return String.format("%s", "Student number:" + number + "  Name:" + name + " " + lastName + "(" + sex + ") born in " + born);
    }

}
