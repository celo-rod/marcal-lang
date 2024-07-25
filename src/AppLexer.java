import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import java.io.IOException;

public class AppLexer {
  public static void main (String[] args) {
    String inputFileName = "src/input.txt";
    try {
      CharStream input = CharStreams.fromFileName(inputFileName);
      MarcalLangLexer lexer = new MarcalLangLexer(input);
      CommonTokenStream tokens = new CommonTokenStream(lexer);
      MarcalLangParser parser = new MarcalLangParser(tokens);
      ParseTree tree = parser.program();
      System.out.println(tree.toStringTree(parser));

    } catch (IOException e) {
      System.out.println("Erro: " + e.getMessage());
    }
  }
}
