/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploarray;

import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class PedirDatos {
    public static int pedirInt(){
        return Integer.parseInt(JOptionPane.showInputDialog("Teclea Int:"));
    }
    
    public static String pedirString(){
        return JOptionPane.showInputDialog("Teclea String: ");
    }
}
