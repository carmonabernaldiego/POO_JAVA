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
            menu+="5.- Suma de valores \n";
            menu+="6.- Salir \n";
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
             case 5:
                Suma();
                break;  
            }
        }while(op!=6);
        JOptionPane.showMessageDialog(null,"Fin de la Aplicaci�n");
    }
    
    static void SelectorOpciones(){
        int seleccion = JOptionPane.showOptionDialog(null,"Seleccione opci�n", "Selector de opciones",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE,null,new Object[] {"opci�n 3", "opci�n 2", "opci�n 1"}, 
                "opcion 1");
    }
    
    static void CajaTexto(){
        String seleccion = JOptionPane.showInputDialog(null,"Cuadro de Texto");
    }
    
    static void SelectorCombo(){
        Object seleccion = JOptionPane.showInputDialog(null,"Seleccione opci�n","Selector de opciones",
                JOptionPane.QUESTION_MESSAGE,null,
                new Object[] { "opci�n 1", "opci�n 2", "opci�n 3" },"opci�n 1");
    }
    
    static void Mensaje(){
        JOptionPane.showMessageDialog(null,"Aviso recibido");
    }
    
    static void Suma(){
        String primerdato = JOptionPane.showInputDialog(null,"Primer Dato");
        Double primervalor = Double.parseDouble(primerdato);
        String segundodato = JOptionPane.showInputDialog(null,"Segundo Dato");
        Double segundovalor = Double.parseDouble(segundodato);
        Double totalsuma = primervalor + segundovalor;
        String sumatotal = String.valueOf(totalsuma);
        JOptionPane.showMessageDialog(null,"La suma es: " + sumatotal);
    }
    
}