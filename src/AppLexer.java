import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;
import java.io.IOException;

public class AppLexer {
  public static void main (String[] args) {
    String inputFileName = "src/input.txt";
    try {
      CharStream input = CharStreams.fromFileName(inputFileName);
      MarcalLangLexer lexer = new MarcalLangLexer(input);
      Token token;
      while (!lexer._hitEOF) {
        token = lexer.nextToken();
        System.out.println("Token: " + token.toString());
        System.out.println("  Lexema: " + token.getText());
        System.out.println("  Classe: " + lexer.getVocabulary().getDisplayName(token.getType()));
      }

    } catch (IOException e) {
      System.out.println("Erro: " + e.getMessage());
    }
  }
}
