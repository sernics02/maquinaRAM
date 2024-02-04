package Instructions;

import Operands.BasicOperand;
import Registers.IntegerRegister;
import Registers.RegisterBank;

public class MulInstruction implements Instruction {
  public MulInstruction(RegisterBank registerBank, BasicOperand operand) {
    this.registerBank = registerBank;
    this.operand = operand;
  }
  public void operate() {
    registerBank.putRegister(
      0, 
      new IntegerRegister(registerBank.getRegisterValue(0) * operand.getValue(registerBank))
    );
  }
  private RegisterBank registerBank;
  private BasicOperand operand;
}