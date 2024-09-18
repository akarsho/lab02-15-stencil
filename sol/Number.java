package sol;

import src.IExpression;

public class Number implements IExpression {
    public int num;

    public Number(int value, IExpression left, IExpression right) {
        this.num = value;
    }
}
