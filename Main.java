public class Main {
  public static void main(String[] args) {
    RamMachine ramMachine = new RamMachine("test/modificacion.ram", "inputs/input.txt", "outputs/output.txt");
    ramMachine.run(2);
  }
}
