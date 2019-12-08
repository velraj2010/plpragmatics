// Copyright (c) 2019 Boomi, Inc.

/**
 * @author velraj.
 */
public class IDConst extends Expr {
    private String _id;
    public IDConst(String id) {
        _id = id;
    }

    public Value eval(Env e) throws EvalError {
        return e.lookup(_id);
    }

    public String toString() {
        return _id;
    }
}
