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
public class ExemploArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Metodo obx = new Metodo();
        /*obx.crearArray();
        obx.amosar();*/
        //creamos array
        /*int valores[]={1,2,3,4,5};
        obx.visualizar(valores);
        System.out.println("** Creo array en main");
        int[]datos = new int[3];
        datos= obx.encherArray(datos);
        obx.visualizar(datos);*/
        int valores[] = {1,2,3,4,5};
        int[] datos = new int[3];
        datos = obx.encherArray(datos);
        obx.visualizar(datos);
        System.out.println(obx.Buscar(datos,Integer.parseInt(JOptionPane.showInputDialog("Teclea Número de array a buscar: "))));
    }
    
}
