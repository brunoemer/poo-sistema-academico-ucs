Universidade de Caxias do Sul - Centro de Computação e Tecnologia da Informação 

O Problema do Sistema Acadêmico - Segunda Etapa

Objetivos: 

    *

      Desenvolver um modelo orientado a objetos utilizando conceitos de polimorfismo.
    *

      Empregar conceitos que facilitam a manutenção e o reuso de software.

Descrição geral:

O projeto envolve o desenvolvimento de um modelo de classes para o problema abaixo e a implementação dessas classes na linguagem de programação Java.

O Sistema deverá incluir classes que definem uma interface do sistema com o usuário. É importante que as classes de interface com usuário realizem toda a interação (outras classes, do núcleo do sistema, não devem envolver elementos de interface com usuário)

O resultado do projeto será um programa em Java documentado com comentários javadoc.

O projeto deve ser desenvolvido em grupos (máximo 2 alunos)

O Problema:

A proposta é complementar o sistema desenvolvido no projeto do Sistema Acadêmico, incluindo:

    *

      Um único método de ordenação (implementado pelo grupo) comum a todas as listas disponíveis no projeto (usando polimorfismo). Não deve-se usar os métodos de ordenação já disponíveis nas Bibliotecas de classes do Java. Métodos aceitáveis de ordenação podem ser por inserção, quicksort, ou outro método com uma eficiência razoável (não aceitamos bubblesort ou seleção).
    * Uso do sistema de tratamento de exceções.

Outros requisitos:

    *

      O sistema deve incluir uma lista geral de alunos e listas de alunos matriculados nas turmas. Os alunos presentes nas listas das turmas devem estar também na lista geral (só é possível matricular nas turmas os alunos já cadastrados na universidade)
    *

      O modelo de classes deve refletir o fato de que uma disciplina pode ter várias turmas.

Descrição do Problema no primeiro projeto:

Uma universidade precisa desenvolver um sistema para o controle dos seus alunos, disciplinas, turmas e professores. O sistema deve considerar que a universidade mantém diversas informações sobre seus alunos como: nome, endereço, curso em que está matriculado, etc. O mesmo acontece com os professores: nome, endereço, turmas às quais está vinculado.

As turmas possuem um código e nome, além de detalhes de horário, local, professor e uma relação de alunos matriculados. Alguns processos importantes incluem matricular e cancelar a matrícula de alunos nas turmas. O sistema precisa também ser capaz de ordenar listas de alunos alfabeticamente.

Um aspecto importante a ser observado é o de que cada classe desenvolvida neste projeto deve ter "responsabilidades" bem definidas e limitar-se a essas responsabilidades. Por exemplo, a classe que implementa uma lista de alunos não pode incluir interação com o usuário ... que é um problema da classe de interface com usuários.


Avaliação:

A avaliação será realizada com base nos seguintes elementos:

    *

      na análise da estrutura do programa fonte: o projeto deve estar bem estruturado e empregando o estilo de programação orientado a objetos (o resultado esperado é um bom modelo de objetos),
    *

      na funcionalidade implementada
    *

      na documentação apresentada para o projeto por meio dos comentários javadoc nos programas.
    * no uso de abstração pelo menos para a implementação da ordenação.

Data para entrega do trabalho:

Entrega: 07/07/2007
No UCSvirtual

Observação Importante: incentivamos a "troca de idéias" entre alunos, no entanto não será aceita a "troca de programas".
