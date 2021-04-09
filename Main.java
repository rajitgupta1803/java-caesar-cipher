import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        do{
            Scanner action = new Scanner(System.in);
            System.out.print("What Do You Want To Do?(encrypt/decrypt): ");
            String user_action = action.nextLine();

            if (user_action.equalsIgnoreCase("encrypt")){

                HashMap<String, Integer> og_text = return_text_n();
                Algorithm encrypt = new Algorithm((String)og_text.keySet().toArray()[0], (Integer) og_text.values().toArray()[0]);
                encrypt.out();

            }else if (user_action.equalsIgnoreCase("decrypt")){

                HashMap<String, Integer> og_encrypt = return_text_n();
                Algorithm decrypt = new Algorithm((String)og_encrypt.keySet().toArray()[0], 26 - ((Integer) og_encrypt.values().toArray()[0]));
                decrypt.out();
            }
        } while(true);
    }
    public static HashMap<String, Integer> return_text_n(){
        HashMap<String, Integer> out = new HashMap<>();
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the text: ");
        String user_input = inp.nextLine();

        System.out.print("Enter n: ");
        int n = inp.nextInt();
        out.put(user_input, n);
        return out;
    }
}
