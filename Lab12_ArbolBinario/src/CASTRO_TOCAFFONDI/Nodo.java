package CASTRO_TOCAFFONDI;
//Autor: CASTRO TOCAFFONDI
public class Nodo {
    private int dato;
    private Nodo izquierdo;
    private Nodo derecho;
    
    public Nodo(int dato){
        setDato(dato);
        izquierdo=null;
        derecho=null;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public Nodo getIzquierdo() {
        return izquierdo;
    }

    public void setIzquierdo(Nodo izquierdo) {
        this.izquierdo = izquierdo;
    }

    public Nodo getDerecho() {
        return derecho;
    }

    public void setDerecho(Nodo derecho) {
        this.derecho = derecho;
    }
}
