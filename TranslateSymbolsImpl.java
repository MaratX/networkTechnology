public final class TranslateSymbolsImpl {



    public static String binary(String s) {
        String result = "";
        for(int i = 0; i < s.length(); i++){
            result += Integer.toBinaryString(s.charAt(i)) + " ";
        }

        return result;
    }


    public static String StringFromBinary(String stroka) {
        String [] list = stroka.split(" ");
        String result = "";
        for(int i = 0; i < list.length; i++){
            result += (char) Integer.parseInt(list[i], 2);
        }
        return result;
    }


    public static String IntegerFromString(String s){
        String ss = "";
        char [] c = s.toCharArray();
        for(int i = 0; i < c.length; i++){
            ss += ((int) (c[i])) + " ";
        }
        return ss;
    }
}
