/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t1.jhann;

/**
 *
 * @author jhann
 */
import java.util.ArrayList;

public class Controlador {
     ArrayList<paciente> lista = new ArrayList<>();

    public void agregarPaciente(paciente nuevoPaciente) {
        lista.add(nuevoPaciente);
    }

    public void listarPersonas() {
        System.out.println("La lista contiene las siguientes personas:");
        for (paciente p : lista) {
            System.out.println("Tipo Doc: " + p.getTipoDoc()
                + " Nro Doc: " + p.getNumIdentificación()
                + " Nombre: " + p.getNombre()
               );
        }
    }
    
}
