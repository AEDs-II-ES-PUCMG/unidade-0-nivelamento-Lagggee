import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ProdutoPerecivel extends Produto {
    
private double DESCONTO;

private int PRAZO_DESCONTO;

public ProdutoPerecivel(String desc, double precoCusto, double margemLucro, LocalDate dataDeValidade) {
        super(desc, precoCusto, margemLucro);
    }

public ProdutoPerecivel(String desc, double precoCusto, LocalDate dataDeValidade) {
        super(desc, precoCusto);
    }

@Override
public String gerarDadosTexto() {
/*Você deve implementar aqui a lógica que monta a String com os atributos do objeto ProdutoNaoPerecivel,
respeitando o formato do arquivo de dados. */
}


}
