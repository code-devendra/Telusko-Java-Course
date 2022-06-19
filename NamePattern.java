package assignment1;

public class NamePattern {
    public static void main(String []args){
        System.out.println("** Telusko **");
        System.out.println();
        System.out.println();

        // Print T
        for(int i = 1; i <= 7; i++){
            for(int j = 1; j <= 7; j++){
                if(i != 1 && j != 4){
                    System.out.print("  ");
                }
                else
                    System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        // Print E
        for(int i = 1; i <= 7; i++){
            for(int j = 1; j <= 7; j++){
                if(i != 1 && i != 4 && i != 7 && j != 1)
                    System.out.print("  ");
                else
                    System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        // Print L
        for(int i = 1; i <= 7; i++){
            for(int j = 1; j <= 7; j++){
                if(i != 7 && j != 1)
                    System.out.print("  ");
                else
                    System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        // Print U
        for(int i = 1; i <= 7; i++){
            for(int j = 1; j <= 7; j++){
                if(i != 7 && j != 7 && j != 1)
                    System.out.print("  ");
                else
                    System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        // Print S
        for(int i = 1; i <= 7; i++){
            for(int j = 1; j <= 7; j++){
                if((i == 2 || i == 3) && j != 1 || (i == 5 || i == 6) && j != 7)
                    System.out.print("  ");
                else
                    System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        // Print K
        for(int i = 1; i <= 7; i++){
            for(int j = 1; j <= 4; j++){
                if( (j != 1) && (i != (5-j)) && (i != (3+j)) )
                    System.out.print("  ");
                else
                    System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        // Print O
        for(int i = 1; i <= 7; i++){
            for(int j = 1; j <= 5; j++){
                if( i != 1 && i != 7 && j != 1 && j != 5 )
                    System.out.print("  ");
                else
                    System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("** INEURON **");
        System.out.println();
        System.out.println();

        // Print I
        for(int i = 1; i <= 7; i++){
            for(int j = 1; j <= 7; j++){
                if(i != 1 && i != 7 && j != 4)
                    System.out.print("  ");
                else
                    System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        // Print N
        for(int i = 1; i <= 7; i++){
            for(int j = 1; j <= 7; j++){
                if(j != 1 && j != 7 && i != j)
                    System.out.print("  ");
                else
                    System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        // Print E
        for(int i = 1; i <= 7; i++){
            for(int j = 1; j <= 7; j++){
                if(i != 1 && i != 4 && i != 7 && j != 1)
                    System.out.print("  ");
                else
                    System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        // Print U
        for(int i = 1; i <= 7; i++){
            for(int j = 1; j <= 7; j++){
                if(i != 7 && j != 7 && j != 1)
                    System.out.print("  ");
                else
                    System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        // Print R
        for(int i = 1; i <= 9; i++){
            for(int j = 1; j <= 5; j++){
                if((i == 1 || i ==5 || j == 1) || (i == 4+j) || (j==5 && i <= 5 ))
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
        System.out.println();

        // Print O
        for(int i = 1; i <= 7; i++){
            for(int j = 1; j <= 5; j++){
                if( i != 1 && i != 7 && j != 1 && j != 5 )
                    System.out.print("  ");
                else
                    System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        // Print N
        for(int i = 1; i <= 7; i++){
            for(int j = 1; j <= 7; j++){
                if(j != 1 && j != 7 && i != j)
                    System.out.print("  ");
                else
                    System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
