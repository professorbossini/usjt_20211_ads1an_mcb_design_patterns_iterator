public class DinerMenuIterator implements Iterator <MenuItem>{

  private MenuItem [] itens;
  private int contador = 0;

  public DinerMenuIterator (MenuItem[] itens) {
    this.itens = itens;
  }
  @Override
  public boolean hasNext() {
    return contador < itens.length && itens[contador] != null;
  }

  @Override
  public MenuItem next() {
    return this.itens[contador++];
  }
  
}
