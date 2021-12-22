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
public class ContaCorrente extends Conta{

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }
    
    


    @Override
    public void imprimirExtrato() {
        System.out.println( " === EXTRATO CONTA CORRENTE ===");
        super.imprimirAtributosExtrato();
        //System.out.println(String.format("Data da transferencia: %.2f", this.saldo));
    }

    
    

    
  
    
}
