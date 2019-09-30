/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaexmenio;

import java.io.*;
import java.util.*;

/**
 *
 * @author Iho
 */
public class IO implements Serializable {
    
    private HashSet<Actor> actores = new HashSet<>();
    
    public void montarFuncion (Actor a) {
        if (!actores.add(a)) {
            ExcepcionActores ea = new ExcepcionActores("El actor ya está en la función.");
            System.err.println(ea);
        }
    }
    
    public void guardarTXT (File f) throws IOException {
        PrintWriter pw = null;
        try {
            pw = new PrintWriter(new BufferedWriter(new FileWriter(f)));
            Iterator it = actores.iterator();
            while (it.hasNext()) {
                Actor a = (Actor) it.next();
                pw.println(a);
            }
        }
        catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }
        finally {
            pw.close();
        }
    }
    
    public void guardar (File f) throws IOException {
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream(f));
            oos.writeObject(this);
        }
        catch (IOException ea) {
            System.err.println(ea.getMessage());
        }
        finally {
            oos.close();
        }
    }
    
    public void cargar (File f) throws Exception {
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream(f));
            IO io = (IO) ois.readObject();
            actores = io.actores;
        }
        catch (Exception e) {
            System.err.println(e.getMessage());
        }
        finally {
            ois.close();
        }
    }
    
}
