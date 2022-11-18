import java.util.Scanner;
public class Inss {
	public static void main (String[]args) {
		double s, inss1, inss2, sl1, sl2;
		
		Scanner in=new Scanner(System.in);
		System.out.println("Digite seu salário bruto:");
		s=in.nextDouble();
		inss1=s/100*9;
		inss2=s/100*11;
		sl1=s-inss1;
		sl2=s-inss2;
		if(s<=2500) {
			System.out.println("Você deve para o INSS: " + inss1 +
					"0 R$  e seu salário líquido é igual a: " + sl1 + "0 R$");
		} else { 
			System.out.println("Você deve para o INSS: " + inss2 +
					"0 R$  e seu salário líquido é igual a: " + sl2 + "0 R$");
			
		}
		in.close();
	}

}
