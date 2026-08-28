# Base de Animais — Versão 0.1

Esta base contém características iniciais utilizadas pelo PetMatch para
calcular a compatibilidade entre o perfil do usuário e diferentes animais.

As notas de 1 a 5 são parâmetros iniciais para o desenvolvimento do algoritmo.
Elas não representam uma avaliação veterinária individual e poderão ser
refinadas durante o desenvolvimento do projeto.

## Escala das características

### Atividade
- 1 = Muito baixa
- 2 = Baixa
- 3 = Média
- 4 = Alta
- 5 = Muito alta

### Espaço necessário
- 1 = Pouco espaço
- 2 = Espaço pequeno
- 3 = Espaço médio
- 4 = Espaço grande
- 5 = Muito espaço

### Necessidade de exercício
- 1 = Muito baixa
- 2 = Baixa
- 3 = Média
- 4 = Alta
- 5 = Muito alta

### Necessidade de interação
- 1 = Muito baixa
- 2 = Baixa
- 3 = Média
- 4 = Alta
- 5 = Muito alta

### Independência
- 1 = Muito dependente
- 2 = Dependente
- 3 = Moderada
- 4 = Independente
- 5 = Muito independente

### Tolerância a ficar sozinho
- 1 = Muito baixa
- 2 = Baixa
- 3 = Moderada
- 4 = Alta
- 5 = Muito alta

### Nível de cuidado
- 1 = Baixo
- 2 = Moderado/baixo
- 3 = Médio
- 4 = Alto
- 5 = Muito alto

### Custo
- 1 = Muito baixo
- 2 = Baixo
- 3 = Médio
- 4 = Alto
- 5 = Muito alto

### Exigência de treinamento
- 1 = Muito baixa
- 2 = Baixa
- 3 = Média
- 4 = Alta
- 5 = Muito alta

---

# Animais

| Animal | Atividade | Espaço | Exercício | Interação | Independência | Ficar sozinho | Cuidado | Custo | Treinamento |
|---|---:|---:|---:|---:|---:|---:|---:|---:|---:|
| Golden Retriever | 4 | 4 | 5 | 5 | 2 | 2 | 3 | 4 | 3 |
| Labrador Retriever | 5 | 4 | 5 | 5 | 2 | 2 | 3 | 4 | 3 |
| Border Collie | 5 | 5 | 5 | 5 | 2 | 1 | 5 | 4 | 5 |
| Shih Tzu | 3 | 2 | 2 | 4 | 2 | 3 | 4 | 3 | 3 |
| Pug | 2 | 2 | 2 | 4 | 3 | 3 | 4 | 3 | 3 |
| Dachshund | 3 | 2 | 3 | 4 | 3 | 2 | 3 | 3 | 4 |
| Bulldog Francês | 2 | 2 | 2 | 4 | 3 | 3 | 4 | 4 | 3 |
| Poodle | 4 | 3 | 4 | 5 | 3 | 2 | 4 | 4 | 4 |
| Gato adulto tranquilo | 2 | 1 | 1 | 3 | 5 | 5 | 2 | 3 | 1 |
| Gato adulto ativo | 4 | 2 | 3 | 4 | 4 | 4 | 2 | 3 | 2 |
| Gato filhote | 4 | 2 | 3 | 5 | 2 | 1 | 4 | 3 | 3 |

---

## Observação

As características dos animais podem variar de acordo com o indivíduo,
idade, saúde, ambiente, criação e outros fatores.

Por isso, o PetMatch deverá utilizar essas informações como parâmetros de
compatibilidade e não como uma garantia sobre o comportamento de um animal
específico.

A base deverá ser revisada e aprimorada durante o desenvolvimento do projeto.
