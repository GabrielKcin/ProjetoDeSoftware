import java.util.Scanner;

public class App extends LimparBuffer
{
    public static void main(String[] args) throws Exception 
    {
        Armazena bancodeinf = new Armazena();
        Scanner teclado = new Scanner(System.in);
        int escolha;

        do
        {
            System.out.println("==========BEM-VINDO AO IFACE!========== (TELA INICIAL)\n\n");
            Telas tela = new Telas();
            tela.inicial();    
            escolha = teclado.nextInt();
            teclado.nextLine();
            switch(escolha)
            {
                case 1:
                    String login, senha, nome; //nome será o nickname do usuário na rede social 

                    System.out.print("\n\nCRIANDO CONTA\n");
                    //LOGIN
                    do
                    {
                        System.out.print("Digite seu login: ");
                        login = teclado.nextLine();
                        if(bancodeinf.verificaLogin(login))
                        {
                            System.out.println("\n\nJá existe esse 'login' dentro do IFACE, por favor escolha outro 'login'\n\n");
                        }
                        else
                        {
                            break;
                        }
                    }while(true);

                    //SENHA
                    System.out.print("Digite sua senha: ");
                    senha = teclado.nextLine();

                    //NICKNAME
                    do
                    {
                        System.out.print("Digite seu nome (nickname) (como você será conhecido no IFACE): ");
                        nome = teclado.nextLine();
                        if(bancodeinf.verificaNome(nome))
                        {
                            System.out.println("\n\nJá existe esse nome dentro do IFACE, por favor escolha outro nome\n\n");
                        }
                        else
                        {
                            break;
                        }
                    }while(true);

                    bancodeinf.addUsuario(login, senha, nome);
                    break;
                case 2:
                    System.out.println("\n\nFAZENDO LOGIN\n");

                    System.out.print("Digite seu login: ");
                    login = teclado.nextLine();
                    System.out.print("Digite sua senha: ");
                    senha = teclado.nextLine();
                    
                    if(bancodeinf.verificaConta(login, senha))
                    {
                        Usuario a = bancodeinf.enviaUsuario(login, senha);
                        tela.telaUsuario(a);
                    }
                    else
                    {
                        System.out.println("\nUSUARIO E SENHA INCORRETOS OU CONTA INEXISTENTE NO SISTEMA\nCASO NÃO TENHA CRIADO UMA CONTA UTILIZE A OPÇÃO 'CRIAR CONTA'\n");
                    }
                    break;
                case 0:
                    break;
                default:
                      
            }
            //Telas.limpaconsole();
            System.out.println("\n");
        }while(escolha != 0);
        System.out.println("SAIUUUU");
        teclado.close();
    }
}
