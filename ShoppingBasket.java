import java.util.Scanner;

public class ShoppingBasket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int a = 0;
        Queue products = new Queue();
        String delimetr = ": ";
        String SubStr[];
        while (true) {
            String str = scanner.nextLine();
            if (str.equals("EXIT")) {
                break;
            }
            if (str.equals("CANCEL")) {
                products.remove();
                if (sum > 0) {
                    sum = sum - a;
                }
                continue;
            }
            if (str.equals("PRINT")) {
                products.printList();
                System.out.println("TOTAL: " + sum);
                continue;
            }

            try{
                try {
                    a = parse(delimetr, str);
                }catch (NumberFormatException e){
                    String[] substr;
                    substr = str.split(delimetr);
                    str = substr[0] + ": " + 0;
                    System.out.println("catch2");
                }
                products.add(str);
            }catch (MyException first){
                System.out.println("incorrect");
            }
            sum = sum + a;
        }
    }
    private static int parse (String delimetr, String str) throws MyException, NumberFormatException {
        String[] substr;
        int price = 0;
        substr = str.split(delimetr);
        if (substr.length != 2) {
            throw new MyException("incorrect");
        }
        try {
            price = Integer.parseInt(substr[1]);
        } catch (NumberFormatException e) {
            System.out.println("catch");
            throw new NumberFormatException();
        }
        return price;
    }

}


