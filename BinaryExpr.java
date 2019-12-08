// Copyright (c) 2019 Boomi, Inc.

/**
 * @author velraj.
 */
public class BinaryExpr extends Expr {
    private final Expr _expr1;
    private final Expr _expr2;
    private final String _operator;

    public BinaryExpr(Expr expr1, Expr expr2, String operator) {
        _expr1 = expr1;
        _expr2 = expr2;
        _operator = operator;
    }

    public Value eval(Env e) throws EvalError {
        BinOp binOp = BinOp.getBinOp(_operator);
        if(binOp == null) {
            throw new EvalError(EvalError.OPERATION_NOT_SUPPORTED);
        }
        Value value1 = _expr1.eval(e);
        Value value2 = _expr2.eval(e);
        if( !(value1 instanceof IntVal) ||
                !(value2 instanceof IntVal) ) {
            throw new EvalError(EvalError.INCOMPATIBLE_ARG_TYPES);
        }
        return ExprUtil.evaluate(value1, value2, binOp);
    }

    public String toString() {
        return _expr1 + _operator + _expr2;
    }
}
