package monster.daministration;
import java.util.Scanner;

public class WordsMenu {
    public static void main(String[] args){
        int numberOfElements;
        int wordMenuOptions;
        Scanner inputScanner = new Scanner(System.in);
        numberOfElements = inputScanner.nextInt();
        System.out.println("Vavedete dumi:\n");
        String[] wordsMasiv = new String[numberOfElements];

        while(isRunning){
            renderWordsMenu();
            System.out.println("Izberete opcia: ");
            mathMenuOptions = inputScanner.nextInt();
            if (wordMenuOptions == 1){
                renderCollection(reverseWords(int[] collection));
                renderWordsMenu();
            }
            if (wordMenuOptions == 2){
                renderCollection(povtaryshtiSeSimvoliDumi(String[] wordsMasiv);
                renderWordsMenu();
            }
            if (wordMenuOptions == 3){
                renderWordsMenu();
            }
            if (wordMenuOptions == 4){
                renderCollection(broiPovtaryashtiSeDumi(int[] collection));
                renderWordsMenu();
            }
            if (wordMenuOptions == 5){
                render(MonsterAdministration2);
            }
        }
    }

    public static String reverseWords(String[] wordsMasiv){
        String[] reversed = String[] wordsMasiv;
        int begin = 0;
        int end =reversed.length-1;
        char temp;
        while(end>begin) {
            temp = reversed[begin];
            reversed[begin] = reversed[end];
            reversed[end] = temp;
            end--;
            begin++;
        }
        System.out.println("Obarnati dumi:\n" + reversed);
    }

    public static void povtaryshtiSeSimvoliDumi(String[] wordsMasiv){
        List<String> words = wordsMasiv;
        for (String s : words){
            System.out.println(repeatingLetters(s));
        }
    }
    private static String repeatingLetters(String s){
        String output = s;
        String temp;
        while (true) {
            temp = output.replaceAll("(.+)\\1", "$1");
            if (temp.equals(output)) break;
            output = temp;
        }
        return output;
    }

    public static void simvoliVavString(String[] wordsMasiv){
        for(int i = 0 ; i < wordsMasiv.length; i++){
            char [] eachLetterinArray =  wordsMasiv[i].toCharArray();
            for (int j = 0,count = 0 ; j < eachLetterinArray.length; j++){
                if((eachLetterinArray[j]+'a'-97 >=65 && eachLetterinArray[j]+'a'-97 <=90 )
                    || (eachLetterinArray[j]+'a'-97 >=97 && eachLetterinArray[j]+'a'-97 <=122 )  ){
                    count++;
            }
                System.out.print("Broi na simvoli:\n" + count);
        }
    }

    public static int broiPovtaryashtiSeDumi(String[] wordsMasiv){
        int count = 0, initCount = 0;
        for (int i = 0; i<wordsMasiv.length; i++){
            if (wordsMasiv[i] == wordsMasiv[i-1]){
                count++;
            }
            if (count > initCount){
                System.out.println("Broyat na povtaryashtite se dumi e: \n" + count);
            }
            System.out.println("Nyama pvtaryashti se dumi.")
        }
    }

    public static void renderWordsMenu(){
        System.out.println("1. Obarnete i vizualiziraite bukvite ot masiva.");
        System.out.println("2. Izvejane na povtaryashti se simvoli ot dumi v masiva.");
        System.out.println("3. Izvejdane na broya na simvolite vav vsyaka duma ot masiva.");
        System.out.println("4. Izvedete broya na povtaryashti se dumi v masiva.");
        System.out.println("5. Vrashtane kam osnovno menu.");
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
