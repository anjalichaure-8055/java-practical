class Practical7 {
    public static void main(String args[]) {
        
        if (args.length == 0) {
            System.out.println("Please provide a size as a command-line argument.");
            return; 
        }

        
        int size = Integer.parseInt(args[0]);

        
        Practical7 obj = new Practical7();

        
        for (int line = 1; line <= size; line++) {
            
            System.out.print(obj.displayPatternA(line, size) + " ");
            System.out.print(obj.displayPatternN(line, size) + " ");
            System.out.print(obj.displayPatternJ(line, size) + " ");
            System.out.print(obj.displayPatternA(line, size) + " ");
            System.out.print(obj.displayPatternL(line, size) + " ");
            System.out.print(obj.displayPatternI(line, size));
            System.out.println(); // New line after each row
        }
    }

    
    String displayPatternA(int line, int size) {
        String pattern = "";
        for(int star=1;star<=size;star++)
        {
        if(star==1||star==size||line==1||line==size/2+1){
        pattern+="*";
        }
        else{
        pattern+=" ";
        }
        }
        return pattern;
    }

    
    String displayPatternN(int line, int size) {
        String pattern = "";
        for (int star = 1; star <= size; star++) {
            if (star == 1 || star == size || line == star) {
                pattern += "*";
            } else {
                pattern += " ";
            }
        }
        return pattern;
    }

    
    String displayPatternJ(int line, int size) {
        String pattern = "";
        for (int star = 1; star <= size; star++) {
            if (line == 1 || (line == size && star <= size / 2 + 1) || (star==size/2+1)) {
                pattern += "*";
            } else {
                pattern += " ";
            }
        }
        return pattern;
    }

    
    String displayPatternL(int line, int size) {
        String pattern = "";
        for (int star = 1; star <= size; star++) {
            if (star == 1 || line == size) {
                pattern += "*";
            } else {
                pattern += " ";
            }
        }
        return pattern;
    }

    
    String displayPatternI(int line, int size) {
        String pattern = "";
        for (int star = 1; star <= size; star++) {
            if (line == 1 || line == size || star == size / 2 + 1) {
                pattern += "*";
            } else {
                pattern += " ";
            }
        }
        return pattern;
    }
}

