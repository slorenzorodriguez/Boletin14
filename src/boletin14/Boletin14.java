/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin14;

import javax.swing.JOptionPane;

/**
 *
 * @author Doctor Mantequilla
 */
public class Boletin14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ConversorTemperatura conversor1 = new ConversorTemperatura();
        
       try {
            
            float grados = Integer.parseInt(JOptionPane.showInputDialog("Añade los centígrados"));
            JOptionPane.showMessageDialog(null,"Fharenheit : " + conversor1.centigradosAFharenheit(grados) + " °F");
            JOptionPane.showMessageDialog(null,"Reamur : " + conversor1.centigradosAReamur(grados) + " °R");
            
        } catch(TemperaturaErradaExcepcion ex) {
            
            JOptionPane.showMessageDialog(null,ex.getMessage());
    }
    
}
}
