import java.util.Scanner;
public class ImparPar {
	public static void main(String[]args) {
		int x,y;
		
		Scanner in=new Scanner(System.in);
		System.out.println("Digite um n�mero:");
		x=in.nextInt();
		y=x%2;
		if (y==0) {
			System.out.println("Este n�mero � PAR: ");
		} else {
			System.out.println("Este n�mero � �MPAR: ");
					
		}
		in.close();
		
	}

}
