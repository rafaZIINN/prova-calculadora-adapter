
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rafael
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);

        String operacao;
        int  operacao1;
        int control = 0;
        int control5 = 0;
        Double valorTotal = 0.0;
        

        System.out.println("Digite a operação que deseja efetuar: \n + \n - \n * \n /");
        operacao = teclado.nextLine();
        
       
        if (operacao.equals("+")) {
           Calculadora soma = new Calculadora();
           valorTotal = soma.adicao();
           control++;

        }
        
        if (operacao.equals("-")) {
            Calculadora subtracao1 = new Calculadora();
            valorTotal = subtracao1.subtracao();
            control++;

        }
        
        if (operacao.equals("*")) {
            Calculadora multipli = new Calculadora();
            valorTotal = multipli.multiplicacao();
            control++;

       }
         
          if (operacao.equals("/")) {
            Calculadora div = new Calculadora();
            valorTotal = div.divisao();
            control++;

        }
        if (control == 0) {
            System.out.println("Operação inválida, tente Novamente com seguites operadores: + , - , * , / !");
        }
        
        System.out.println("Digite:\n 1 para Binario \n 2 para Hexadecimal \n 3 para Octal");
        operacao = teclado.nextLine();
        
        if(operacao.equals("1")){
            CalculaBinario valorTotal1 = new CalculaBinario();
            valorTotal1.binario(valorTotal);
            control5++;
        }
        
        if(operacao.equals("2")){
            hexaDecimal valorTotal2 = new hexaDecimal();
            valorTotal2.hexadecimal(valorTotal);
            control5++;
        }
        
        if(operacao.equals("3")){
            octal valorTotal3 = new octal();
            valorTotal3.octal(valorTotal);
            control5++;
        }
        
        if (control5 == 0) {
            System.out.println("Operação inválida, tente Novamente com seguites operadores: 1,2 ou 3!");
        }

        System.out.println("Continuar \n 1- SIM  \n 2- NÃO");
        operacao1 = teclado.nextInt();
        
        if(operacao1 == 1){
            main(args);
        }
        
       
        
           
       }
    }
    
    

