/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Daniel-SIS
 */
public class Respuesta {
    double x,y;
    char tipo;
    double z;
    boolean cumple;

   public Respuesta(double x, double y,char tipo) {
        this.x = x;
        this.y = y;
        this.tipo=tipo;
        z=0;
        cumple=true;
      
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }
    public Respuesta(double x, double y) {
        this.x = x;
        this.y = y;
      
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
   
    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    public boolean isCumple() {
        return cumple;
    }

    public void setCumple(boolean cumple) {
        this.cumple = cumple;
    }
    
}
