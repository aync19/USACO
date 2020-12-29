import java.util.*;
import java.io.*;

public class CTiming {
    public static void main(String[] args){
        File input = new File(args[0]);
        Scanner scanner = null;
        try {
            scanner = new Scanner(input);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return;
        }

        int day = scanner.nextInt();
        int hour = scanner.nextInt();
        int minute = scanner.nextInt();
        int totalTime = day*60*24 + hour*60 + minute;
        int startingDate = 11*60*24 + 11*60 + 11;

        int resultInt = totalTime-startingDate;
        if(resultInt<0)resultInt = -1;
        String fileName = args[0]+".output";
        File output = new File(fileName);
        try {
            PrintWriter printing = new PrintWriter(output);
            printing.print(resultInt);
            printing.flush();
            printing.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return;
        }
    }
}
