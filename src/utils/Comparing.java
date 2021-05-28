/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import App.Absolvent;
import java.util.Comparator;

/**
 * <h1>Comapare class</h1>
 *  <p>Method needed to sort list of absolvents</p>
 * @author Filip Charouzd
 */

public class Comparing implements Comparator<Absolvent> {


    @Override
    public int compare(Absolvent o1, Absolvent o2) {
     return  Double.compare(o1.getScore(), o2.getScore());
    }

    
    }
    

