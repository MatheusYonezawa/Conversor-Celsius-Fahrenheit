import java.util.Scanner;

public class ConversorC {
    public static void main(String[] args) throws Exception {

        Scanner ler = new Scanner(System.in);
        double Valor_Celsius,Valor_fahr = 0;
        int loop = 0;

        System.out.println("!!!! Seja bem vindo ao conversor de Celsius para Fahrenheit !!!!");
        
        do {

            System.out.println("Digite a operação que deseja \n (1)C-F \n (2)F-C");
            int escolha = ler.nextInt();   

            if (escolha == 1){

                System.out.println("Digite o valor do grau");
                
                    Valor_Celsius = ler.nextDouble();
                
                    Valor_fahr = Valor_Celsius * 1.8 + 32;
                
                System.out.println("O valor da conversão é de: " + Valor_fahr + "ºF");

                System.out.println("Deseja continuar? (1 para sim, qualquer outro número para não)");
                loop = ler.nextInt();
                
            }else if (escolha == 2){

                System.out.println("Digite o valor do fahrenheit: ");
                    Valor_fahr = ler.nextDouble();
                
                Valor_Celsius = (Valor_fahr - 32) / 1.8; 

                System.out.println("O valor da conversão é de: " + Valor_Celsius + "ºC");

                System.out.println("Deseja continuar? (1 para sim, qualquer outro número para não)");
                loop = ler.nextInt();
                

            }else{

            System.out.println("Comando desconhecido tente de novo");  

            }

        } while (loop == 1);


    }
}
