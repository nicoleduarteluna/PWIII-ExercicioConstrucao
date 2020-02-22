
public class Piscina {
	public static void main(String[] args) {
		int diametro = 6;
		double totalPiscina = total(areaPiscina(raio(diametro)));
		System.out.println("O raio da piscina �: " + raio(diametro));
		System.out.println("A �rea da piscina �: " + areaPiscina(raio(diametro)));
		System.out.println("O total a ser gasto na piscina �: " + totalPiscina);
	}
	
	public static int raio (int diametro) {
		return diametro/2;
	}
	
	public static double areaPiscina (int raio ) {
		return Math.PI * Math.pow(raio, 2) ;
	}
	
	public static double total(double areaPiscina) {
		return areaPiscina * 75;
	}
	
	public static double totalConstrucao (double total, double totalCasa) {
		return total + totalCasa;
	}
}
