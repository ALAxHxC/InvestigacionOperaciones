/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Daniel-SIS
 */
package modelo;
public class Restriccion {
   public int N;
    public double x,y,d;
    public boolean tipo;//ture <= false >=
    public  Restriccion(int N,double x,double y, double d,boolean tipo)
    {this.x=x;
    this.y=y;
    this.d=d;
    this.N=N;
    }

    public Restriccion(int N,double x, double y, double d) {
        this.x = x;
        this.y = y;
        this.d = d;
        this.tipo = tipo;
          this.N=N;
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

    public double getD() {
        return d;
    }

    public void setD(double d) {
        this.d = d;
    }

    public boolean isTipo() {
        return tipo;
    }

    public void setTipo(boolean tipo) {
        this.tipo = tipo;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.N;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Restriccion other = (Restriccion) obj;
        if (this.N != other.N) {
            return false;
        }
        return true;
    }
}
