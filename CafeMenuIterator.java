import java.util.Map;
public class CafeMenuIterator implements Iterator <MenuItem>{

  private Map <String, MenuItem> itens;
  private java.util.Iterator<MenuItem> iterator;

  public CafeMenuIterator (Map <String, MenuItem> itens){
    this.itens = itens;
    this.iterator = itens.values().iterator();
  }
  
  @Override
  public boolean hasNext() {
    return this.iterator.hasNext();
  }

  @Override
  public MenuItem next() {
    return this.iterator.next();
  }
  
}
