import java.util.ArrayList;
import java.util.Scanner;

// Реализовать консольное приложение, которое:
// Принимает от пользователя строку вида text~num
// Нужно рассплитить строку по ~, сохранить text в связный список на позицию num.
// Если введено print~num, выводит строку из позиции num в связном списке и удаляет её из списка.

public class hw4_task_1 {
    public static void main (String[] args) {
        ArrayList<String> arrText = new ArrayList<>(30);
        for (int i = 0; i < 30; i++) {
            arrText.add("");
        }
        Scanner inputText = new Scanner(System.in);
        String str = "";
        while (!str.equals("exit")) {
            System.out.println("Ввод данных: ");
            str = inputText.nextLine();            
            String[] modText = str.split("~");
            String word = modText[0];
            String numberString = modText[1];
            int num = Integer.parseInt(numberString);
            if (!str.equals("print~7")) {     
                arrText.set(num, word);
            }
            if (str.equals("print~7")){
                String[] modText2 = str.split("~");
                String numberString2 = modText2[1];
                int num2 = Integer.parseInt(numberString2);
                System.out.println(arrText.get(num2).toString());
            }
            System.out.println(arrText.toString());
        }
        inputText.close();
    }
}
