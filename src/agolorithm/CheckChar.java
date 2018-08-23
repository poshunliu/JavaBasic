package agolorithm;


public class CheckChar {

    private char output;

    public char checkCharN(String s) {
        char[] num = s.toCharArray();
        for (int i = 0; i < num.length; i++) {
            if (i == 0) {
                if (num[i] != num[i + 1]) {
                    output = num[i];
                }
            }
            if (i == num.length - 1) {
                if (num[i] != num[i - 1]) {
                    output = num[i];
                }
            }
            if (i != 0 && i != num.length - 1) {
                if ((num[i] != num[i + 1]) && (num[i] != num[i - 1])) {
                    output = num[i];
                    return  output;
                }
            }
        }
        return output;
    }

    public static void main(String args[]) {

        CheckChar checkChar = new CheckChar();
        char result = checkChar.checkCharN("BBAACEEA");
        System.out.println(result);
        char result2 = checkChar.checkCharN("ABBCCDD");
        System.out.println(result2);
    }


}