package CuadrosDialogo;

import javax.swing.JOptionPane;

public class CuadrosDialogo {
    public static void main(String[] args) {
        int op=0;
        String menu="";
        do{
            menu="";
            menu+="****** Men� ******\n";
            menu+="1.- Selector de Opciones \n";
            menu+="2.- Caja de Texto \n";
            menu+="3.- Selector Combo \n";
            menu+="4.- Mensaje \n";
            menu+="5.- Salir \n";
            menu+="Elia una opci�n";
            op=Integer.parseInt(JOptionPane.showInputDialog(menu));
            switch(op){
            case 1:
                SelectorOpciones();
                break;
            case 2:
                CajaTexto();
                break;
            case 3:
                SelectorCombo();
                break;
            case 4:
                Mensaje();
                break;   
            }
        }while(op!=5);
        JOptionPane.showMessageDialog(null,"Fin de la Aplicaci�n");
    }
    
    static void SelectorOpciones(){
        int seleccion = JOptionPane.showOptionDialog(null,"Seleccione opci�n", "Selector de opciones",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE,null,new Object[] {"opci�n 3", "opci�n 2", "opci�n 1"}, 
                "opcion 1");
    }
    
    static void CajaTexto(){
        String seleccion = JOptionPane.showInputDialog(null,"Cuadro de Texto",JOptionPane.QUESTION_MESSAGE);
    }
    
    static void SelectorCombo(){
        Object seleccion = JOptionPane.showInputDialog(null,"Seleccione opci�n","Selector de opciones",
                JOptionPane.QUESTION_MESSAGE,null,
                new Object[] { "opci�n 1", "opci�n 2", "opci�n 3" },"opci�n 1");
    }
    
    static void Mensaje(){
        JOptionPane.showMessageDialog(null,"Aviso recibido");
    }
    
}