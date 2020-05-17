package monster.daministration;
import java.util.Random;
import java.util.Scanner;

public class NumsMenu {
    public static void main(String[] args){
        int numberOfElements;
        int mathMenuOptions;
        Scanner inputScanner = new Scanner(System.in);
        numberOfElements = inputScanner.nextInt();

        System out.ptintln("Vavedete chisla po-golemi ot 0 i po-malki ot 10 000:\n");
        int[] chislovMasiv = new int[numberOfElements];
        for(int i = 0; i < numberOfElements; i++){
            chislovMasiv[i] = allowedValue(inputScanner);
        }
        while(isRunning){
            renderMathMenu();
            System.out.println("Izberete opcia: ");
            mathMenuOptions = inputScanner.nextInt();
            if (mathMenuOptions == 1){
                renderCollection(prostiChisla(int[] collection));
                renderMathMenu();
            }
            if (mathMenuOptions == 2){
                renderCollection(naiChestoSreshtanoChislo(int[] chislovMasiv, int num));
                renderMathMenu();
            }
            if (mathMenuOptions == 3){
                renderCollection(maksimalnaRedicaOtVazhodyashtiChisla(int[] collection));
                renderMathMenu();
            }
            if (mathMenuOptions == 4){
                renderCollection(maksimalnaRedicaOtNizhodyashtiChisla(int[] collection));
                renderMathMenu();
            }
            if (mathMenuOptions == 5){
                renderCollection(maksimalnaRedicaOtEdnakviChisla(int[] collection));
                renderMathMenu();
            }
            if (mathMenuOptions == 6){
                renderMathMenu();
            }
            if (mathMenuOptions == 7){
                render(MonsterAdministration2);
            }
        }
    }

    public static int allowedValue(Scanner scannerReference){
        while (true){
            System.out.println();
            int input = scannerReference.nextInt();
            if(input >= 0 && input <= 10000) {
                return input;
            }
            System.out.println("Greshka! Opitai pak.")
        }
    }

    public static void renderMathMenu(){
        System.out.println("1. Izvejdane na prosti chisla ot masiva.");
        System.out.println("2. Izvejdane na nai-chesto sreshtani elementi ot masiva.");
        System.out.println("3. Izvejdane na maksimalna redica ot narastvashti elementi ot masiva.");
        System.out.println("4. Izvejdane na maksimalna redica ot namalyavashti elementi ot masiva.");
        System.out.println("5. Izvejdane na maksimalna redica ot ednakvi elementi ot masiva.");
        System.out.println("6. Izvajdane na posledovatelnost ot chisla ot masiva, koito imat suma ravna na chislo, generirano na sluchaen princip.");
        System.out.println("7. Vrashtane gam glavno menu.");
    }

    public static int prostiChisla(int[] chislovMasiv){
        for (int i = 0; i<=chislovMasiv.length; i++){
            boolean isPrimeNumber = true;
            for (int j = 2; j<i; j++){
                if (i%j==0){
                    isPrimeNumber = false;
                    break;
                }
                if(isPrime){
                    System.out.println(i + " sa prosti chisla v masiva.\n");
                }
            }
        }
    }
    public static int naiChestoSreshtanoChislo(int[] chislovMasiv, int num){
        int maxCount = 1, res = chislovMasiv[0], currentCount = 1;
        for (int i = 1; i < num; i++) {
            if (chislovMasiv[i] == chislovMasiv[i - 1]) {
                curr_count++;
            }
            if (currentCount > maxCount){
                maxCount = currentCount;
                res = chislovMasiv[i - 1];
                System.out.println("Nai-chesto sreshtanoto chislo e:\n" + res);
            }

            if (currentCount > maxCount){
                maxCount = currentCount;
                res = chislovMasiv[num - 1];
                System.out.println("Nai-chesto sreshtanoto chislo e:\n" + res);
            }
            currentCount = 1;
            System.out.println("Nyama povtaryashti se chisla.");
        }
    }

    public static int maksimalnaRedicaOtVazhodyashtiChisla(int[] chislovMasiv){
        int count = 1, tempCount = 1, number = 0;
        for (int i = 0; i<chislovMasiv.length; i++){
            if (chislovMasiv[i] < chislovMasiv[i + 1]){
                tempCount++;
            }
            else tempCount = 1;
            if (tempCount > count){
                count = tempCount;
                number = chislovMasiv [i];
            }
        }
        System.out.println("Maksimalnata redica ot vazhodyashti chisla e:\n" + number);
    }

    public static int maksimalnaRedicaOtNizhodyashtiChisla(int[] chislovMasiv){
        int count = 1, tempCount = 1, number = 0;
        for (int i = 0; i<chislovMasiv.length; i++){
            if (chislovMasiv[i] > chislovMasiv[i + 1]){
                tempCount++;
            }
            else tempCount = 1;
            if (tempCount > count){
                count = tempCount;
                number = chislovMasiv [i];
            }
        }
        System.out.println("Maksimalnata redica ot nizhodyashti chisla e:\n" + number);
    }

    public static int maksimalnaRedicaOtEdnakviChisla(int[] chislovMasiv){
        int count = 1, tempCount = 1, number = 0;
        for (int i = 0; i<chislovMasiv.length; i++){
            if (chislovMasiv[i] == chislovMasiv[i + 1]){
                tempCount++;
            }
            else tempCount = 1;
            if (tempCount > count){
                count = tempCount;
                number = chislovMasiv [i];
            }
        }
        System.out.println("Maksimalnata redica ot ednakvi chisla e:\n" + number);
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

