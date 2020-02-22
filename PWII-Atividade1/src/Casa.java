
public class Casa {
	public static void main(String[] args) {
		int largura = 20;
		int comprimento = 20;
		double totalCasa = totalCasa(porcentagemCasa(areaCasa(comprimento,largura)));
		
		System.out.println("A área da casa é: " + areaCasa(comprimento,largura));
		System.out.println("A área da casa correspondente a porcentagem exigida: " + porcentagemCasa(areaCasa(comprimento,largura)));	
		System.out.println("O total a ser gasto na casa é: " + totalCasa);
	}
	
	public static int areaCasa (int comprimento, int largura) {
		return comprimento * largura;
	}
	 
	public static double porcentagemCasa (int areaCasa) {
		return 0.5 * areaCasa;
	}
	
	public static double totalCasa (double porcentagemCasa) {
		return porcentagemCasa * 60;
	}
}
