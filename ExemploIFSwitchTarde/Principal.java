import java.util.Scanner;
public class Principal {

    public static void main(String args[]) {
    
        System.out.println("\f");
       
        Scanner scanner = new Scanner(System.in);
        
        Pessoa pessoa = new Pessoa();
       
        System.out.println("digite o nome: ");
        pessoa.setNome(scanner.nextLine());
        
        System.out.println("digite o sobrenome: ");
        pessoa.setSobrenome(scanner.nextLine());
        
        System.out.println("digite a idade: ");
        pessoa.setIdade(scanner.nextInt());        
        
        if(pessoa.verificarIdadeEntrada()) {
        
            /*if(pessoa.getIdade() >= 18) {
                System.out.println("\nMaior de idade");
            } else {
                System.out.println("\nMenor de idade");
            }*/
            
            System.out.println(pessoa);
            System.out.println(pessoa.verificarJovemAdultoIdoso());
    //      System.out.println(pessoa.verificarIdade());
        } else {
            System.out.println("erro dado(s) inválido(s)");
        }

    }
    
}

/*
   EXPLICAÇÃO: IF e SWITCH
   
   ESTRUTURAS CONDICIONAIS.....
   
   o que é uma condição?!?!! 
   
   teste -> duas respostas.... verdadeiro ou falso.
   
   2 argumentos... 2 premissas... ?
   
   
   operadores relacionais
   
   >
   <
   >=
   <=
   == -> só para números... numero == 100
   equals ou equalsIgnoreCase
   
   nome.equals("Thiago")
   nome.equalsIgnoreCase("tHiAgO")
   
   != não igual.... numero != 8
   
   ! -> não negação....
   
   
   (media >= 6)
   (idade >=18)
   
   COMO ESTRUTURAR UM IF
   
   if() {

   }
   
   ou
   
   if() {

   } else {

   }
   
   ou
   
   if() {
       
   } else if() {
       
   } else if() {
       
   } else if() {
       
   } else if() {
       
   } else if() {
       
   } else if() {
       
   } else if() {       
       
   } else {
       
   }
   
   
   opcao = 1; //1, 2 ou 3
   switch(opcao) {
       case 1: faz algo...
       break;
       
       case 2: faz outra coisa aqui.....
       break;
       
       case 3: faz outro negocio....
       break;
       
       default: valor padrao.... erro...
       break;
    }
   
   */

  
  
  
  
  
  