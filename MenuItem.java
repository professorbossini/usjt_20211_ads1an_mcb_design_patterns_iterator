public class MenuItem extends MenuComponent{
  private String nome;
  private String descricao;
  private boolean vegetariano;
  private double preco;

  public MenuItem (String nome, String descricao, boolean vegetariano, double preco){
    setNome(nome);
    setDescricao(descricao);
    setVegetariano(vegetariano);
    setPreco(preco);
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public void setVegetariano(boolean vegetariano) {
    this.vegetariano = vegetariano;
  }

  public void setPreco(double preco) {
    this.preco = preco;
  }

  public String getNome() {
    return nome;
  }

  public String getDescricao() {
    return descricao;
  }

  public double getPreco() {
    return preco;
  }
  public boolean isVegetariano() {
    return vegetariano;
  }

  @Override
  public String toString() {
    return String.format(
      "Nome: %s\nDescrição: %s\nVegetariano: %s\nPreço: %.2f",
      nome, descricao, vegetariano ? "Sim" : "Não", preco
    );
  }

  @Override
  public void print() {
    System.out.println(this);
  }
}