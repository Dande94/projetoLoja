import javax.swing.JOptionPane;

public class EntradaSaida {
	
	public static int solicitarOpAlteracao() {
		int opcao = Integer.parseInt(JOptionPane.showInputDialog("Digite: "
				+ "1-Alterar a descri��o \n"
				+ "2-Alterar o pre�o"));
		return opcao;
	}
	
	public static void mostrarMensagemErro() {
		JOptionPane.showMessageDialog(null, "Op��o inv�lida");	
	}
	
	public static int solicitarOpMenu() {		
		int opcao = Integer.parseInt(JOptionPane.showInputDialog("Bem vindo \n"
			+ "1- Cadastrar produto n�o perec�vel \n"
			+ "2- Cadastrar produto perec�vel \n"
			+ "3- Ver produto \n"
			+ "4- Alterar informa��o do produto \n"
			+ "5- Sair do programa"));
		return opcao;
	}
	
	public static int solicitarCodigoProd() {
		int codigo = Integer.parseInt(JOptionPane.showInputDialog("Informe o c�digo do produto"));
		return codigo;
	}

	public static String solicitarDescricaoProd(String mensagem) {		
		String descricao = JOptionPane.showInputDialog(mensagem);
		return descricao;
	}
	
	public static double solicitarPrecoProd(String mensagem) {
		double preco = Double.parseDouble(JOptionPane.showInputDialog(mensagem));
		return preco;
	}
	
	public static void mostrarDadosProd(ProdutoNaoPerecivel prod) {
		JOptionPane.showMessageDialog(null, "Os dados do produto s�o: \n"
				+ "C�digo: "+prod.getCodigo()+"\n"
				+ "Descri��o: "+prod.getDescricao()+"\n"
				+ "Pre�o: "+prod.getPreco());
	}
	
	public static String solicitarDataValidade(String mensagem) {		
		String data = JOptionPane.showInputDialog(mensagem);		
		return data;
	}
	
	public static void mostrarDadosProdPerecivel(ProdutoPerecivel pp) {
		
		JOptionPane.showMessageDialog(null,"Os dados do produto s�o: \n"
				+ "C�digo: "+pp.getCodigo()+"\n"
				+ "Descri��o: "+pp.getDescricao()+"\n"
				+ "Pre�o: "+pp.getPreco()+"\n"
				+ "Data de validade: "+pp.getDataValidade());
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
