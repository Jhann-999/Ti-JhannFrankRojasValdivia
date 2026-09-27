/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t1.jhann;

/**
 *
 * @author jhann
 */
import java.util.Scanner;

public class T1Jhann {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        paciente p1 = new paciente();
        String rpta = "s";
        Controlador controla = new Controlador();

        while (rpta.equalsIgnoreCase("s")) {

            System.out.println("Ingrese tipo de documento");
            String tipo = sc.nextLine();
            p1.setTipoDoc(tipo);

            System.out.println("Ingrese numero de documento");
            String nro = sc.nextLine();
            p1.setNumIdentificación(nro);

            System.out.println("Ingrese su nombre: ");
            String nom = sc.nextLine();
            p1.setNombre(nom);
            
            System.out.println("ingrese tipo de sangre");
            String sangre = sc.nextLine();
            p1.setTipoSangre(sangre);
            
            System.out.println("ingrese alergias");
            String ale = sc.nextLine();
            p1.setAlergias(ale);

            controla.agregarPaciente(p1);
            System.out.println("Desea ingresar otra persona s/n");
            rpta = sc.nextLine();
        }
        controla.listarPersonas();
        // TODO code application logic here
    }
    }
    

