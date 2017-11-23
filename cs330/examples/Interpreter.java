import java.util.Scanner;
import BooLexer;
import CommonTokenStream;
import BooParser;
import ParseTree;
import ANTLRInputStream;

public class Interpreter {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("> ");
        while(in.hasNextLine()) {
            String line = in.nextLine();

            ANTLRInputStream ais = new ANTLRInputStream(line);

            BooLexer Lexer = new BooLexer(ais);
            CommonTokenStream tokens = new CommonTokenStream(lexer);

            BooParser parser = new BooParser(tokens);

            ParseTree tree = parser.expression();

            System.out.println(tree.toStringTree(parser));

            System.out.print("> ");
        }
    }
}
