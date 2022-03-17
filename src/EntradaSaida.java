import javax.swing.JOptionPane;

public class EntradaSaida {
	
	public static int solicitarOpAlteracao() {
		int opcao = Integer.parseInt(JOptionPane.showInputDialog("Digite: "
				+ "1-Alterar a descrição \n"
				+ "2-Alterar o preço"));
		return opcao;
	}
	
	public static void mostrarMensagemErro() {
		JOptionPane.showMessageDialog(null, "Opção inválida");	
	}
	
	public static int solicitarOpMenu() {		
		int opcao = Integer.parseInt(JOptionPane.showInputDialog("Bem vindo \n"
			+ "1- Cadastrar produto não perecível \n"
			+ "2- Cadastrar produto perecível \n"
			+ "3- Ver produto \n"
			+ "4- Alterar informação do produto \n"
			+ "5- Sair do programa"));
		return opcao;
	}
	
	public static int solicitarCodigoProd() {
		int codigo = Integer.parseInt(JOptionPane.showInputDialog("Informe o código do produto"));
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
		JOptionPane.showMessageDialog(null, "Os dados do produto são: \n"
				+ "Código: "+prod.getCodigo()+"\n"
				+ "Descrição: "+prod.getDescricao()+"\n"
				+ "Preço: "+prod.getPreco());
	}
	
	public static String solicitarDataValidade(String mensagem) {		
		String data = JOptionPane.showInputDialog(mensagem);		
		return data;
	}
	
	public static void mostrarDadosProdPerecivel(ProdutoPerecivel pp) {
		
		JOptionPane.showMessageDialog(null,"Os dados do produto são: \n"
				+ "Código: "+pp.getCodigo()+"\n"
				+ "Descrição: "+pp.getDescricao()+"\n"
				+ "Preço: "+pp.getPreco()+"\n"
				+ "Data de validade: "+pp.getDataValidade());
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
