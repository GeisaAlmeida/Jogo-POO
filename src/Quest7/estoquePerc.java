package Quest7;

public class estoquePerc {

	public static void main(String[] args) {
		
		String	mat[][] = new String[5][3];
		float[] vet= new float[5];
		int cont =0;
		float Porcen =0;
		int valorT = 0;
		
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
		
		int linhaa = 0;
		for (int linha = 0;linha < 5;linha++) {
			for(linhaa = 0 ; linhaa < 5;linhaa ++) {
				int quantidade = Integer.parseInt(mat[linha][1]);
				float valor = Float.parseFloat(mat[linha][2]);
				vet[linhaa]= valor * quantidade;
				Porcen = (valorT * valor )/100;
			}
		}
		System.out.print("Valor total de estoque : "+ vet[linhaa] + Porcen);
		
	////compilar Quest6\EstoquePerc.java
	//// executar Quest6.Estoque mais as informações args[]


}
}