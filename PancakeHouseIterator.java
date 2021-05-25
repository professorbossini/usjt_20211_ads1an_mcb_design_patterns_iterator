import java.util.List;

public class PancakeHouseIterator implements Iterator <MenuItem>{

  private List <MenuItem> itens;
  private int contador = 0;

  public PancakeHouseIterator (List <MenuItem> itens){
    this.itens = itens;
  }

  @Override
  public boolean hasNext() {
    return contador < itens.size() && itens.get(contador) != null;
  }

  @Override
  public MenuItem next() {
    return itens.get(contador++);
  }
  
}
