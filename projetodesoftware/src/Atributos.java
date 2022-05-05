public class Atributos
{
    String nome;
    String descricao;
    boolean padrao;

    public Atributos(String nome, String descricao, boolean op, boolean padrao) //esse boolean é para dizer se a "operação" está sendo feita pela máquina ou pelo usuário
    {
        this.nome = nome;
        this.descricao = descricao;
        if(op)
        {
            this.padrao = true;
        }
        else
        {
            this.padrao = false;
        }
    }

    public void setDescricao(String descricao)
    {
        this.descricao = descricao;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public String getDescricao()
    {
        return descricao;
    }

    public String getNome()
    {
        return nome;
    }

    public Boolean getPadrao()
    {
        return padrao;
    }
}
