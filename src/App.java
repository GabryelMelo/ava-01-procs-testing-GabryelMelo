class App {
  public static void main(String[] args) {
    System.out.println("Olá mundo!");

    int dividendo = 5;
    int divisor = 2;
    int resto = Matematica.resto(dividendo, divisor);
    // print:
    System.out.println(resto); // Deve imprimir: 1
    // assertiva:
    // System.out.println(resto == 1); // Deve imprimir: true
    // mais assertivas: (devem imprimir true)
    // System.out.println(Matematica.resto(10, 4) == 2);
    // System.out.println(Matematica.resto(29, 5) == 4);
    // adicione mais 3 casos de teste na forma de prints e assertivas
  }
}
