import java.util.Scanner;
public class Inss {
	public static void main (String[]args) {
		double s, inss1, inss2, sl1, sl2;
		
		Scanner in=new Scanner(System.in);
		System.out.println("Digite seu sal�rio bruto:");
		s=in.nextDouble();
		inss1=s/100*9;
		inss2=s/100*11;
		sl1=s-inss1;
		sl2=s-inss2;
		if(s<=2500) {
			System.out.println("Voc� deve para o INSS: " + inss1 +
					"0 R$  e seu sal�rio l�quido � igual a: " + sl1 + "0 R$");
		} else { 
			System.out.println("Voc� deve para o INSS: " + inss2 +
					"0 R$  e seu sal�rio l�quido � igual a: " + sl2 + "0 R$");
			
		}
		in.close();
	}

}
