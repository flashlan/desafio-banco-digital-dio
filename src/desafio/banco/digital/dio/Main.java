/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafio.banco.digital.dio;

/**
 *
 * @author Everton Luiz Kozloski - evertonkozloski@hotmail.com
 */
public class Main {
    
    public static void main(String[] args) {
        Cliente fulano = new Cliente();
        fulano.setNome("Fulano");
        
        Conta cp = new ContaPoupanca(fulano);
        Conta cc = new ContaCorrente(fulano);
        
        cc.depositar(100);
        cc.transferir(100, cp);

        //System.out.println();
        cc.imprimirExtrato();
        cp.imprimirExtrato();
        
    }
    
}
