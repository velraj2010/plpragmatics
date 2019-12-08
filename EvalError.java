public class EvalError extends Exception {
    public static final String INCOMPATIBLE_ARG_TYPES = "Evaluation error: Incompatible arg types";
    public static final String OPERATION_NOT_SUPPORTED = "Evaluation error: Operation not supported";
    EvalError() { super(); }
    public EvalError(String s) { super(s); }
}
