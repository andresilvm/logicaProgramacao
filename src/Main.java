import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        pessoa p = new pessoa();
        aluno aluno = new aluno();
        professor professor = new professor();

        System.out.print("Digite opcao 1 para Aluno e opcao 2 para Professor: ");
        int x= sc2.nextInt();
        switch (x){
            case 1:
                System.out.println("Voce escolheu a opcao Aluno!");
                System.out.print("Digite seu nome: ");
                aluno.setNome(sc.nextLine());

                System.out.print("Digite sua idade: ");
                aluno.setIdade(sc2.nextInt());

                System.out.print("Digite o CEP: ");
                aluno.setCep(sc.nextLine());

                System.out.print("Digite sua Rua: ");
                aluno.setRua(sc.nextLine());

                System.out.print("Digite seu bairro: ");
                aluno.setBairro(sc.nextLine());

                System.out.print("Digite sua primeira nota: ");
                aluno.setN1(sc2.nextDouble());

                System.out.print("Digite sua segunda nota: ");
                aluno.setN2(sc2.nextDouble());

                aluno.calculoMedia();

                System.out.println("A media do aluno foi: " + aluno.getMedia());
                System.out.println("Muito obrigado!");
                break;
            case 2:
                System.out.println("Voce escolheu a opcao Professor!");
                System.out.print("Digite seu nome: ");
                professor.setNome(sc.nextLine());

                System.out.print("Digite sua idade: ");
                professor.setIdade(sc2.nextInt());

                System.out.print("Digite o CEP: ");
                professor.setCep(sc.nextLine());

                System.out.print("Digite sua Rua: ");
                professor.setRua(sc.nextLine());

                System.out.print("Digite seu bairro: ");
                professor.setBairro(sc.nextLine());

                System.out.print("Digite a quantidade de horas trabalhas: ");
                professor.setQntHoras(sc2.nextDouble());

                System.out.print("Digite o valor da Hora aula: ");
                professor.setValorHora(sc2.nextDouble());

                professor.calcSalario();

                System.out.println("O salario do professor foi: " + professor.getSalario());
                System.out.println("Muito obrigado!");
                break;
            default:
                System.out.println("Opcao Invalida!");
        }
    }
}