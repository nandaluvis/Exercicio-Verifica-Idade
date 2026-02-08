import java.util.Scanner;

public class VerificaIdade{

public void main (String[] args){

    System.out.println("Bem vindo ao programa que verifica se você é maior ou menor de idade!");

    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite o seu nome:");

    String nome = scanner.nextLine();

    System.out.println("Digite a sua idade:");

    int idade = scanner.nextInt();

    if (idade <= 17){
        System.out.println(nome + " tem " + idade + " anos e é menor de idade");
    }else{
        System.out.println(nome + " tem " + idade + " anos e é maior de idade");
    };

    System.out.println("Fim do programa!");
}
}