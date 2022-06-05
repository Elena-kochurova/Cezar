public class Decoding {

    private  static final String alphabet = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя . , ”” : - ! ?";
    private  static final String slovo = "“Рыбный скелет,\n" +
            "Бежевая пепельница.\n" +
            "В восемнадцать лет\n" +
            "Как не злиться?”\n";
    private static char key ( char symbol, int shift){
        if (alphabet.indexOf(symbol) != -1){
            int length = alphabet.length();
            return alphabet.charAt((alphabet.indexOf(symbol)+shift)% length);
        }
        else {
            return symbol;
        }
    }
    public  static void main(String []args){
        String text = "“сьвоьк.тлёмёу \n" +
                "вёзёгб .рёрёмэойчб \n" +
                "г.гптёнобечбуэ.мёу\n" +
                "лбл.оё.имйуэт а”\n";
        int decoding = 0;
       // text = text.toLowerCase();
        for (int i= 0; i <= decoding; i++){
            for (int j =0; j < text.length(); j++){
                text=slovo;
                System.out.print( key(text.charAt(j),i));
            }
            System.out.println();
        }

    }
}