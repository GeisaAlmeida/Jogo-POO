package Quest3;

public class MaiorNume {

	public static void main(String[] args) {
		
		int nume1, nume2, maior;
		nume1 = Integer.parseInt(args[0]);
		nume2= Integer.parseInt(args[1]);

		if ( nume1 > nume2) {
		maior = nume1;
		}else {
			maior = nume2;
		}
		System.out.println("Maior numeros é:" + maior);
		
	}

}

