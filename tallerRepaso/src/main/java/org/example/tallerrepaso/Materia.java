package org.example.tallerrepaso;

public class Materia {

    private String nomMateria;
    private String codigo;
    private int capMax;
    private String indicaHabilitacion;
    private Estado estados;

    public Materia(String nomMateria,String codigo,int capMax,String indicaHabilitacion){
        this.nomMateria=nomMateria;
        this.codigo=codigo;
        this.capMax=capMax;
        this.indicaHabilitacion=indicaHabilitacion;
        this.estados=estados;

    }
    public String getNomMateria() {
        return nomMateria;

    }public void setNomMateria(String nomMateria) {
        this.nomMateria = nomMateria;

    }public String getCodigo() {
        return codigo;

    }public void setCodigo(String codigo) {
        this.codigo = codigo;

    }public int getCapMax() {
        return capMax;

    }public void setCapMax(int capMax) {
        this.capMax = capMax;

    }public String getIndicaHabilitacion() {
        return indicaHabilitacion;

    }public void setIndicaHabilitacion(String indicaHabilitacion) {
        this.indicaHabilitacion = indicaHabilitacion;

    }public Estado getEstados() {
    return estados;

    }public void setEstados(Estado estados) {
        this.estados = estados;
    }
}
