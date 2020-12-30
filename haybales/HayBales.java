import java.util.*;
import java.io.*;

public class Haybales {
    public static void main(String[] args){
        File input = new File(args[0]);
        Scanner scanner = null;
        try {
            scanner = new Scanner(input);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return;
        }

        int amount = scanner.nextInt();
        int sum = 0;
        while(scanner.hasNext()) {
            int num = scanner.nextInt();
            sum += num;
        }
        int average = sum/amount;
        int result = 0;
        scanner.close();
        Scanner scanner2 = null;
        try {
            scanner2 = new Scanner(input);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return;
        }
        scanner2.nextInt();
        while(scanner2.hasNext()) {
            int num = scanner2.nextInt();
            int dif = Math.abs(average-num);
            result+=dif;
        }
        result/=2;
        String fileName = args[0]+".output";
        File output = new File(fileName);
        try {
            PrintWriter printing = new PrintWriter(output);
            printing.print(result);
            printing.flush();
            printing.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return;
        }
    }
}
