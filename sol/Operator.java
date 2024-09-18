package sol;

import src.IExpression;

public class Operator implements IExpression {
    public char operator;
    public IExpression left;
    public IExpression right;

    public Operator(char operator, IExpression left, IExpression right) {
        this.operator = operator;
        this.left = left;
        this.right = right;
    }
}
