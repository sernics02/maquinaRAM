package Registers;

public class IntegerRegister implements Register {
  public IntegerRegister() {
    value = 0;
  }
  public IntegerRegister(int value) {
    this.value = value;
  }
  public Integer getValue() {
    return value;
  }
  public void setValue(int value) {
    this.value = value;
  }
  public void print() {
    System.out.print(value);
  }
  private int value;
}
