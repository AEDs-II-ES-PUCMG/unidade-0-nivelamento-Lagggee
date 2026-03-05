public class ProdutoNaoPerecivel extends Produto {
    
    public ProdutoNaoPerecivel(String desc, double precoCusto, double margemLucro, int quantidadeEmEstoque) {
        super(desc, precoCusto, margemLucro, quantidadeEmEstoque);
    }

    public ProdutoNaoPerecivel(String desc, double precoCusto, int quantidadeEmEstoque) {
        super(desc, precoCusto, quantidadeEmEstoque);
    }

    @Override
    public String gerarDadosTexto() {
        return "1;" + super.gerarDadosTexto();
    }

}
