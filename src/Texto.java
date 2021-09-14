class Texto {
  // IMPLEMENTE!
  public static String pad(String umaString, int largura, char umCaractere) {
    String resultado = umaString;

    for (int i = umaString.length(); i < largura; i++) {
      resultado += umCaractere;
    }

    return resultado;
  }
}
