class Excel {

  public static int columnNumber(String column){

    int resultado = 0;

    for (int i = 0; i < column.length(); i++) {

      resultado *= 26;
      resultado += column.charAt(i) - 'A' + 1;

    }

    return resultado;
  }
}
