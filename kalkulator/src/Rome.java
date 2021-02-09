public class Rome {
    String words[];
    char deystvie;
    int x;
    int y;
    //int f;


    public void romme() {
        String[] fullRome = new String[]{"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV", "XV",
                "XVI", "XVII", "XVIII", "XIX", "XX", "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV",
                "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL", "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L", "LI", "LII", "LIII",
                "LIV", "LV", "lVI", "LVII", "LVIII", "LIX", "LX", "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX", "LXXI", "LXXII",
                "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX", "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII",
                "LXXXVIII", "LXXXIX", "XC", "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"};
       for (String s: words){

               if("1".equals(s) || "2".equals(s) || "3".equals(s) || "4".equals(s) || "5".equals(s) || "6".equals(s) || "7".equals(s) || "8".equals(s) || "9".equals(s) || "10".equals(s)){
                   throw new IllegalStateException("Недопустимые числа!");
               }

       }
        if ("I".equals(words[0])) x = 1;
        if ("II".equals(words[0])) x = 2;
        if ("III".equals(words[0])) x = 3;
        if ("IV".equals(words[0])) x = 4;
        if ("V".equals(words[0])) x = 5;
        if ("VI".equals(words[0])) x = 6;
        if ("VII".equals(words[0])) x = 7;
        if ("VIII".equals(words[0])) x = 8;
        if ("IX".equals(words[0])) x = 9;
        if ("X".equals(words[0])) x = 10;
        if ("I".equals(words[1])) y = 1;
        if ("II".equals(words[1])) y = 2;
        if ("III".equals(words[1])) y = 3;
        if ("IV".equals(words[1])) y = 4;
        if ("V".equals(words[1])) y = 5;
        if ("VI".equals(words[1])) y = 6;
        if ("VII".equals(words[1])) y = 7;
        if ("VIII".equals(words[1])) y = 8;
        if ("IX".equals(words[1])) y = 9;
        if ("X".equals(words[1])) y = 10;


        if (x < 11 && y < 11 && x > 0 && y > 0) {
            int otvet1;
            switch (deystvie) {
                case '+':
                    otvet1 = x + y;
                    break;
                case '-':
                    otvet1 = x - y;
                    break;
                case '*':
                    otvet1 = x * y;
                    break;
                case '/':
                    otvet1 = x / y;
                    break;

                default:
                    throw new IllegalStateException();

            }
            System.out.println("ответ  = " + fullRome[otvet1 - 1]);

        } else {
            throw new IllegalStateException("Недопустимые числа!");

        }
    }
}
