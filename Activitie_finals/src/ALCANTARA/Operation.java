package ALCANTARA;

public class Operation {
    private double num1;
    private double num2;
    private int oper;
    private double answer;
    public void setNum1(double num1) {
        this.num1 = num1;
    }
    public void setNum2 (double num2) {
        this.num2 = num2;
    }
    public void setOper(int oper) {
        this.oper = oper;
    }
    public void Oper() {
        if(this.oper == 1) {
            this.answer = (num1 + num2);
        }else if(this.oper == 2) {
            this.answer = (num1 - num2);
        }else if(this.oper == 3) {
            this.answer = (num1 * num2);
        }else if (this.answer == 4) {
            this.answer = (num1 / num2);
        }
    }
    public double getAnswer() {
        return answer;
    }
}