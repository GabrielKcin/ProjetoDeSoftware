import java.util.Scanner;

public class Telas extends LimparBuffer
{

    //TELA INICIAL DO SISTEMA
    public void inicial() 
    {
            System.out.println("1 - CRIAR CONTA");
            System.out.println("2 - FAZER LOGIN");
            System.out.println("0 - ENCERRAR O PROGRAMA");
            System.out.print("Qual operação desejas fazer?\n");
    }

    //LIMPAR A TELA DO TERMINAL
    public static void limpaconsole() 
    {
        System.out.print("\033[H\033[2J");
    }

    //TELA DO USUÁRIO AO FAZER LOGIN
    public void telaUsuario(Usuario atual) 
    {

        int escolha;

        do
        {
            //limpaconsole();
            System.out.println("========== IFACE ========== (TELA PRINCIPAL)\n");
            System.out.println("Conta atual: " + atual.getNome() + "\n\n");
            System.out.println("1 - VER SEU PEFIL");
            System.out.println("2 - VER PEFIL DE OUTROS USUÁRIOS");
            System.out.println("3 - ADICIONAR AMIGOS");
            System.out.println("4 - ENVIAR MENSAGENS");
            System.out.println("5 - CRIAR COMUNIDADE");
            System.out.println("6 - COMUNIDADES");
            System.out.println("7- REMOVER CONTA");
            System.out.println("0 - FAZER LOGOUT");
            Scanner teclado = new Scanner(System.in);
            escolha = teclado.nextInt();
            teclado.nextLine();
            switch(escolha)
            {
                case 1:
                    //limpaconsole();
                    telaPerfil(atual);
                    break;
                case 0:
                    break;
                default:

            }
            teclado.close();
        }while(escolha != 0);

    }

    //TELA PARA VER O PERFIL E PARA EDITAR PERFIL
    public void telaPerfil(Usuario atual)
    {
        Scanner teclado = new Scanner(System.in);

        do
        {
            System.out.println("========== IFACE ========== (TELA PERFIL)\n");

            for (Atributos i : atual.getPerfil().listaAtributo)//MOSTRANDO TODOS ATRIBUTOS DO PERFIL DESSE USUARIO
            {
                System.out.println("->" + i.getNome() + ":\n" + i.getDescricao() + "\n");
            }

            System.out.println("1 - EDITAR DESCRIÇÃO DE ATRIBUTO");
            System.out.println("2 - ADICIONAR ATRIBUTO");
            System.out.println("3 - REMOVER ATRIBUTO (NÃO É POSSÍVEL REMOVER OS 'ATRIBUTOS PADRÕES DO SISTEMA')");
            System.out.println("0 - VOLTAR PARA 'TELA PRINCIPAL'");
            System.out.println("Qual operação desejas fazer?");

            int escolha = teclado.nextInt(); 
            teclado.nextLine();

            switch(escolha)
            {
                case 1:
                    //limpaconsole();
                    atual.getPerfil().exibirListaAtributoEditar();
                    do
                    {
                        Scanner ok = new Scanner(System.in);
                        System.out.println("Digite o 'índice' do atributo que desejas editar: ");
                        int indice = ok.nextInt();
                        ok.nextLine();
                        if( (indice >= 0) && (indice <= atual.getPerfil().listaAtributo.size()) )
                        {
                            System.out.println("Digite a nova descrição do atributo [" + atual.getPerfil().listaAtributo.get(indice).getNome() + "] :" );
                            String descricao = ok.nextLine();
                            atual.getPerfil().listaAtributo.get(indice).setDescricao(descricao);
                            ok.close();
                            break;
                        }
                        else
                        {
                            System.out.println("OPÇÃO INVÁLIDA!Digite um 'indice' dos 'indices' disponíveis\n");
                        }
                    }while(true);
                    
                    break;

                case 2:
                    Scanner ok = new Scanner(System.in);
                    System.out.print("Digite o nome desse atributo: ");
                    String nome = ok.nextLine();
                    System.out.println("Digite a descrição do atributo [" + nome + "]: ");
                    String descricao = ok.nextLine();
                    Atributos a = new Atributos(nome, descricao, false);
                    atual.getPerfil().listaAtributo.add(a);
                    break;

                case 3:
                    for(Atributos i : atual.getPerfil().listaAtributo)
                    {
                        System.out.println(i);
                    }
                    break;

                case 0:
                    break;

                default:
                    System.out.println("\nOPÇÃO INVÁLIDA\n");
            }
     
        }while(true);
    }

    
}
