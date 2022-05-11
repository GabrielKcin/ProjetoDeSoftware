public class Atributos
{
    private String nome;
    private String descricao;
    private boolean nativo; //É UM 'BOOLEANO' PARA IDENTIFICAR OS 'ATRIBUTO PADRÃO/ATRIBUTO DO SISTEMA' OU CRIADO PELO USUÁRIO

    public Atributos(String nome, String descricao, boolean op) //esse "boolean op" é para dizer se a "operação" está sendo feita pela máquina ou pelo usuário
    {
        this.nome = nome;
        this.descricao = descricao;
        if(op)
        {
            this.nativo = true;
        }
        else
        {
            this.nativo = false;
        }
    }

    //MUDAR DESCRIÇÃO DO ATRIBUTO
    public void setDescricao(String descricao)
    {
        this.descricao = descricao;
    }

    //MUDAR NOME DO ATRIBUTO
    public void setNome(String nome)
    {
        this.nome = nome;
    }

    //PEGAR DESCRIÇÃO DE UM ATRIBUTO
    public String getDescricao()
    {
        return descricao;
    }

    //PEGAR NOME DO ATRIBUTO
    public String getNome()
    {
        return nome;
    }

    //VERIFICAR SE O ATRIBUTO É DO SISTEMA OU É CRIADO PELO USUARIO
    public Boolean getPadrao()
    {
        return nativo;
    }
}
