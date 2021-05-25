public class Teste {
  public static void main(String[] args) {
    Menu [] vetor = new Menu[2];
    vetor[0] = new CafeMenu();
    vetor[1] = new PancakeHouseMenu();
    Garconete garconete =  new Garconete (vetor);
    garconete.printMenu();
  }
}
