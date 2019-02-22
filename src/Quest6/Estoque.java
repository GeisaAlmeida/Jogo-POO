package Quest6;

public class Estoque {

	public static void main(String[] args) {
		String	mat[][] = new String[5][3];
		int cont =0;
		float valorT =0;
		for (int linha = 0; linha < 5; linha++) {
			for(int coluna = 0; coluna <3;coluna++) {	
				mat[linha][coluna] = args[cont];
				cont += 1;				
			}
		}
		
		for (int linha = 0;linha < 5;linha++) {
			
			int quantidade = Integer.parseInt(mat[linha][1]);
			float valor = Float.parseFloat(mat[linha][2]);
			valorT += valor * quantidade;
		}
		System.out.print("Valor total de estoque : "+valorT);
		
	////compilar Quest6\Estoque.java
	//// executar Quest6.Estoque mais as informações args[]


}
}
