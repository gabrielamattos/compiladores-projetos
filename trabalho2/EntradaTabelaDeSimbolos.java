/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author (versao original): Daniel
 * @author (modificacoes): Grupo 3
 * A classe EntradaTabelaDeSimbolos representa uma entrada na tabela de simbolos, que eh composta de quatro campos: o nome do simbolo,
 * o tipo do simbolo, a lista de parametros associada ao nome, no caso de o nome ser de uma funcao ou um procedimento e uma tabela de simbolos
 * associada ao nome, no caso de o nome representar um registro. Esses campos podem assumir o valor null quando nao forem necessarios.
 */
public class EntradaTabelaDeSimbolos {
    private String nome, tipo;
    private List<String> parametros;
    private TabelaDeSimbolos subTabeladoRegistro;
    private String valor;
    private String dispositivo;
    
    public EntradaTabelaDeSimbolos(String nome, String tipo, List<String> listaPassada, TabelaDeSimbolos sub, String valor) 
    {
        this.nome = nome;
        this.tipo = tipo;
        this.subTabeladoRegistro = sub;
        this.valor = valor;
        this.parametros = listaPassada;   
        this.dispositivo = null;
    }
    
    public EntradaTabelaDeSimbolos(String nome, String tipo, List<String> listaPassada, TabelaDeSimbolos sub) 
    {
        this.nome = nome;
        this.tipo = tipo;
        this.subTabeladoRegistro = sub;
        this.valor = null;
        this.dispositivo = null;
        
        if(listaPassada == null)
        {
            this.parametros = listaPassada;
        }else
        {
	    //inicializacao dos parametros
            this.parametros = new ArrayList<String>();
        
            for(int i=0; i< listaPassada.size(); i++)
            {
               this.parametros.add(i,listaPassada.get(i));
            }
        }

        
    }
    
    //Construtor da entrada da tabela de símbolos quando se trata de um pino
    public EntradaTabelaDeSimbolos(String tipo, String valor, String dispositivo) 
    {
        this.nome = null;
        this.tipo = tipo;
        this.subTabeladoRegistro = null;
        this.valor = valor;
        this.parametros = null;  
        this.dispositivo = dispositivo;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public String getDispositivo()
    {
        return this.dispositivo;
    }
    
    public String getValor()
    {
        return this.valor;
    }
    
    public TabelaDeSimbolos getsubTabela()
    {
        return this.subTabeladoRegistro;
    }
    
    public List<String> getListaPar()
    {
        return this.parametros;
    }
            
    
    public String getTipo() {
        return this.tipo;
    }
    
    @Override
    public String toString() {
        return nome+"("+tipo+")";
    }
}
