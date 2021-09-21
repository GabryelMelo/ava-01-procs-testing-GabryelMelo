class App {
  public static void main(String[] args) {
    System.out.println("Olá mundo!");

    int dividendo = 5;
    int divisor = 2;
    int resto = Matematica.resto(dividendo, divisor);
    // print:
    System.out.println(resto); // Deve imprimir: 1
    // assertiva:
    System.out.println(resto == 1); // Deve imprimir: true
    // mais assertivas: (devem imprimir true)
    System.out.println(Matematica.resto(10, 4) == 2);
    System.out.println(Matematica.resto(29, 5) == 4);
    // adicione mais 3 casos de teste na forma de prints e assertivas
    System.out.println(Matematica.resto(125, 8) == 5);
    System.out.println(Matematica.resto(334, 12) == 10);
    System.out.println(Matematica.resto(91, 14) == 7);

    // Texto \\
    String umaString = "tads"; // length 4
    int largura = 10; // length desejado
    char umCaractere = '!'; // preste atenção às aspas simples

    String resultado = Texto.pad(umaString, largura, umCaractere);

    // tads sucedido por 6 exclamações para alcançar length 10
    System.out.println(resultado); // Deve imprimir: tads!!!!!!

    // assertivas
    System.out.println(resultado.length() == 10); // Deve imprimir: true
    System.out.println(resultado.equals("tads!!!!!!")); // Deve imprimir: true

    System.out.println(Texto.pad("oi", 5, '*').equals("oi***")); // true

    // caso especial: length da string maior que a largura deixa inalterada
    System.out.println(Texto.pad("logica", 5, '*').equals("logica"));
    System.out.println(Texto.pad("logica", 5, '*').length() == 6);
    // string vazia, print:
    System.out.println(Texto.pad("", 8, '#')); // ########
    // assertiva
    System.out.println(Texto.pad("", 8, '#').equals("########")); // true

    // Adicione mais 3 casos de teste,
    // um deles para o caso especial de largura negativa:
    System.out.println(Texto.pad("***IFRS", 10, '*').equals("***IFRS***"));
    System.out.println(Texto.pad("logica", -3, '#').equals("logica"));
    System.out.println(Texto.pad("ABC", 5, '+').length() == 5);

    // Excel\\
    String column = "AB";

    // prints (perceba a necessidade de criar uma classe Excel)
    System.out.println(Excel.columnNumber(column)); // 28

    // assertivas
    System.out.println(Excel.columnNumber(column) == 28); // true
    System.out.println(Excel.columnNumber("A") == 1); // true
    System.out.println(Excel.columnNumber("C") == 3); // true
    System.out.println(Excel.columnNumber("Z") == 26); // true
    System.out.println(Excel.columnNumber("ZY") == 701); // true
    System.out.println(Excel.columnNumber("TADS") == 352319); // true
    // adicione mais 3 casos de teste
    System.out.println(Excel.columnNumber("IFRS") == 162727); // true
    System.out.println(Excel.columnNumber("POO") == 11221); // true
    System.out.println(Excel.columnNumber("JAVA") == 177009); // true

    //Cifra de Cesar\\
    String frase = "DEF";
    int girar = 3;
    //String resultado = String.valueOf(fraseAtt);

    // print
    System.out.println(Cifra.cifraCesar(frase, girar)); // ABC

    // assertivas
    System.out.println(Cifra.cifraCesar("VQREQFGT", 2).equals("TOPCODER")); // true
    System.out.println(Cifra.cifraCesar("ABCDEFGHIJKLMNOPQRSTUVWXYZ", 10).equals("QRSTUVWXYZABCDEFGHIJKLMNOP")); // true
    System.out.println(Cifra.cifraCesar("TOPCODER", 0).equals("TOPCODER")); // true
    System.out.println(Cifra.cifraCesar("ZWBGLZ", 25).equals("AXCHMA")); // true
    System.out.println(Cifra.cifraCesar("DBNPCBQ", 1).equals("CAMOBAP")); // true
    System.out.println(Cifra.cifraCesar("LIPPSASVPH", 4).equals("HELLOWORLD")); // true
    // adicione mais 3 casos de teste
    System.out.println(Cifra.cifraCesar("QNZA", 60).equals("IFRS")); // true
    System.out.println(Cifra.cifraCesar("YFIX", 31).equals("TADS")); // true
    System.out.println(Cifra.cifraCesar("DFCQSRWASBHCGSHSGHOUSA", 14).equals("PROCEDIMENTOSETESTAGEM")); // true
    System.out.println(Cifra.cifraCesar("DAMN", -5).equals("IFRS")); // true

  }
}
