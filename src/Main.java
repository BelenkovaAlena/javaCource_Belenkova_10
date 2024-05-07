import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean flag = true;
        while (flag) {
            try{
                if (getSimbol() == '-'){
                System.out.println("В строке нет цифр или повторяющихся букв");
                flag = false;
                }
            }
            catch (VvodExeption ve){
                System.out.println(ve.getMessage() + ve.getSimbol() + "! Повторите ввод строки!");
            }
        }
}
        public static char getSimbol() throws VvodExeption {
            Scanner scr = new Scanner(System.in);
            String str = scr.nextLine();
            char[] simb  = str.toCharArray();
            char sim = ' ';
            String mess = "";
                for (int i = 0; i < str.length(); i++) {
                    if (Character.isDigit(simb[i])) {
                        sim = simb[i];
                        mess = "В строке цифра ";
                        throw new VvodExeption(mess, sim);
                    }
                     if ((((i > 0)&&(i<=str.length()-2)) && ((simb[i] == simb[i + 1]) && (simb[i] == simb[i + 2])))||
                            (((i>=1) && (i<=str.length()-1)) && ((simb[i] == simb[i - 1]) && (simb[i] == simb[i + 1])))||
                            ((i==str.length()-1) && ((simb[i] == simb[i - 1]) && (simb[i] == simb[i - 2])))){
                        sim = simb[i];
                        mess = "В строке повторяется буква ";
                         throw new VvodExeption(mess, sim);
                     }
                        else sim = '-';
                }
            return sim;
        }
}