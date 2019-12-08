// Copyright (c) 2019 Boomi, Inc.

/**
 * @author velraj.
 */
public final class ExprUtil {
    private ExprUtil(){}

    public static Value evaluate(Value value1, Value value2, BinOp binOp) throws EvalError{
        switch (binOp.getType()) {
            case ARITHMETIC:
            case LOGICAL:
                return evaluateArithmeticAndLogical(value1, value2, binOp);
            case RELATIONAL:
                return evaluateRelational(value1, value2, binOp);
        }
        return null;
    }

    private static Value evaluateArithmeticAndLogical(Value value1, Value value2, BinOp binOp) throws EvalError {
        if(!(value1 instanceof IntVal) ||
                !(value2 instanceof IntVal)) {
            throw new EvalError(EvalError.INCOMPATIBLE_ARG_TYPES);
        }
        IntVal intVal1 = (IntVal) value1;
        IntVal intVal2 = (IntVal) value2;
        switch (binOp) {
            case PLUS:
                return new IntVal(intVal1.value + intVal2.value);
            case MINUS:
                return new IntVal(intVal1.value - intVal2.value);
            case TIMES:
                return new IntVal(intVal1.value * intVal2.value);
            case DIV:
                return new IntVal(intVal1.value / intVal2.value);
            case OR:
                return new IntVal(intVal1.value | intVal2.value);
            case AND:
                return new IntVal(intVal1.value & intVal2.value);
            default:
                return null;
        }
    }

    private static Value evaluateRelational(Value value1, Value value2, BinOp binOp) throws EvalError {
        if(!(value1 instanceof IntVal) ||
                !(value2 instanceof IntVal)) {
            throw new EvalError(EvalError.INCOMPATIBLE_ARG_TYPES);
        }
        IntVal intVal1 = (IntVal) value1;
        IntVal intVal2 = (IntVal) value2;
        switch (binOp) {
            case LT:
                return new BoolVal(intVal1.value < intVal2.value);
            case EQ:
                return new BoolVal(intVal1.value == intVal2.value);
            default:
                return null;
        }
    }

}
