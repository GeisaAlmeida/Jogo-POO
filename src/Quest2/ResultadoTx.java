package Quest2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ResultadoTx {
	
	public static void main(String[] args) throws IOException {
		
		//nome = Char.parseChar(args[1]);
		System.out.println("Nome: " + args[0]);
		
		//cpf = Double.parseDouble(args[0]);
		System.out.println("CPF: " + args[1]);
		
		File arquivo = new File("arquivo.txt");
		FileWriter escritor = new FileWriter(arquivo, true);
		escritor.write("Nome: " + args[0]);
		escritor.write("Nome: " + args[1]);
		escritor.close();
	}
}
