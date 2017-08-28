/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandaaletoria.logica;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

/**
 *
 * @author Estudiantes
 */
public class Banda {

    public ArrayList<Musico> musicos;

    public Banda() {
        this.musicos = new ArrayList<>();
    }

    public Instrumento generarInstrumento() {
        Random rn = new Random();
        switch (rn.nextInt(5)) {
            case 0:
                return new Guitarra();
            case 1:
                return new Chelo();
            case 2:
                return new Violin();
            case 3:
                return new Flauta();
            default:
                return new Bajo();
        }
    }

    public void tocarbanda() {
        Iterator it = musicos.iterator();
        while (it.hasNext()) {
            Musico m = (Musico) it.next();
            m.tocarInstrumento();
        }
    }

    public void crearBanda(int cantidadMusicos) {
        for (int c = 0; c < cantidadMusicos; c++) {
            musicos.add(new Musico());
        }
        Iterator it = musicos.iterator();
        while (it.hasNext()) {
            Musico m = (Musico) it.next();
            m.setInstrumento(this.generarInstrumento());
        }
        
    }

}
