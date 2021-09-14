class Matematica {
  // IMPLEMENTE!
  public static int resto(int dividendo, int divisor) {

    int resp = dividendo;

    while (resp > divisor) {
      resp -= divisor;
    }

    return resp;
  }

}
