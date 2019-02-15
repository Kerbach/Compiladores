package aula01;

/* Classe simples que representa um token
 */
public class Token
{

    private char type;    // tipo do token
    private double value; // valor do token numerico, para tipo "n"

    // Construtor de um token de operador, pois recebe apenas o tipo
    public Token(char type)
    {
        this.type = type;
        this.value = 0;
    }

    // Construtor de um token numerico, pois recebe apenas um "double"
    public Token(double value)
    {
        this.type = 'n';
        this.value = value;
    }

    // Metodo para retornar o tipo
    public char getType()
    {
        return this.type;
    }

    // Metodo para retornar o valor
    public double getValue()
    {
        return this.value;
    }

    // Metodo para converter este objeto em string, usado para impressao na tela
    public String toString()
    {
        if (this.type == 'n')
        {
            return "[" + this.type + "," + this.value + "] ";
        }
        else
        {
            return "[" + this.type + "] ";
        }
    }
}
