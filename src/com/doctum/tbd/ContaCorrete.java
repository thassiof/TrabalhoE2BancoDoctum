package com.doctum.tbd;
public class ContaCorrete extends Conta{

    public ContaCorrete(int numero, String nome, double saldo) {
        super(numero, nome, saldo);
    }
    


    
    public void depositar(double valorDeposito){
       if (valorDeposito > 0){
           this.setSaldo(this.getSaldo() + valorDeposito);
           System.out.println("Deposito realizado na conta de " + this.getNome());
       }
       else{
           System.out.println("Impossivel depositar!");
       }
    }
   
   public void sacar(double valorSaque){
       if (valorSaque > 0){
           if (this.getSaldo() >= valorSaque){
               this.setSaldo(this.getSaldo() - valorSaque);
               System.out.println("Saque realizado na conta de " + this.getNome());
           }
           else{
               System.out.println("Impossivel SACAR!!!");
           }
       }
       else{
           System.out.println("Impossivel SACAR!!!");
       }
   }
    
}
