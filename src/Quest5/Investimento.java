package Quest5;

public class Investimento {

	public static void main(String[] args) {
		
		float valor = Float.parseFloat(args[0]);
		Float taxa = Float.parseFloat(args[1]);
		int mes = Integer.parseInt(args[2]);
		
		double saldoM = 0;
		
		
			for (int i = mes; i >0; i--) {
				saldoM = (saldoM + valor) * Math.pow((1+taxa),1);
		
				System.out.println(saldoM);
				
			////compilar Quest5\Investimento.java
				//// executar Quest5.Investimento mais as informações args[]
		
		}
	}

}
