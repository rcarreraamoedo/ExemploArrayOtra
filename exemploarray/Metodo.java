/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploarray;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Metodo {

    int[] numeros = new int[1];

    public void crearArray() {
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = PedirDatos.pedirInt();
        }
    }

    public void amosar() {
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
    }

    //recibimos o array como parámetro
    public void visualizar(int[] lista) {
        for (int i = 0; i < lista.length; i++) {
            System.out.println("*** " + lista[i]);
        }
    }

    public int[] encherArray(int[] lista) {
        for (int i = 0; i < lista.length; i++) {
            lista[i] = PedirDatos.pedirInt();
        }
        return lista;
    }

    public static String Buscar(int[] buscar, int numeroBuscar) {
        String encontrado = null;
        for (int i = 0; i < buscar.length; i++) {
            if (buscar[i] == numeroBuscar) {
                encontrado = "numero: "+numeroBuscar+" encontrado";
                break;
            }else{
                encontrado="No encontrado el numero "+numeroBuscar;
            }
        }
        return encontrado;
    }
}
