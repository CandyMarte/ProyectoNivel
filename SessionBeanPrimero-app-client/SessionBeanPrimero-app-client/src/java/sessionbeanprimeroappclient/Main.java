/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sessionbeanprimeroappclient;

import com.sessionbeanprimero.ejb.RepetirRemote;
import javax.ejb.EJB;
import javax.swing.JOptionPane;

/**
 *
 * @author Candy Marte
 */
public class Main {
    @EJB
    private static RepetirRemote repetir;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JOptionPane.showMessageDialog(null, repetir.repetir("Funciona bien"));
    }
    
}
