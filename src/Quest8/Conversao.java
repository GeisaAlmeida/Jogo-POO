package Quest8;

public class Conversao {

	public static void main(String[] args) {
		
		String nome = args[0];
		int idade = Integer.parseInt(args[1]);
		float saldoConta = Float.parseFloat(args[2]);
		float valorPagar = Float.parseFloat(args[3]);
		if(saldoConta >= valorPagar) {
			System.out.println("Saldo suficiênte para pagamento");
		}else {
			System.out.println("Saldo insuficiênte para realizar pagamento");
			
		////compilar Quest8\conversao.java
		//// executar Quest8.Conversao mais as informações args...


		}

	}

}
