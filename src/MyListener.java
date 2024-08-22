import org.antlr.v4.runtime.*;

public class MyListener extends MarcalLangBaseListener {
  @Override
  public void enterEveryRule(ParserRuleContext ctx) {
    System.out.println("Entrou na regra: " + ctx.getText());
  }

  @Override
  public void exitEveryRule(ParserRuleContext ctx) {
    System.out.println("Saiu da regra: " + ctx.getText());
  }
}
