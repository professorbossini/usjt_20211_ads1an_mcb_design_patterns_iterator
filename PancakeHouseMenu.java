import java.util.ArrayList;
import java.util.List;

public class PancakeHouseMenu implements Menu{
  private List <MenuItem> itens;

  public void addItem (String nome, String descricao, boolean vegetariano, double preco){
    itens.add(new MenuItem (nome, descricao, vegetariano, preco));
  }

  public PancakeHouseMenu (){
    itens = new ArrayList<>();
    addItem("Panqueca N1", "Panqueca com torrada", true, 11.99);
    addItem ("Panqueca N2", "Panqueca com ovos fritos e salsicha", false, 12.99);
    addItem("Panqueca de mirtilo", "Panquecas feitas com mirtilo fresco", true, 15.99);
    addItem ("Waffles", "Waffles. Escolha entre mirtilo e morango", true, 16.99);
  }

  public List<MenuItem> getItens() {
    return itens;
  }

  public Iterator <MenuItem> createIterator(){
    return new PancakeHouseIterator (itens);
  }

}
