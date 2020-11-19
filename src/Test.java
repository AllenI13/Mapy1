import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj kod kraju");
        String input = scanner.nextLine();
        try {
        HashMap<String,Country> hashMap = dataReader("C:\\Users\\Igor\\Desktop\\countries.csv");
            if(hashMap.containsKey(input)){
                System.out.println(hashMap.get(input));
            }
            else
                System.out.println("Nie ma takiego kodu kraju szkoda");
        } catch (FileNotFoundException e) {
            System.err.println("File not found :(");
        }
    }

    static HashMap<String, Country> dataReader(String fileName) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(fileName));
        HashMap<String, Country> hashMap = new HashMap<>();
        String[] strings;
        while (scanner.hasNextLine()) {
            strings = scanner.nextLine().split(";");
            hashMap.put(strings[0], new Country(strings[1], strings[0], Integer.parseInt(strings[2])));
        }
        return hashMap;
    }

}
