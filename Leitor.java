/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

 

/**
 *
 * @author Marcos
 */
import java.io.*;

/**
 * Esta classe define objetos capazes de realizar entrada de
 * dados. Os objetos desta classe podem ler dados simples
 * fornecidos pelo usuário via linha de comando. Os dados podem
 * ser do tipo "int" (número inteiro), "double" (número decimal) e
 * "String" (uma seqüência qualquer de caracteres).
 */

public class Leitor
{
    /**
     * método para leitura de números inteiros.
     *
     * @return um número do tipo primitivo int.
     */
    public int leiaInt()
    {
        int numero = 0;
        String linha ;
        BufferedReader entra = new BufferedReader(new InputStreamReader(System.in)) ;
        try
        {
            linha = entra.readLine() ;
            numero = Integer.valueOf(linha).intValue();
        }
        catch (Exception erro)
        {
            System.out.println("erro de entrada de dados");
        }
        return numero ;
    }

    /**
     * método para leitura de números decimais.
     *
     * @return um número do tipo primitivo double.
     */
    public double leiaDouble()
    {
        double numero = 0 ;
        String linha ;
        BufferedReader entra = new BufferedReader(new InputStreamReader(System.in)) ;
        try
        {
            linha = entra.readLine() ;
            numero = Double.valueOf(linha).doubleValue();
        }
        catch (Exception erro)
        {
            System.out.println("erro de entrada de dados");
        }
        return numero ;
    }

    /**
     * método para leitura de uma seqüência de caracteres.
     *
     * @return uma seqüência de caracteres do tipo String.
     */
    public String leiaString()
    {
        String linha = "";
        BufferedReader entra = new BufferedReader(new InputStreamReader(System.in)) ;
        try
        {
            linha = entra.readLine() ;
        }
        catch (Exception erro)
        {
            System.out.println("erro de entrada de dados");
        }
        return linha ;
    }


}
