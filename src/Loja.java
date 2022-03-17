public class Loja {

	public static void main(String[] args) {
		
		
		ProdutoNaoPerecivel p = new ProdutoNaoPerecivel();
		ProdutoPerecivel pp = new ProdutoPerecivel();
		
		int opcao = 0;
		
		do {
			opcao = EntradaSaida.solicitarOpMenu();
			
					
			switch(opcao) {
			
			case 1:				
				p.setDescricao(EntradaSaida.solicitarDescricaoProd("Informe a descrição "
						+ "do produto"));							
				while (Validacoes.validarDescricao(p.getDescricao())==false) {
					p.setDescricao(EntradaSaida.solicitarDescricaoProd("Informe uma descrição "
							+ " válida"));
				}				
				p.setCodigo(EntradaSaida.solicitarCodigoProd());
				while(Validacoes.validarCodigo(p.getCodigo())==false) {
					p.setCodigo(EntradaSaida.solicitarCodigoProd());
				}				
				p.setPreco(EntradaSaida.solicitarPrecoProd("Informe o "
						+ "preço do produto"));
				while(Validacoes.validarPreco(p.getPreco())==false){
					p.setPreco(EntradaSaida.solicitarPrecoProd("Informe um "
							+ "preço válido"));
				}	
			break;					
			case 2:
				pp.setDescricao(EntradaSaida.solicitarDescricaoProd("Informe a descrição "
						+ "do produto perecível"));
				while(Validacoes.validarDescricao(pp.getDescricao())==false) {
					pp.setDescricao(EntradaSaida.solicitarDescricaoProd("Informe a descrição "
							+ "do produto perecível"));
				}
				
				pp.setPreco(EntradaSaida.solicitarPrecoProd("Informe o preço do "
						+ "produto perecível"));
				while(Validacoes.validarPreco(pp.getPreco())==false) {
					pp.setPreco(EntradaSaida.solicitarPrecoProd("Informe o preço do "
							+ "produto perecível"));
				}
				
				pp.setCodigo(EntradaSaida.solicitarCodigoProd());
				while(Validacoes.validarCodigo(pp.getCodigo())==false) {
					pp.setCodigo(EntradaSaida.solicitarCodigoProd());
				}
				
				pp.setDataValidade(EntradaSaida.solicitarDataValidade("Informe a data "
						+ "de validade do produto perecível"));
				while(Validacoes.validarData(pp.getDataValidade())==false) {
					pp.setDataValidade(EntradaSaida.solicitarDataValidade("Informe a data "
							+ "de validade do produto perecível"));
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
							+ "nova descrição do produto"));
				}else{
					p.setPreco(EntradaSaida.solicitarPrecoProd("Informe o "
							+ "novo preço do produto"));
				}
				
			break;		
			
			}//switch
		}while(opcao!=5); // --- alterar aqui

	}//main

	
	
	
	
	
	
	
	
	
	
	
}//classe
