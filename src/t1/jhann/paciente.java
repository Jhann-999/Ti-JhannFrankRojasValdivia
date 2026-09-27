/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t1.jhann;

/**
 *
 * @author jhann
 */
public class paciente {
     
    private String nombre;
    private String tipoDoc;
    private String numIdentificación;
    private String FechaNaci;
    private String tipoSangre;
    private String alergias;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) {
        this.nombre = nombre;
    } else {
        System.out.println("El nombre no puede estar vacio");
    }
    }

    public String getTipoDoc() {
        return tipoDoc;
    }

    public void setTipoDoc(String tipoDoc) {
         if (tipoDoc.equals("DNI") || tipoDoc.equals("CE")) {
        this.tipoDoc = tipoDoc;
    } else {
        System.out.println("Tipo de documento invalido, debe ser DNI o CE");
    }
    }

    public String getNumIdentificación() {
        return numIdentificación;
    }

    public void setNumIdentificación(String numIdentificación) {
        if (this.tipoDoc == null) {
        System.out.println("Primero debe ingresar el tipo de documento");
        return;
    }
    if (this.tipoDoc.equals("DNI") && numIdentificación.length() == 8) {
        this.numIdentificación = numIdentificación;
    } else if (this.tipoDoc.equals("CE") && numIdentificación.length() == 9) {
        this.numIdentificación = numIdentificación;
    } else {
        System.out.println("Numero de documento invalido para el tipo " + this.tipoDoc);
    }
    }

    public String getFechaNaci() {
        return FechaNaci;
    }

    public void setFechaNaci(String FechaNaci) {
        this.FechaNaci = FechaNaci;
    }

    public String getTipoSangre() {
        return tipoSangre;
    }

    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    public paciente() {
    }
    
}
