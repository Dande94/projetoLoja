public class Loja {

	public static void main(String[] args) {
		
		
		ProdutoNaoPerecivel p = new ProdutoNaoPerecivel();
		ProdutoPerecivel pp = new ProdutoPerecivel();
		
		int opcao = 0;
		
		do {
			opcao = EntradaSaida.solicitarOpMenu();
			
					
			switch(opcao) {
			
			case 1:				
				p.setDescricao(EntradaSaida.solicitarDescricaoProd("Informe a descri��o "
						+ "do produto"));							
				while (Validacoes.validarDescricao(p.getDescricao())==false) {
					p.setDescricao(EntradaSaida.solicitarDescricaoProd("Informe uma descri��o "
							+ " v�lida"));
				}				
				p.setCodigo(EntradaSaida.solicitarCodigoProd());
				while(Validacoes.validarCodigo(p.getCodigo())==false) {
					p.setCodigo(EntradaSaida.solicitarCodigoProd());
				}				
				p.setPreco(EntradaSaida.solicitarPrecoProd("Informe o "
						+ "pre�o do produto"));
				while(Validacoes.validarPreco(p.getPreco())==false){
					p.setPreco(EntradaSaida.solicitarPrecoProd("Informe um "
							+ "pre�o v�lido"));
				}	
			break;					
			case 2:
				pp.setDescricao(EntradaSaida.solicitarDescricaoProd("Informe a descri��o "
						+ "do produto perec�vel"));
				while(Validacoes.validarDescricao(pp.getDescricao())==false) {
					pp.setDescricao(EntradaSaida.solicitarDescricaoProd("Informe a descri��o "
							+ "do produto perec�vel"));
				}
				
				pp.setPreco(EntradaSaida.solicitarPrecoProd("Informe o pre�o do "
						+ "produto perec�vel"));
				while(Validacoes.validarPreco(pp.getPreco())==false) {
					pp.setPreco(EntradaSaida.solicitarPrecoProd("Informe o pre�o do "
							+ "produto perec�vel"));
				}
				
				pp.setCodigo(EntradaSaida.solicitarCodigoProd());
				while(Validacoes.validarCodigo(pp.getCodigo())==false) {
					pp.setCodigo(EntradaSaida.solicitarCodigoProd());
				}
				
				pp.setDataValidade(EntradaSaida.solicitarDataValidade("Informe a data "
						+ "de validade do produto perec�vel"));
				while(Validacoes.validarData(pp.getDataValidade())==false) {
					pp.setDataValidade(EntradaSaida.solicitarDataValidade("Informe a data "
							+ "de validade do produto perec�vel"));
				}
				EntradaSaida.mostrarDadosProdPerecivel(pp);
				
			break;
			case 3:
				EntradaSaida.mostrarDadosProd(p);
			break;			
			case 4:
				int opAlteracao = EntradaSaida.solicitarOpAlteracao();
				if(opAlteracao==1) {
					p.setDescricao(EntradaSaida.solicitarDescricaoProd("Informe a "
							+ "nova descri��o do produto"));
				}else{
					p.setPreco(EntradaSaida.solicitarPrecoProd("Informe o "
							+ "novo pre�o do produto"));
				}
				
			break;		
			
			}//switch
		}while(opcao!=5); // --- alterar aqui

	}//main

	
	
	
	
	
	
	
	
	
	
	
}//classe
