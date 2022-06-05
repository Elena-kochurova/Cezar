import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Caesar1 {
    private  static final String alphabet = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя . , ”” : - ! ?";

    private static char key ( char symbol, int shift){
        if (alphabet.indexOf(symbol) != -1){
            int length = alphabet.length();
            return alphabet.charAt((alphabet.indexOf(symbol)+shift)% length);
        }
        else {
            return symbol;
        }
    }
    public  static void main(String []args)  {
        try (FileReader read = new FileReader("file.txt3")) {
            int  character;
            String text = "";
            while ((character = read.read()) != -1) {
                text += (char) character;
            }
            System.out.println(text);
            int numberOfCiphers = 3;
            text = text.toLowerCase();
            for (int i = 0; i <= numberOfCiphers; i++) {
                for (int j = 0; j < text.length(); j++) {
                    System.out.print(key(text.charAt(j), i));
                }
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }}
