public class day_06_pattern {
    public static void main(String[] args) {
        // for pyramid nnumbers 
       for (int line = 1;line<=4;line++) {
            for(int num =1;num<=line;num++) {
                System.out.print(num);
            }
            System.out.println( );
        }  
        // for character numbers
        char ch = 'A';
        for( int line = 1;line<=4;line++){
            for(int j =1;j<=line;j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println( );
        }
        // for star pyramid pattterns
        for (int line =1;line<=4;line++){
            for(int star =1;star<=line;star++){
                System.out.print("*");
            }
            System.out.println();
        }
        // for star pattern
        for (int line =1;line<=4;line++){
            System.out.println("****");
        }
        
        // for inverse pyramid pattern
        for (int line =1;line<=4;line++){
            for (int star=1;star<=4-line+1;star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
