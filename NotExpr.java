// Copyright (c) 2019 Boomi, Inc.

/**
 * @author velraj.
 */
public class NotExpr extends Expr {

    private Expr _expr;
    public NotExpr(Expr expr) {
        _expr= expr;
    }
    public Value eval(Env e) throws EvalError {
        Value result = _expr.eval(e);
        if(!(result instanceof BoolVal)) {
            throw new EvalError("Evaluation error: Incompatible arg types");
        }
        return new BoolVal(!((BoolVal) result).value);
    }

    public String toString() {
        return String.valueOf("!" + _expr.toString());
    }
}
