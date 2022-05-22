package ejercicio7;

import javax.swing.JOptionPane;
import java.lang.Math;

public class Main {
	public static void main(String[] args) {
		int opc = 0;
		
		String menu = "";
		
		do{
        	menu = "";
            menu += "1 .- Calcular �rea de un triangulo.\n";
            menu += "2 .- Salir.\n";
            menu += "\nEscribe una opci�n : ";
		
			String entrada = JOptionPane.showInputDialog(null, menu, "�rea triangulo", JOptionPane.INFORMATION_MESSAGE);

			if (entrada != null) {
				if (!entrada.trim().equals("")) {
					opc = Integer.parseInt(entrada);
					
					switch(opc){
		            case 1:
		            	areaTriangulo();
		                break;
		            case 2:
		                opc = -1;
		                break;
		            default:
		            	JOptionPane.showMessageDialog(null, "�Opci�n incorrecta!", "Error", JOptionPane.ERROR_MESSAGE);
		                break;
		            }
				} else {
					JOptionPane.showMessageDialog(null, "�Escribe una opcion correcta!", "Error", JOptionPane.ERROR_MESSAGE);
				}
			} else {
				opc = -1;
			}
		} while (opc != -1);
		JOptionPane.showMessageDialog(null, "Fin de la Aplicaci�n.", "Informaci�n", JOptionPane.INFORMATION_MESSAGE);
	}
	
	public static String entradaDatos(String title, String body) {
		int continuar = 0;
		
		String entrada = "";
		
		do{
			entrada = JOptionPane.showInputDialog(null, body, title, JOptionPane.INFORMATION_MESSAGE);

			if (entrada != null) {
				if (!entrada.trim().equals("")) {
					return entrada;
				} else {
					JOptionPane.showMessageDialog(null, "Rellena el campo, por favor.", "Error", JOptionPane.ERROR_MESSAGE);
				}
			} else {
				continuar = -1;
				entrada = "-1";
			}
		} while (continuar != -1);
		
		return entrada;
	}
	
	public static void mostrarDatos(String title, String body) {
		JOptionPane.showMessageDialog(null, body, title, JOptionPane.INFORMATION_MESSAGE);
	}
	
	public static void areaTriangulo() {
		double a, b, c, p, area;
        
        a = Double.parseDouble(entradaDatos("�rea triangulo", "Escribe la longitud del primer lado del tri�ngulo : "));
        
        if (a != -1) {
        	b = Double.parseDouble(entradaDatos("�rea triangulo", "Escribe la longitud del segundo lado del tri�ngulo : "));
            
        	if (b != -1) {
        		c = Double.parseDouble(entradaDatos("�rea triangulo", "Escribe la longitud del tercer lado del tri�ngulo : "));
                
        		if (c != -1) {
        			p = (a + b + c) / 2;
        			
        			area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        			
        			String area_formato = "El �rea del triangulo es : " +  String.format("%,.2f", area);
        			mostrarDatos("�rea triangulo", area_formato);		
        		}
            }
        }
	}
}