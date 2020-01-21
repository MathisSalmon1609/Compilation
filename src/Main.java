import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;


public class Main {

    public static void main(String[] args) throws Exception {
        String file = args.length==0 ? "src/toto.exp" : args[0];

        CharStream input = CharStreams.fromFileName(file);
        calculLexer lexer = new calculLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        calculParser parser = new calculParser(tokens);
        int res= parser.exec();
        System.out.println("res = " + res);
    }
}
