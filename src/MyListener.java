import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Deque;
import java.util.ArrayDeque;
import java.util.ArrayList;

public class MyListener extends MarcalLangBaseListener {
  private final Deque<Map<String, String>> scopeStack = new ArrayDeque<>();
  private final Map<String, FunctionSignature> functionsTable = new HashMap<>();
  private String currentFunction;

  public MyListener() {
    scopeStack.push(new HashMap<>());
  }

  private Map<String, String> currentScope() {
    return scopeStack.peek();
  }

  private Deque<Map<String, String>> getScopeStack() {
    return scopeStack;
  }

  private String getType (String id) {
    for (Map<String, String> scope : getScopeStack()) {
      if (scope.containsKey(id)) {
        return scope.get(id);
      }
    }
    throw new RuntimeException("Variable " + id + " not declared");
  }

  private boolean isDeclared (String id) {
    for (Map<String, String> scope : getScopeStack()) {
      if (scope.containsKey(id)) {
        return true;
      }
    }
    return false;
  }

  private String getTypeOfFunctionCall(MarcalLangParser.FunctionCallContext ctx) {
    String funId = ctx.Id().getText();
    if (!functionsTable.containsKey(funId)) {
      throw new RuntimeException("Function " + funId + " not declared");
    }
    return functionsTable.get(funId).getReturnType();
  }

  private String getExprType (MarcalLangParser.ExprContext ctx) {
    if (ctx.NumI() != null) {
      return "FORCA";
    } else if (ctx.NumR() != null) {
      return "ENERGIA";
    } else if (ctx.Str() != null) {
      return "MENSAGEM";
    } else if (ctx.Id() != null) {
      return getType(ctx.Id().getText());
    } else if (ctx.OpAri() != null) {
      String leftType = getExprType(ctx.expr(0));
      String rightType = getExprType(ctx.expr(1));
      if (!leftType.equals(rightType)) {
        throw new RuntimeException("Type mismatch in arithmetic operation");
      }
      return leftType;
    } else if (ctx.OpRel() != null) {
      String leftType = getExprType(ctx.expr(0));
      String rightType = getExprType(ctx.expr(1));
      if (!leftType.equals(rightType)) {
        throw new RuntimeException("Type mismatch in relational operation");
      }
      return "DECISAO";
    } else if (ctx.OpLog() != null) {
      String leftType = getExprType(ctx.expr(0));
      String rightType = getExprType(ctx.expr(1));
      if (!leftType.equals("DECISAO") || !rightType.equals("DECISAO")) {
        throw new RuntimeException("Type mismatch in logical operation");
      }
      return "DECISAO";
    } else if (ctx.OpCon() != null) {
      return "MENSAGEM";
    } else if (ctx.AP() != null && ctx.FP() != null) {
      return getExprType(ctx.expr(0));
    } else if (ctx.functionCall() != null) {
      return getTypeOfFunctionCall(ctx.functionCall());
    }

    return "VAZIO";
  }

  @Override
  public void enterVarDeclarationNode (MarcalLangParser.VarDeclarationNodeContext ctx) {
    String id = ctx.Id().getText();
    String type = ctx.typeSpecifier().getText();

    if (isDeclared(id)) {
      throw new RuntimeException("Variable " + id + " already declared");
    }

    currentScope().put(id, type);

    if (ctx.expr() != null) {
      String exprType = getExprType(ctx.expr());
      if (!type.equals(exprType)) {
        throw new RuntimeException("Type mismatch in variable " + id);
      }
    }
  }

  @Override
  public void enterAssignmentNode (MarcalLangParser.AssignmentNodeContext ctx) {
    String id = ctx.Id().getText();
    String type = getType(id);
    String exprType = getExprType(ctx.expr());

    if (!isDeclared(id)) {
      throw new RuntimeException("Variable " + id + " not declared");
    }

    if (!type.equals(exprType)) {
      throw new RuntimeException("Type mismatch in variable " + id);
    }
  }

  @Override
  public void enterFunDeclarationNode (MarcalLangParser.FunDeclarationNodeContext ctx) {
    String id = ctx.Id().getText();
    String type = ctx.typeSpecifier().getText();

    if (functionsTable.containsKey(id)) {
      throw new RuntimeException("Function " + id + " already declared");
    }

    currentScope().put(id, type);

    getScopeStack().push(new HashMap<>());

    currentFunction = id;
  }

  @Override
  public void enterParamNode (MarcalLangParser.ParamNodeContext ctx) {
    List<String> parameterTypes = new ArrayList<>();
    for (int i = 0; i < ctx.Id().size(); i++) {
      String id = ctx.Id(i).getText();
      String type = ctx.typeSpecifier(i).getText();

      if (isDeclared(id)) {
        throw new RuntimeException("Variable " + id + " already declared");
      }

      currentScope().put(id, type);
      parameterTypes.add(type);
    }
    functionsTable.put(currentFunction, new FunctionSignature(currentFunction, getType(currentFunction), parameterTypes));
  }

  @Override
  public void exitFunDeclarationNode (MarcalLangParser.FunDeclarationNodeContext ctx) {
    getScopeStack().pop();
  }

  @Override
  public void enterFunctionCall (MarcalLangParser.FunctionCallContext ctx) {
    String id = ctx.Id().getText();

    if (!isDeclared(id)) {
      functionsTable.remove(id);
      throw new RuntimeException("Function " + id + " not declared");
    }

    if (ctx.expr() != null) {
      FunctionSignature signature = functionsTable.get(id);
      List<String> parameterTypes = signature.getParameterTypes();
      List<String> argumentTypes = new ArrayList<>();
      for (int i = 0; i < ctx.expr().size(); i++) {
        argumentTypes.add(getExprType(ctx.expr(i)));
      }

      if (!parameterTypes.equals(argumentTypes)) {
        throw new RuntimeException("Type mismatch in function call " + id);
      }
    }
  }

  @Override
  public void enterReturnStatementNode (MarcalLangParser.ReturnStatementNodeContext ctx) {
    String funType = getType(currentFunction);

    if (funType == "VAZIO") {
      throw new RuntimeException("Function " + currentFunction + " is void");
    }

    String exprType = getExprType(ctx.expr());

    if (!funType.equals(exprType)) {
      throw new RuntimeException("Type mismatch in return statement");
    }
  }

  @Override
  public void enterIfStatementNode (MarcalLangParser.IfStatementNodeContext ctx) {
    String exprType = getExprType(ctx.expr());

    if (!exprType.equals("DECISAO")) {
      throw new RuntimeException("Type mismatch in if statement");
    }

    getScopeStack().push(new HashMap<>());
  }

  @Override
  public void exitIfStatementNode (MarcalLangParser.IfStatementNodeContext ctx) {
    getScopeStack().pop();
  }

  @Override
  public void enterWhileStatementNode (MarcalLangParser.WhileStatementNodeContext ctx) {
    String exprType = getExprType(ctx.expr());

    if (!exprType.equals("DECISAO")) {
      throw new RuntimeException("Type mismatch in while statement");
    }

    getScopeStack().push(new HashMap<>());
  }

  @Override
  public void exitWhileStatementNode (MarcalLangParser.WhileStatementNodeContext ctx) {
    getScopeStack().pop();
  }

  @Override
  public void enterBlockNode (MarcalLangParser.BlockNodeContext ctx) {
    getScopeStack().push(new HashMap<>());
  }

  @Override
  public void exitBlockNode (MarcalLangParser.BlockNodeContext ctx) {
    getScopeStack().pop();
  }
}
