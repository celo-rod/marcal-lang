import java.util.List;

public class FunctionSignature {
  private String name;
  private String returnType;
  private List<String> parameterTypes;

  public FunctionSignature(String name, String returnType, List<String> parameterTypes) {
    this.name = name;
    this.returnType = returnType;
    this.parameterTypes = parameterTypes;
  }

  public String getName() {
    return name;
  }

  public String getReturnType() {
    return returnType;
  }

  public List<String> getParameterTypes() {
    return parameterTypes;
  }
}