import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import java.io.IOException;

public class MarcalLang {
  public static void main (String[] args) {
    String inputFileName = "src/input.txt";
    MarcalLangParser parser = getParser(inputFileName);

    ParseTree ast = parser.program();
    ParseTreeWalker walker = new ParseTreeWalker();
    MarcalLangListener listener = new MyListener();
    walker.walk(listener, ast);

    System.out.println(ast.toStringTree(parser));
  }

  private static MarcalLangParser getParser(String filename){
    MarcalLangParser parser = null;
    try {
      CharStream input = CharStreams.fromFileName(filename);
      MarcalLangLexer lexer = new MarcalLangLexer(input);
      CommonTokenStream tokens = new CommonTokenStream(lexer);
      parser = new MarcalLangParser(tokens);

    } catch (IOException e) {
      System.out.println("Erro: " + e.getMessage());
    }
    return parser;
  }
  
}
