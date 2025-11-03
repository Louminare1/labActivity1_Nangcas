import java.util.Scanner;

public class labActivity1_Nangcas {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== DFA String Acceptance Checker ===");
        System.out.print("Enter a binary string: ");
        String input = scanner.nextLine();
        
        if (!isValidBinaryString(input)) {
            System.out.println("Invalid input! Please enter only 0s and 1s.");
            scanner.close();
            return;
        }
        
        boolean result = processDFA(input);
        System.out.println("Output: " + (result ? "Accepted" : "Rejected"));
        
        scanner.close();
    }
    
    public static boolean isValidBinaryString(String input) {
        if (input.length() == 0) return false;
        
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != '0' && input.charAt(i) != '1') {
                return false;
            }
        }
        return true;
    }
    
    public static boolean processDFA(String input) {
        String state = "q0";
        
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            
            if (state.equals("q0")) {
                state = (c == '0') ? "q1" : "q0";
            } else if (state.equals("q1")) {
                state = (c == '0') ? "q1" : "q2";
            } else if (state.equals("q2")) {
                state = (c == '0') ? "q1" : "q0";
            }
        }
        
        return state.equals("q2");
    }
}
