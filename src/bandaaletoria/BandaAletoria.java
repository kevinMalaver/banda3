/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandaaletoria;

import bandaaletoria.logica.Banda;
import java.util.Random;

/**
 *
 * @author Estudiantes
 */
public class BandaAletoria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Banda b = new Banda();
        Random rn = new Random();
        int cantidadMusicos = rn.nextInt(15);
        b.crearBanda(cantidadMusicos);
        b.tocarbanda();
    }
    
}
