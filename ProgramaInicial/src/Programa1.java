import java.util.Scanner;

public class Programa1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=0;
		int b=0;
		int c;
		int n;
		n=sc.nextInt();
		for(int i=0;i<n;i++) {
			c=i+a+b;
			System.out.println(c);
			b=a;
			a=c;
		}
		System.out.println(a);

	}

}
