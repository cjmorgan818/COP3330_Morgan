import java.util.Scanner;

public class Encryptor {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your four digit number:");
        String number = scan.nextLine();

        String encryptNum = encrypt(number);
        String decryptNum = decrypt(encryptNum);

        System.out.println("The encrypted number is:" + " " + encryptNum);
        System.out.println("The original number is:" + " " + decryptNum);
    }

    public static String encrypt(String number) {

        int[] arr = new int[4];
        int newNum = 0;

        for (int i = 0; i < 4; i++) {
            char ch = number.charAt(i);

            arr[i] = Character.getNumericValue(ch);
        }

        for (int i = 0; i < 4; i++) {
            int temp = arr[i];
            temp = temp + 7;
            temp = temp % 10;
            arr[i] = temp;
        }

        int temp = arr[0];
        int temp1 = arr[1];

        arr[0] = arr[2];
        arr[1] = arr[3];

        arr[2] = temp;
        arr[3] = temp1;

        for (int i = 0; i < 4; i++)
            newNum = newNum * 10 + arr[i];
        String output = Integer.toString(newNum);
        if (arr[0] == 0)
            output = "0" + output;

        return output;
    }

    public static String decrypt(String number) {
        int[] arr = new int[4];
        int newNum = 0;

        for (int i = 0; i < 4; i++) {
            char ch = number.charAt(i);

            arr[i] = Character.getNumericValue(ch);
        }

        int temp = arr[0];
        int temp1 = arr[1];

        arr[0] = arr[2];
        arr[1] = arr[3];

        arr[2] = temp;
        arr[3] = temp1;

        for (int i = 0; i < 4; i++) {
            int digit = arr[i];

            switch (digit) {
                case 0:
                    arr[i] = 3;
                    break;
                case 1:
                    arr[i] = 4;
                    break;
                case 2:
                    arr[i] = 5;
                    break;
                case 3:
                    arr[i] = 6;
                    break;
                case 4:
                    arr[i] = 7;
                    break;
                case 5:
                    arr[i] = 8;
                    break;
                case 6:
                    arr[i] = 9;
                    break;
                case 7:
                    arr[i] = 1;
                    break;
                case 8:
                    arr[i] = 2;
                    break;
            }
        }

        for (int i = 0; i < 4; i++)
            newNum = newNum * 10 + arr[i];
        String output = Integer.toString(newNum);
        if (arr[0] == 0)
            output = "0" + output;


        return output;
    }
}
