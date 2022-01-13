package calculointeres01;
import java.util.Scanner;

public class calculointeres01 {
	public static void main(String[] args) {
		//	Declaraci�n de constantes
		double interes_semestral = 2.75/100/2;
		double impuestoretenido = 0.18;
		
		//	Se declara el objeto de entrada de datos
		Scanner sc = new Scanner(System.in);
		//	Entrada de datos (dep�sito en efectivo a cuenta)
		System.out.print("Dinero ingresado: ");
		double deposito = sc.nextDouble();
		
		//	C�lculo para la generaci�n de intereses
		double intereses_semestral = deposito * interes_semestral;
		double retenciones = deposito * interes_semestral * impuestoretenido;
		String retencion_formato = String.format("$%,.2f", retenciones);
		double intereses_cobrados = deposito * interes_semestral * (1 - impuestoretenido);
		String impuestoretenido_formato = String.format("$%,.2f", intereses_cobrados);
		
		//	Impresi�n de resultados
		System.out.println("Intereses a los seis meses: " + intereses_semestral);
		System.out.println("Retenciones realizadas: " + retencion_formato);
		System.out.println("Intereses cobrados: " + impuestoretenido_formato);
	}
}
