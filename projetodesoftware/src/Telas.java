import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class Telas 
{
    
    public void inicial() //TELA INICIAL DO SISTEMA
    {
            System.out.print("Qual operação desejas fazer?\n");
            System.out.println("1 - CRIAR CONTA");
            System.out.println("2 - FAZER LOGIN");
            System.out.println("0 - ENCERRAR O PROGRAMA");
    }

    public static void limpaconsole() //LIMPAR A TELA DO TERMINAL
    {
        System.out.print("\033[H\033[2J");
    }

    public void telaUsuario(Usuario atual) //TELA DO USUÁRIO AO FAZER LOGIN
    {
        int escolha;
        do
        {
            limpaconsole();
            System.out.println("========== IFACE ========== (TELA PRINCIPAL)\n");
            System.out.println("Conta atual: " + atual.getNome() + "\n\n");
            System.out.println("1 - VER PEFIL");
            System.out.println("0 - FAZER LOGOUT");
            Scanner teclado = new Scanner(System.in);
            escolha = teclado.nextInt();

            switch(escolha)
            {
                case 1:
                    limpaconsole();
                    telaPerfil(atual);
                    break;
                case 0:
                    break;
                default:

            }

        }while(escolha != 0);
        
    }

    public void telaPerfil(Usuario atual)
    {
        Scanner teclado = new Scanner(System.in);
        do
        {
            System.out.println("========== IFACE ========== (TELA PERFIL)");
            for (Atributos i : atual.getPerfil().listaAtributo)
            {
                System.out.println("->" + i.nome + "\n" + i.descricao + "\n");
            }
            System.out.println("1 - EDITAR ATRIBUTOS");
            System.out.println("2 - ADICIONAR ATRIBUTO");
            System.out.println("3 - REMOVER ATRIBUTOS (NÃO É POSSÍVEL REMOVER OS PADRÕES)");
            System.out.println("0 - VOLTA PARA 'TELA PRINCIPAL'");
            System.out.println("Qual operação desejas fazer?");
            int escolha = teclado.nextInt();  
            switch(escolha)
            {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 0:
                    break;

                default:
            }
     
        }while(false);
    }

    
}
