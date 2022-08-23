import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int horaI, horaF;

        System.out.println("Hora inicial do jogo: ");
        horaI = sc.nextInt();
        System.out.println("Hora final do jogo: ");
        horaF = sc.nextInt();

        if (horaI > horaF){
            System.out.println("O JOGO DUROU "+ (24 - (horaI - horaF)) + " HORA(S)");
        }else if(horaF > horaI){
            System.out.println("O JOGO DUROU " + (horaF - horaI) + "HORA(S)");
        }else{
            System.out.println("O JOGO DUROU 24 HORA(S)");
        }
    }
}
