public class Validacoes {
	
	public static boolean validarDescricao(String descricao) {
		
		if(descricao.length()>=2) {
			return true;
		}		
		return false;
	}

	public static boolean validarCodigo(int codigo) {
		if(codigo>0) {
			return true;
		}
		return false;
	}
	
	public static boolean validarPreco(double preco) {
		if(preco>0) {
			return true;
		}
		return true;
	}
	
	public static boolean validarData(String data) {
		if(data.length()==8){
			return true;
		}		
		return false;
	}
		
}
