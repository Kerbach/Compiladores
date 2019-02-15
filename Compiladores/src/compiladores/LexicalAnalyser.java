package compiladores;


import java.util.ArrayList;

/* Implementa um analisador lexico para expressoes aritmeticas
 */
public class LexicalAnalyser
{

    private String input; // armazena a string a ser analisada
    private int index;    // indica a posicao do proximo caracter a ser lido

    /* Construtor desta classe, recebe a string a ser analisada e
     * inicializa os dois atributos privados
     */
    public LexicalAnalyser(String s)
    {
        input = s + "$"; // adiciona um caracter para indicar o final da string
        index = 0;
    }

    /* Metodo privado que analisa a string e retorna o proximo token encontrado,
     * na forma de um objeto do tipo "Token", avancando neste processo o
     * atributo "index"
     */
    private Token getToken()
    {
        // Consome quaisquer espacos que estejam presentes a partir do indice atual

        // Verifica se encontrou um operador, retornando o mesmo na forma de token
        // Caso contrario...
        // Verifica se e um digito, analisando ate o final de um numero valido
        // Repete verificacao para obter toda a parte inteira do numero
        // Se encontrar um ponto, tenta obter parte fracionaria do mesmo
        // Converte o trecho da input que contem o numero para um
        // valor "double" e retorna um token numerico
    }

    /* Metodo que efetua toda a analise, repetindo a leitura de tokens
     * ate que a input termine ou que aconteca um erro, retornando um
     * vetor de tokens
     */
    public ArrayList<Token> run()
    {
        ArrayList<Token> tokens = new ArrayList<Token>(); // declaracao de um vetor de tokens
        Token token;
        while ((token = getToken()) != null)
        {
            tokens.add(token);
        }
        return tokens;
    }
}
