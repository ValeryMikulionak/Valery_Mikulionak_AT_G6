package classwork.day7;

import java.util.Scanner;

public class ScannerText {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            String incoming = scanner.nextLine();
            System.out.printf("Just got '%s' text!", incoming);
            if (incoming.equals("camon")) {
                break;
            }
        }
    }
}