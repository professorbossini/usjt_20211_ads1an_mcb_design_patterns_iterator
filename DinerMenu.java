public class DinerMenu implements Menu{
  private MenuItem [] itens;

  // public void addItem (String nome, String descricao, boolean vegetariano, double preco){

  // }
  public DinerMenu(){
    itens = new MenuItem[6];
    itens[0] = new MenuItem ("VBAT", "Bacon (vegano) com alface e tomate", true, 7.99);
    itens[1] = new MenuItem ("BAT", "Bacon com alface e tomate", false, 10.99);
    itens[2] = new MenuItem ("Caldo do dia", "Caldo do dia, acompanha pão francês", false, 8.99);
    itens[3] = new MenuItem ("Cachorro quente", "Um cachorro quente comum", false, 7.99);

  }

  public MenuItem[] getItens() {
    return itens;
  }

  public Iterator <MenuItem> createIterator(){
    return new DinerMenuIterator(itens);
  }
}
