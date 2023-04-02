import java.util.Scanner;

 class Menusel {
    
    public static void main(String args[]) {
        
        Scanner scan = new Scanner(System.in);
        
        char choice; // Missing data type for variable
        
        do {
            System.out.println("Help on: "); // Missing starting quote
            System.out.println("1. if");
            System.out.println("2. switch");
            System.out.println("3. while");
            System.out.println("4. do-while");
            System.out.println("5. for\n"); // Typo in System.out.println
            
            System.out.println("Choose any one: ");
            choice = scan.next().charAt(0);
        } while(choice < '1' || choice > '5'); // Incorrect condition for do-while loop
        
        System.out.println("\n");
        
        switch(choice) {
            case '1': 
                System.out.println("The if :\n");
                System.out.println("if(condition)\n{\n\tstatement\n}");
                System.out.println("else\n{\n\tstatement\n}");
                break;
            
            case '2': 
                System.out.println("The switch :\n");
                System.out.println("switch(expression)\n{");
                System.out.println("\tcase constant: statement sequence\n\tbreak;");
                System.out.println("\t//...\n}");
                break;
                
            case '3': 
                System.out.println("The while :\n");
                System.out.println("while(condition)\n{");
                System.out.println("\t// body of loop\n}");
                break;
                
            case '4': 
                System.out.println("The do-while :\n");
                System.out.println("do\n{");
                System.out.println("\t// body of loop\n\n}while(condition);");
                break; // Missing break statement for case '4'
                
            case '5': 
                System.out.println("The for :\n");
                System.out.println("for(initialization; condition; iteration)\n{");
                System.out.println("\t// body of loop\n}");
                break;
                
            default: // Missing default case to handle invalid input
                System.out.println("Invalid choice.");
                break;
        }
    }
}