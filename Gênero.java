package entidades;

public class Gênero {
    private int id;
    private String nome;
    private string descricao; 

    public Jogo(int id, string nome, string descricao) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;

    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }


    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    @Override
    public String toString() {
        return "Id: " + id + " | Nome:" + nome + " | Descrição:" + descricao;
    }
}