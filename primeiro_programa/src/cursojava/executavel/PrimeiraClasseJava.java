package cursojava.executavel;

public class PrimeiraClasseJava {
	
	public static void main(String[] args) {
		
		int nota1 = 90;
		int nota2 = 90;
		int nota3 = 90;
		int nota4 = 95;
		int media = 0;
		
		media = (nota1 + nota2 + nota3 + nota4)/4;
		
		if(media >= 50) {
			if(media >= 90) {
				System.out.println("Parabéns você Foi aprovado acima de 90: " + media);
			} else {
				System.out.println("Parabéns você só foi aprovado com a média de: " + media);
			}
		} else {
			System.out.println("Você foi reprovado com a média de: " + media);
		}
		
		
   }		
}

