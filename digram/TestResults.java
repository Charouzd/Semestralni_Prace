package App;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *<h1>Test result </h1>
 * <p>object class
 * creates test object with two proprieties.
 * 1) Student's number - to keep anonymity of student(GDPR)
 * 2) Score - point acquired in test
 * </p>
 * @author Filip Charouzd
 */
public class TestResults {
    private final int studNumber;
    private final double score;

    public TestResults(int studNumber, double score) {
        this.studNumber = studNumber;
        this.score = score;
    }

    public double getScore() {
        return score;
    }

    public int getNumber() {
        return studNumber;
    }

    
    
    
}
