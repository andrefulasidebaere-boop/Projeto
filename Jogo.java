package entidades;

public class Jogo {
    private int id;
    private String genero;
    private int lancamento;
    private String nome;
    private String desenvolvedor;
    private string descricao; 

    public Jogo(int id, String genero, int lancamento, string nome, string desenvolvedor, string descricao) {
        this.id = id;
        this.genero = genero;
        this.lancamento = lancamento;
        this.nome = nome;
        this.desenvolvedor = desenvolvedor;
        this.descricao = descricao;

    }

    public int getId() {
        return id;
    }

    public String getGenero() {
        return genero;
    }

    public int getLancamento() {
        return lancamento;
    }
    public String getNome() {
        return nome;
    }

    public String getDesenvolvedor() {
        return desenvolvedor;
    }

    public String getDescricao() {
        return descricao;
    }


    public void setId(int id) {
        this.id = id;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setLancamento(int lancamento) {
        this.lancamento = lancamento;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDesenvolvedor(String desenvolvedor) {
        this.desenvolvedor = desenvolvedor;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    @Override
    public String toString() {
        return "Id: " + id + " | Gênero: " + genero + " | Lançamento: R$" + lancamento + " | Nome:" + nome + " | Desenvolvedor:" + desenvolvedor + " | Descrição:" + descricao;
    }
}
