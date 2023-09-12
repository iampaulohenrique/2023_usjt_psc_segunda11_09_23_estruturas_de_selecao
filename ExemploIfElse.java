//import java.util.Scanner;
public class ExemploIfElse {
 public static void main (String... args) {
    //nome completamente qualificado
    //full qualified name
    java.util.Scanner leitor = 
        new java.util.Scanner(System.in);
    double nota;
    System.out.println("digite a nota");
    nota = leitor.nextDouble();
    if(nota >= 70)
        System.out.println("aprovado");
    else
        System.out.println("reprovado");
    
 }   
}