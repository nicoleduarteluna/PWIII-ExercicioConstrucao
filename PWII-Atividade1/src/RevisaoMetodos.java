
public class RevisaoMetodos {
	public static void main(String[] args) {
		int num = 10;
		System.out.println("O pr�ximo n�mero �: " + proximo (num));
		System.out.println("O pr�ximo n�mero multiplicado por 2 �: " + dobroProximo(num));
		
	}
	
	public static int proximo (int num) {
		// int resultado = num+1;
		// return resultado;
		return num + 1;
	}
	
	public static int dobroProximo (int num) {
		// return (num+1) *2; 
		return proximo (num)* 2;
		
	}
}