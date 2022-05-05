import java.util.ArrayList;

public class Armazena 
{
    //ATRIBUTOS ====================================
    private ArrayList<Usuario> banco;

    //MÉTODOS ====================================
    public Armazena() //CRIAR OBJETO
    {
        this.banco = new ArrayList<Usuario>();
    }

    public void addUsuario(String login, String senha, String nickname) //ADICIONAR USUÁRIO NA ESTRUTURA
    {
        Usuario a = new Usuario(login, senha, nickname, true);
        this.banco.add(a);
    }

    public ArrayList<Usuario> getUsuarios() //PEGAR A ESTRUTURA QUE ARMAZENA TODOS OS USUÁRIOS
    {
        return this.banco;
    }
    
    public Usuario enviaUsuario(String login, String senha) //ENVIAR USUÁRIO DADO O LOGIN E A SENHA
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

    public boolean verificaConta(String login, String senha) //VERIFICAR SE A CONTA EXISTE DENTRO DO SISTEMA DADO O LOGIN E A SENHA
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

    public boolean verificaLogin(String login) //VERIFICAR SE O LOGIN JÁ EXISTE NO SISTEMA (SE JÁ EXISTIR RETORNA 'TRUE')
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

    public boolean verificaNome(String nome) //VERIFICAR SE O NICKNAME JÁ EXISTE NO SISTEMA
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
