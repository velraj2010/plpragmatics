// Copyright (c) 2019 Boomi, Inc.

/**
 * @author velraj.
 */
public class AssnExp extends Expr {
    private String _id;
    private Expr _expr;
    private Env _env;

    public AssnExp(String id, Expr expr) {
        _id = id;
        _expr = expr;
    }

    public Env getEnv(){
        return _env;
    }

    public Value eval(Env e) throws EvalError {
        Value val  = _expr.eval(e);
        _env = e.addBinding(_id, val);
        return val;
    }

    public String toString() {
        return _id + ":=" + _expr.toString();
    }
}
