import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello to this sophisticated application!");

        System.out.println("Enter a car to be drawn:");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        String keyword = userInput.replaceAll("\\s+","");

        System.out.println(keyword);
        //process(keyword);
        //array bauen mit instanzen aus imterface implementierungen
        //loopen, bis die annotation value mit dem input übereinstimmt
        //malen in den funktionen

        System.out.println("    ___  ");
        System.out.println("___/   \\___");
        System.out.println("---O----O---");

        System.out.println("_____");
        System.out.println("|   |____________  ____________");
        System.out.println("|   |           |  |          |");
        System.out.println("|   |           |--|          |");
        System.out.println("--0--------00O---  --O-----OO--");

    }


}