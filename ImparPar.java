import java.util.Scanner;
public class ImparPar {
	public static void main(String[]args) {
		int x,y;
		
		Scanner in=new Scanner(System.in);
		System.out.println("Digite um número:");
		x=in.nextInt();
		y=x%2;
		if (y==0) {
			System.out.println("Este número é PAR: ");
		} else {
			System.out.println("Este número é ÍMPAR: ");
					
		}
		in.close();
		
	}

}
