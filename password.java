///Пользователь вводит с клавиатуры строчку, являющуюся паролем.
//Проверить, надежно ли составлен пароль. Пароль считается надежным,
//если он состоит из 8 или более символов. Символом может быть цифра,
//английская буква, знак подчеркивания. Пароль должен содержать хотя бы
//одну заглавную букву, одну маленькую букву и одну цифру.

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class password {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Enter your password for verification: ");
        String userPas = n.nextLine();
        String pattern = "((?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=[_]*)).{8,}";

        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(userPas);
        boolean prover = m.matches();

        if (prover) {
            System.out.println("This password is strong.");
        } else {
            System.out.println("This password isn't strong!");
        }
        n.close();
    }
}
