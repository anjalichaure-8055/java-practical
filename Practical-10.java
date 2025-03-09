public class SudokuGame {
    static int[][] grid;  

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        int size = 3;
        
        
        initializePuzzle(size);

        
        display(size, grid);
        
        
        while (true) {
            System.out.println("Enter row (1-" + size + "), column (1-" + size + "), and number (1-" + size + ") to place, or 0 0 0 to quit:");
            int row = scanner.nextInt() - 1;  
            int col = scanner.nextInt() - 1;  
            int num = scanner.nextInt();
            
            if (row == -1 && col == -1 && num == 0) {
                System.out.println("Exiting the game.");
                break;
            }

            if (row >= 0 && row < size && col >= 0 && col < size && num >= 1 && num <= size) {
                if (isValidMove(size, row, col, num)) {
                    grid[row][col] = num;
                    display(size, grid);
                } else {
                    System.out.println("Invalid move! Try again.");
                }
            } else {
                System.out.println("Invalid input. Row and column must be between 1-" + size + " and number between 1-" + size + ".");
            }
        }
        scanner.close();
    }

    
    public static void initializePuzzle(int size) {
        grid = new int[size][size];  

        
        if (size == 3) {
            grid[0][0] = 1;
            grid[0][1] = 0; 
            grid[0][2] = 3;
            grid[1][0] = 0; 
            grid[1][1] = 2;
            grid[1][2] = 0; 
            grid[2][0] = 3;
            grid[2][1] = 0; 
            grid[2][2] = 1;
        }
    }

   
    public static boolean isValidMove(int size, int row, int col, int num) {
        return isValidRow(size, row, num) && isValidCol(size, col, num) && isValidSubGrid(size, row, col, num);
    }

    
    public static boolean isValidRow(int size, int row, int num) {
        for (int i = 0; i < size; i++) {
            if (grid[row][i] == num) {
                return false;
            }
        }
        return true;
    }

    
    public static boolean isValidCol(int size, int col, int num) {
        for (int i = 0; i < size; i++) {
            if (grid[i][col] == num) {
                return false;
            }
        }
        return true;
    }

   
    public static boolean isValidSubGrid(int size, int row, int col, int num) {
        
        return true;
    }

    
    public static void display(int size, int[][] array) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(array[i][j] == 0 ? " " : array[i][j]);
                if (j < size - 1) {
                    System.out.print(" | ");
                }
            }
            System.out.println();
            if (i < size - 1) {
                System.out.println("---------");
            }
        }
    }
