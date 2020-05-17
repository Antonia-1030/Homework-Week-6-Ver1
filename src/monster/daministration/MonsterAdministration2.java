package monster.daministration;
import java.util.Random;
import java.util.Scanner;

public class MonsterAdministration2 {
    boolean isProgramRunning = true;
    int numberOfElements;

    public static void main(String[] args){

        Scanner inputScanner = new Scanner(System.in);
        int menuOptions;
        System.out.println("Vavedete broya na elementite, koito ste zapisvate v masiva: \n" + numberOfElements);
        numberOfElements = inputScanner.nextInt();

        while(isProgramRunningRunning) {
            renderMenu();
            menuOptions = inputScanner.nextInt();
            if (menuOptions == 1){
                renderCollection(NumbersMenu);
            }
            if (menuOptions == 2){
                renderCollection(WordsMenu);
            }
            if (menuOptions == 3){
                isProgramRunning = false;
            }
        }
    }

    public static void renderMenu(){
        System.out.println("1. Rabota s chisla.");
        System.out.println("2. Rabota s dumi.");
        System.out.println("3. Izhod.");
    }

    public static void renderCollection(int[] collection) {
        System.out.print("[");
        for (int i = 0; i < collection.length; i++) {
            System.out.print(collection[i]);
            if (i != (collection.length - 1)) {
                System.out.print(",");
            }
        }
        System.out.println("];");
    }
}
