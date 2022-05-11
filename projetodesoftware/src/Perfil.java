import java.util.ArrayList;

public class Perfil
{
    ArrayList<Atributos> listaAtributo;

    public Perfil()
    {
        this.listaAtributo = new ArrayList<Atributos>();
        Atributos a = new Atributos("LOCAL DE TRABALHO", "", true);
        Atributos b = new Atributos("ESCOLA DE ENSINO MÉDIO", "", true);
        Atributos c = new Atributos("FACULDADE", "", true);
        Atributos d = new Atributos("CIDADE ATUAL", "", true);
        Atributos e = new Atributos("CIDADE NATAL", "", true);
        Atributos f = new Atributos("ESTADO CIVIL", "", true);
        Atributos g = new Atributos("TIME DE FUTEBOL FAVORITO", "", true);
        Atributos h = new Atributos("LINGUAGEM DE PROGRAMAÇÃO FAVORITA", "", true);
        Atributos i = new Atributos("ESPORTES", "", true);
        Atributos j = new Atributos("GAMES FAVORITOS", "", true);
        Atributos k = new Atributos("INTERESSES", "", true);
        listaAtributo.add(a);
        listaAtributo.add(b);
        listaAtributo.add(c);
        listaAtributo.add(d);
        listaAtributo.add(e);
        listaAtributo.add(f);
        listaAtributo.add(g);
        listaAtributo.add(h);
        listaAtributo.add(i);
        listaAtributo.add(j);
        listaAtributo.add(k);
    }

    //EXIBIR LISTA DE ATRIBUTO
    public void exibirListaAtributo()
    {
        for(Atributos i : this.listaAtributo)
        {
                System.out.println("->" + i.getNome() + ":\n" + i.getDescricao() + "\n");
        }
    }

    //EXIBIÇÃO PARA A TELA DE EDIÇÃO DE ATRIBUTOS 
    public void exibirListaAtributoEditar()
    {
        int j = 0;
        for(Atributos i : this.listaAtributo)
        {
                System.out.println("["+ j +"] ->" + i.getNome() + ":\n" + i.getDescricao() + "\n");
                j++;
        }
    }

    //EXIBIR ATRIBUTOS NÃO NATIVOS
    public void exibirListaAtributoNativo()
    {
        int j = 0;
        for(Atributos i : this.listaAtributo)
        {
                if(!(i.getPadrao()))
                {
                    System.out.println("["+ j +"] ->" + i.getNome() + ":\n" + i.getDescricao() + "\n");
                }
                j++;
        }
    }

    
}
