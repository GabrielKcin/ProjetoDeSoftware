import java.util.ArrayList;

public class Armazena 
{
    //ATRIBUTOS ====================================
    private ArrayList<Usuario> banco;

    //MÉTODOS ====================================
    
    //CRIAR OBJETO
    public Armazena() 
    {
        this.banco = new ArrayList<Usuario>();
    }

    //ADICIONAR USUÁRIO NA ESTRUTURA
    public void addUsuario(String login, String senha, String nickname)
    {
        Usuario a = new Usuario(login, senha, nickname, true);
        this.banco.add(a);
    }

    //PEGAR A ESTRUTURA QUE ARMAZENA TODOS OS USUÁRIOS
    public ArrayList<Usuario> getUsuarios() 
    {
        return this.banco;
    }
    
    //ENVIAR O OBJETO USUÁRIO DADO O LOGIN E A SENHA
    public Usuario enviaUsuario(String login, String senha) 
    {
        for (Usuario usuario : banco)
        {
            if( (usuario.getLogin().equals(login) == true) && (usuario.getSenha().equals(senha) == true) )
            {
                Usuario t = usuario;
                return t; 
            }
        }
        return null;
    }

    //VERIFICAR SE A CONTA EXISTE DENTRO DO "BANCO DE USUÁRIOS" DADO O LOGIN E A SENHA
    public boolean verificaConta(String login, String senha) 
    {
        for (Usuario usuario : this.banco)
        {
            if( (usuario.getLogin().equals(login) == true) && (usuario.getSenha().equals(senha) == true) )
            {
                return true;
            }
        }
        return false;
    }

    //VERIFICAR SE O LOGIN JÁ EXISTE NO SISTEMA (SE JÁ EXISTIR RETORNA 'TRUE')
    public boolean verificaLogin(String login) 
    {
        for (Usuario usuario : banco)
        {
            if(usuario.getLogin().equals(login) == true)
            {
                return true;
            }
        }
        return false;
    }

    //VERIFICAR SE O NICKNAME JÁ EXISTE NO SISTEMA (SE JÁ EXISTIR RETORNA 'TRUE')
    public boolean verificaNome(String nome) 
    {
        for (Usuario usuario : banco)
        {
            if(usuario.getNome().equals(nome) == true)
            {
                return true;
            }
        }
        return false;
    }

    /*public void todosUsuarios() //EXIBIR TODOS OS USUÁRIOS
    {
        for (Usuario usuario : banco)
        {
                System.out.println("Login: " + usuario.getLogin());
                System.out.println("Senha: " + usuario.getSenha());
                System.out.println("Nickname: " + usuario.getNome());
                System.err.println("\n");
        }
    }
    */

}
