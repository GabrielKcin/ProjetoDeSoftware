import java.util.ArrayList;

public class Perfil
{
    ArrayList<Atributos> listaAtributo;

    public Perfil()
    {
        this.listaAtributo = new ArrayList<Atributos>();
        Atributos a = new Atributos("LOCAL DE TRABALHO:", "", true, true);
        Atributos b = new Atributos("ESCOLA DE ENSINO MÉDIO:", "", true, true);
        Atributos c = new Atributos("FACULDADE:", "", true, true);
        Atributos d = new Atributos("CIDADE ATUAL:", "", true, true);
        Atributos e = new Atributos("CIDADE NATAL:", "", true, true);
        Atributos f = new Atributos("ESTADO CIVIL:", "", true, true);
        Atributos g = new Atributos("TIME DE FUTEBOL FAVORITO", "", true, true);
        Atributos h = new Atributos("LINGUAGEM DE PROGRAMAÇÃO FAVORITA:", "", true, true);
        Atributos i = new Atributos("ESPORTES:", "", true, true);
        Atributos j = new Atributos("GAMES FAVORITOS:", "", true, true);
        Atributos k = new Atributos("INTERESSES:", "", true, true);
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

    
}
