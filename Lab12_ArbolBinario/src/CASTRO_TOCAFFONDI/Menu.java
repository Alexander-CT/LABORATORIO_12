package CASTRO_TOCAFFONDI;
//Autor: CASTRO TOCAFFONDI
import javax.swing.JOptionPane;
public class Menu {
    public Menu(){
        ArbolBinario arb=new ArbolBinario();
        String mensaje="1. Agregar nodo\n";
        mensaje+="2. PreOrden\n";
        mensaje+="3. EntreOrden\n";
        mensaje+="4. PostOrden\n";
        mensaje+="5. Buscar Nodo\n";
        mensaje+="6. Eliminar Nodo\n";
        mensaje+="7. Contar nodos\n";
        mensaje+="8. Salir";
        int opcion;
        do{
            opcion=Integer.parseInt(JOptionPane.showInputDialog(null,mensaje,"MENÚ",JOptionPane.INFORMATION_MESSAGE));
            switch(opcion){

                case 1: //AGREGAR NODO
                    arb.insertar();
                    break;
                case 2: //PREORDEN
                    arb.PreOrden();
                    break;
                case 3: //ENTREORDEN
                    arb.EntreOrden();
                    break;
                case 4: //POSTORDEN
                    arb.PostOrden();
                    break;
                case 5: //BUSCAR NODO
                    arb.buscar();
                    break;
                case 6: //ELIMINAR NODO
                    arb.EliminarNodo();
                    break;
                case 7: //CANTIDAD DE NODOS
                    arb.contarNodos();
                    break;
            }
        }while(opcion!=8);
    }
}
