package atividadesL;

// import classe para numeros random
import java.util.Random;

public class geradorSenha {
	
	// delcarando metodo
	public static String geradorSenhas(int tamanho) {
		
		String caracteres = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()_-+=<>?{}";
		StringBuilder senha = new StringBuilder();
		Random random = new Random();
		
		// loop
		for(int i = 0 ; i < tamanho; i++) {
			int indice = random.nextInt(caracteres.length());
			char caractere = caracteres.charAt(indice);
			senha.append(caractere);
		}
		return senha.toString();
	}
	
	// método para imprimirSenha
			public static void imprimirSenha(String senha) {
				System.out.println("Senha gerada: " + senha);
			}
	 
	
}
