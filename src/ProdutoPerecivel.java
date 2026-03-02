import java.time.LocalDate;

public class ProdutoPerecivel extends Produto {
    
private double DESCONTO;

private int PRAZO_DESCONTO;

public ProdutoPerecivel(String desc, double precoCusto, double margemLucro, LocalDate dataDeValidade) {
        super(desc, precoCusto, margemLucro);
    }

    public ProdutoPerecivel(String desc, double precoCusto, LocalDate dataDeValidade) {
        super(desc, precoCusto);
    }

}
