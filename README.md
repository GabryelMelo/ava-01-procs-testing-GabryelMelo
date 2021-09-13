# Avaliação 01 Procedimentos e Testagem

Link do GitHub Classroom <https://classroom.github.com/a/kYeCCTUo>



## Implementar usando métodos e testar segundo as especificações

Esta atividade é avaliada e o esforço é estimado entre 4 e 8 horas.

Copie os casos de teste para o método `main` em [App.java](src/App.java), conforme o exemplo que já está no arquivo. Comente as linhas com `//` ou `/*` e `*/` e as descomente conforme for implementando.

Se houver um caso de teste incorreto, avise o professor e faça o ajuste. Mas, **IMPORTANTE**, a especificação não pode ser alterada, isto é, **não altere os nomes das classes, métodos ou mude a quantidade de parâmetros e tipo de retorno**, a não ser que a atividade deixe livre para esta escolha.



### Resto da divisão

Implementar um método que, dado um divisor e dividendo, ambos não-negativos, calcule o resto da divisão de forma que passe nas assertivas a seguir. Implementa na classe [Matematica](src/Matematica.java).

**Não pode ser usado o operador módulo `%`!**

```java
// parâmetros
int dividendo = 5;
int divisor = 2;
// retorno
int resto = Matematica.resto(dividendo, divisor);
// print:
System.out.println(resto); // Deve imprimir: 1
// assertiva:
System.out.println(resto == 1); // Deve imprimir: true
// mais assertivas: (devem imprimir true)
System.out.println(Matematica.resto(10, 4) == 2);
System.out.println(Matematica.resto(29, 5) == 4);
// adicione mais 3 casos de teste na forma de prints e assertivas
```



### Preencher String

Considere uma _string_, uma largura e um caractere para preenchimento. Implementar o método `pad` que faz o preenchimento de uma _string_ com um _char_ específico para obter um _length_ esperado. Implemente na classe [Texto](src/Texto.java) considerando os seguintes casos de teste:

```java
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
```



### Excel Sheet Column Number

Extraído de LeetCode em <https://leetcode.com/problems/excel-sheet-column-number/>

Considere uma _string_ que representa a coluna de uma planilha do Excel. Escreva um método que retorne o número correspondente. Por exemplo:

```plain
A -> 1
B -> 2
C -> 3
...
Z -> 26
AA -> 27
AB -> 28
...
ZY -> 701
```

**Restrições:**

- 1 <= `coluna.length` <= 6
- `coluna` sempre de `A` a `Z` maiúsculas sem acentos
- `coluna` no intervalo de `"A" ... "ZZZZZZ"`

Casos de Teste:

```java
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
```



### Cifra de César

Extraído de URI online judge em: <https://www.urionlinejudge.com.br/judge/pt/problems/view/1253>

Júlio César usava um sistema de criptografia, agora conhecido como Cifra de César, que trocava cada letra pelo equivalente em duas posições adiante no alfabeto (por exemplo, 'A' vira 'C', 'R' vira 'T', etc.). Ao final do alfabeto nós voltamos para o começo, isto é 'Y' vira 'A'. Nós podemos, é claro, tentar trocar as letras com quaisquer número de posições.

**Entrada**

A entrada contém dois parâmetros: uma string com até 50 caracteres maiúsculos ('A'-'Z'), que é a sentença após ela ter sido codificada através desta Cifra de César modificada, e um número que varia de 0 a 25 e que representa quantas posições cada letra foi deslocada para a direita.

**Saída**

Para cada caso de teste de entrada, imprima uma linha de saída com o texto decodificado (transformado novamente para o texto original) conforme as regras acima e o exemplo abaixo.

```plain
Entrada: VQREQFGT, 2                    Saída: TOPCODER
Entrada: ABCDEFGHIJKLMNOPQRSTUVWXYZ, 10 Saída: QRSTUVWXYZABCDEFGHIJKLMNOP
Entrada: TOPCODER, 0                    Saída: TOPCODER
Entrada: ZWBGLZ, 25                     Saída: AXCHMA
Entrada: DBNPCBQ, 1                     Saída: CAMOBAP
Entrada: LIPPSASVPH, 4                  Saída: HELLOWORLD
```

**Escreva os exemplos acima na forma de casos de teste.**

* * *

Deu certo [:)](memes/yes.jpg) Deu errado [:(](memes/no.jpg)
