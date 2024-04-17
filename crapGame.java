import java.util.Random;

public class crapGame {

    public static void main(String[] args){

        Random rnd = new Random();
        boolean continuar = true;
        int punto = 0;
        
         System.out.println("----Vamos a simular el lanzamiento de unos dados----");

         int puntaje = tirarDados(rnd);
         System.out.println("--- Sacaste "+ puntaje+ " ---");

         if (puntaje == 7 || puntaje == 11) {

             System.out.println("Ganaste en la primera tirada");
             System.out.println("-----------------------------");
             continuar = false;

          }
         else if (puntaje == 2 || puntaje == 3 || puntaje == 12) {

             System.out.println("Perdiste ");
             System.out.println("-----------------------------");
             continuar = false;

         }
         else{
             punto = puntaje;
             System.out.println("Sigues lanzando, tu punto es "+ punto);
             System.out.println("-----------------------------");

         }


         while (continuar) {

             puntaje = tirarDados(rnd);

             if (puntaje == punto) {

                 System.out.println("Sacaste "+ puntaje +" Ganaste!");
                 System.out.println("-----------------------------");
                 continuar = false;

            }
             else if (puntaje == 7) {

                System.out.println("Sacaste "+ puntaje +" Perdiste!");
                System.out.println("-----------------------------");
                continuar = false;

            }
             else {

                System.out.println("Sacaste "+ puntaje +" Sigues lanzando.");
                System.out.println("-----------------------------");

            }
         }
    }


    public static int tirarDados(Random rnd){

        int dado1 = rnd.nextInt(6)+1;
        int dado2 = rnd.nextInt(6)+1;
        return dado1+dado2;
    }
}
