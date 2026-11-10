# language: pt

Funcionalidade: Calcular operações matemáticas

  Esquema do Cenário: mostrar o resultado quando executar uma operação na calculadora
    Dado que a calculadora está disponível
    Quando calcular <numero1> e <numero2> usando "<operacao>"
    Então o resultado deve ser <resultado>

    Exemplos:
      | numero1 | numero2 | operacao      | resultado |
      | 4       | 2       | soma          | 6         |
      | 4       | 2       | subtração     | 2         |
      | 4       | 2       | multiplicação | 8         |
      | 4       | 2       | divisão       | 2         |
      | 0       | 5       | soma          | 5         |
      | 5       | 0       | subtração     | 5         |