/*
Tipos Primitivos - Convenções de Variáveis

Joana está criando um sistema e precisa nomear suas variáveis seguindo boas práticas.
Explique quais são as convenções de nomenclatura para variáveis em Java e dê 3 exemplos corretos.
*/
    /** Convenções de Nomenclatura
     1- Não utilizar caracteres especiais no início do nome da variável
        Errado: @variavel, #valor
        Certo: variavel, valorTotal
     1.1- Não começar com números ou caracteres especiais
        Errado: 1idade, @valor, #quantidade.
        Certo: idade1, valorTotal, quantidadeItens.

     2- Variável deve ser em camelCase e descritiva
        Exemplo: nomeDoProduto, numeroDePessoas, valorTotal
     2.1- Não usar abreviações vagas
        Exemplo de bom nome: nomeDoProduto, não 'np' ou 'produtoX'
     2.2- Use nomes claros e completos
        Exemplo: totalDeVendas ao invés de 'totVendas'

     3- Evitar o uso de palavras reservadas
         Errado: class, int, public.
         Certo: quantidadeDeProdutos, idadeDoUsuario, valorFinal.

     4- Evitar o uso de caracteres especiais, como espaços, hífens e acentos
         Errado: nome do produto, preço-do-item, número de vendas.
         Certo: nomeDoProduto, precoDoItem, numeroDeVendas.

     5- Usar letras minúsculas para palavras simples e maiúsculas para constantes
        Variáveis em geral devem ser em minúsculas, mas constantes (valores que não mudam) devem ser em letras maiúsculas com palavras separadas por underscore (_).
             Exemplo correto:
                Variáveis: totalDeItens, valorUnitario.
                Constantes: MAX_VALOR, TAXA_DE_IMPOSTO.
     6- Prefira nomes em inglês
        Em equipes internacionais, e para manter um padrão universal, é recomendado usar inglês para os nomes das variáveis.
             Certo: numberOfItems, totalAmount.
             Errado: numeroDeItens, valorTotal.
    **/
