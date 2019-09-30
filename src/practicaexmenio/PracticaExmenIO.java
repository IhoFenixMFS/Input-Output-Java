/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaexmenio;
import java.io.*;
/**
 *
 * @author Iho
 */
public class PracticaExmenIO {

    public static void main(String[] args) throws IOException, Exception {
        
        Actor a1 = new Actor("Paco","Game Master");
        Actor a2 = new Actor("Pepe");
        Actor a3 = new Actor("Gustavo","Apetepore");
        Actor a4 = new Actor(a2);
        
        if (a2.compareTo(a3) == 0) {
            System.err.println("Iguales");
        }
        else {
            System.err.println("Distintos");
        }
        System.out.println(a1.compareTo(a3));
        System.out.println(a3.toString());
        
        IO io = new IO();
        
        io.montarFuncion(a1);
        io.montarFuncion(a2);
        io.montarFuncion(a3);
        io.montarFuncion(a4);
        
        File f = new File("funcion.txt");
        io.guardar(f);
        io.cargar(f);
        File ficherot = new File ("funciont.txt");
        io.guardarTXT(ficherot);
    }
    
}
