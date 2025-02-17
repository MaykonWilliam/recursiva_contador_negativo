# Tarefa - ED - Recursividade 1
## Exercício 4
Criar uma função recursiva que exiba o total de elementos negativos de um vetor de inteiros de N posições.

O Código deve apresentar, em formato de comentário:
- Como foi definida a condição de parada;
- Como foi definida a relação de chamada dos passos.

A ideia para solucionar esse problema foi verificar se o último elemento do vetor é negativo, somar 1 caso seja, e chamar a função recursivamente passando `N-1` até que o valor de `N` seja 0, que é nosso ponto de parada.
