import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ProdutoPerecivel extends Produto {
    
private double DESCONTO = 0.75;

private int PRAZO_DESCONTO = 7;

private LocalDate dataDeValidade;

public ProdutoPerecivel(String desc, double precoCusto, double margemLucro, LocalDate dataDeValidade) {
        super(desc, precoCusto, margemLucro);
        this.dataDeValidade = dataDeValidade;
    }

public ProdutoPerecivel(String desc, double precoCusto, LocalDate dataDeValidade) {
        super(desc, precoCusto);
        this.dataDeValidade = dataDeValidade;
    }

@Override
public double valorDeVenda() {
    if (dataDeValidade.isBefore(LocalDate.now().plusDays(PRAZO_DESCONTO))) {
        return super.valorDeVenda() * (1 - DESCONTO);
    } else {
        return super.valorDeVenda();
    }
}

@Override
public String gerarDadosTexto() {
    DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    return "2;" + super.gerarDadosTexto() + this.dataDeValidade.format(formato);
}

@Override
public String toString() {
    DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    return super.toString() + " (Validade: " + this.dataDeValidade.format(formato) + ")";
}


}
