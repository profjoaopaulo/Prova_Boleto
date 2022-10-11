public class Boleto {

    //Atributos
    private String descricao;
    private int vencimentoMes;
    private int vencimentoAno;
    private double valor;

    public Boleto( String descricao, int vencimentoMes, int vencimentoAno, double valor ) {

        this.descricao = descricao;
        this.vencimentoMes = vencimentoMes;
        this.vencimentoAno = vencimentoAno;
        this.valor = valor;
    }

    public double desconto( double percentual ) {

        return valor - percentual/100*valor;
    }

    public String informacoes() {

        return descricao + " a vencer em " + vencimentoMes + "/" + vencimentoAno;
    }

    public String getDescricao() {
        return descricao;
    }
    public int getVencimentoMes() {
        return vencimentoMes;
    }
    public int getVencimentoAno() {
        return vencimentoAno;
    }
    public double getValor() {
        return valor;
    }

    
}