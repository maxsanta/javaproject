import java.util.Scanner;

public class Arreglos1 {


	public static void main(String[] args) {

		System.out.println("Ingrese 10 numeros");
		Scanner sc= new Scanner(System.in);
		numero(sc);		
	}
	private static void numero(Scanner scan) {
		int cnegativos=0;
		int cpositivos=0;
		int cceros=0;
		
		int[] arreglo = new int[10];
		
		for(int i = 0; i<10;i++) {
			arreglo[i]=scan.nextInt()	;
		}
		
		for(int i = 0; i<10;i++) {
			if(arreglo[i]<0) {
				cnegativos+=1;
			}
			else if (arreglo[i]>0) {
				cpositivos+=1;
			}
			else {
				cceros+=1;
			}
			}	
		System.out.println("Números negativos: "+ cnegativos);
		System.out.println("Números positivos: "+ cpositivos);
		System.out.println("Número ceros: "+ cceros);
		
	}
	
}
