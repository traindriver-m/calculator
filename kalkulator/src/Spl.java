import java.util.Scanner;

public class Spl {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите пример из двух чисел от 1 до 10 включительно арабскими или римскими цифрами:");
        Rome d = new Rome();
        while (true) {
            String str = sc.nextLine();
            boolean f = false;
            String[] words = str.split("\\*|\\+|-|/");
            String[] rimskie = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
            d.words = words;
            char deystvie = str.charAt(d.words[0].length());
            d.deystvie = deystvie;

            if (d.words.length > 2) {
                throw new IllegalStateException("Превышено количество вводимых чисел!");
            }

            for(String text : rimskie)if(d.words[0].equals(text)){
                f = true;
                break;
            }

            if (f) {
                d.romme();
            } else if (f == false) {
                try {
                    int a = Integer.parseInt(d.words[0]);
                    int b = Integer.parseInt(d.words[1]);


                    if (a < 11 && b < 11 && a > 0 && b > 0) {

                        int otvet;
                        switch (deystvie) {
                            case '+':
                                otvet = a + b;
                                System.out.println("ответ = " + otvet);
                                break;
                            case '-':
                                otvet = a - b;
                                System.out.println("ответ = " + otvet);
                                break;
                            case '*':
                                otvet = a * b;
                                System.out.println("ответ = " + otvet);
                                break;
                            case '/':
                                otvet = a / b;
                                System.out.println("ответ = " + otvet);
                                break;
                        }
                    }
                    else {
                        throw new IllegalStateException();
                    }
                } catch (Exception e) {
                    throw new IllegalStateException("Недопустимые числа!");
                }

            }

        }
    }


}
