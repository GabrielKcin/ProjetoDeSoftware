public class Usuario 
{
    private String login;
    private String senha;
    private String nome; //nickname
    private boolean estado; //o intuito desse booleano é dizer se esse usuário está ativo ou não ativo
    private Perfil perfil;

    public Usuario(String login, String senha, String nome, boolean estado) //CRIAR USUÁRIO NO SISTEMA (NÃO INSERE ELE NA ESTRUTURA DE ARMAZENAMENTO)
    {
        this.login = login;
        this.senha = senha;
        this.nome = nome;
        this.estado = estado;
        this.perfil = new Perfil();
    }

    public String getLogin() //PEGAR O LOGIN DO USUÁRIO
    { 
        return this.login;
    }

    public String getNome() //PEGAR O NOME DO USUÁRIO (NICKNAME)
    {
        return this.nome;
    }

    public String getSenha() //PEGAR A SENHA DO USUÁRIO
    {
        return this.senha;
    }

    public boolean getEstado()
    {
        return this.estado;
    }

    public void setEstado(boolean a)
    {
        this.estado = a;
    }

    public Perfil getPerfil()
    {
        return perfil;
    }

}
