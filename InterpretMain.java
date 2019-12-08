import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;

public class InterpretMain {
    public static void main(String[] args) throws Exception {
		System.setErr(System.out);
		ANTLRInputStream input = new ANTLRInputStream(System.in);
		ProjLangLexer lexer = new ProjLangLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		ProjLangParser parser = new ProjLangParser(tokens);
		try {
			Expr expr = parser.input().e;
		    Env env = new EnvImp();
			env = env.addBinding("x", new IntVal(29) );
			env = env.addBinding("y", new IntVal(22) );
			//System.out.println(e.eval(emptyEnv));
			System.out.println("Expression is : " + expr);
			System.out.println("Evaluated Value: " + expr.eval(env));
			Expr idConst = new IDConst("x");
			if(expr instanceof AssnExp) {
				env = ((AssnExp) expr).getEnv();
				Value value = idConst.eval(env);
				System.out.println("Evaluated Value for x: " + value);
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
    }

    public static Value evaluateExpr(Expr expr, Env env) throws EvalError {
    	return expr.eval(env);
	}
}
