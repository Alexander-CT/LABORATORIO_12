package CASTRO_TOCAFFONDI;
//Autor: CASTRO TOCAFFONDI

import javax.swing.JOptionPane;

public class ArbolBinario {
    private Nodo raiz;
    public ArbolBinario(){
        raiz=null;
    }
    
    public void insetar(int dato){
        Nodo nuevo=new Nodo(dato);
        if(raiz==null){
            raiz=nuevo;
        }else{
            Nodo aux=raiz;
            Nodo anterior=null;
            while(aux!=null){
                anterior=aux;
                if(dato<aux.getDato()){
                    aux=aux.getIzquierdo();
                }else{
                    aux=aux.getDerecho();
                }
            }
            if(dato<anterior.getDato()){
                anterior.setIzquierdo(nuevo);
            }else{
                anterior.setDerecho(nuevo);
            }
        }
    }
    
    public void PreOrden(Nodo aux){
        if(aux!=null){
            System.out.println(aux.getDato()+"--");
            PreOrden(aux.getIzquierdo());
            PreOrden(aux.getDerecho());
        }
    }
    public void PreOrden(){
        PreOrden(raiz);
        System.out.println("");
    }
    
    public void EntreOrden(Nodo aux){
        if(aux!=null){
            EntreOrden(aux.getIzquierdo());
            System.out.println(aux.getDato()+"--");
            EntreOrden(aux.getDerecho());
        }
    }
    public void EntreOrden(){
        EntreOrden(raiz);
        System.out.println("");
    }
    
    public void PostOrden(Nodo aux){
        if(aux!=null){
            PostOrden(aux.getIzquierdo());
            PostOrden(aux.getDerecho());
            System.out.println(aux.getDato()+"--");
        }
    }
    public void PostOrden(){
        PostOrden(raiz);
        System.out.println("");
    }

    
   public void buscar(){
        Nodo aux=raiz;
        int dato=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresar elemento a buscar","Buscar",JOptionPane.INFORMATION_MESSAGE));
	if(buscar(aux, dato)){
            JOptionPane.showMessageDialog(null,"Se encontro el elemento "+dato,"Nodo encontrado",JOptionPane.INFORMATION_MESSAGE);
	}else{
            JOptionPane.showMessageDialog(null,"No se encontro el elemento "+dato,"Nodo no encontrado",JOptionPane.ERROR_MESSAGE);
	}
    }

    private boolean buscar(Nodo aux, int dato){
	if(aux!= null){
            if(aux.getDato() == dato){
                return true;
            }
            boolean esta1 = buscar(aux.getIzquierdo(),dato);
            boolean esta2 = buscar(aux.getDerecho(), dato);
            if(esta1 || esta2){
                return true;
            }
        }
        return false;
    }

    public void EliminarNodo() {
        Nodo aux=raiz;
        int dato=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el elemento que desea eliminar","Eliminar",JOptionPane.INFORMATION_MESSAGE));
        if(buscar(aux, dato)){
            JOptionPane.showMessageDialog(null,"El elemento "+dato+" ha sido eliminado correctamente","Eliminación exitosa",JOptionPane.INFORMATION_MESSAGE);
            Nodo anterior=aux;
            if(dato<anterior.getDato()){
                anterior.setIzquierdo(null);
            }else{
                anterior.setDerecho(null);
            }
        }else{
            JOptionPane.showMessageDialog(null,"No se encontro el elemento "+dato,"Nodo no existe",JOptionPane.ERROR_MESSAGE);
        }
    }
}
