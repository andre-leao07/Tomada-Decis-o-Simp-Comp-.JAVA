import java.util.Scanner;
public class TituloEleitorBrasil {
	public static void main(String[]args) {
		int anoA, anoN, idade;
		
		Scanner in=new Scanner(System.in);
		System.out.println("Digite seu ano de Nascimento: ");
		anoN=in.nextInt();
		System.out.println("Digite agora nosso a no Atual: ");
		anoA=in.nextInt();
		idade=anoA-anoN;
		if (idade<16) {
			System.out.println("Você ainda é muito novo para tirar o título de Eleitor:");
		} else {
			System.out.println("Parabéns você já pode tirar o seu título de Eleitor:");
		}
		in.close();
	}

}
