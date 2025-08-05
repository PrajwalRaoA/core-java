
class PatternThree {
    public static void main(String[] args) {
        int rows = 2;
        int start = 4;
        
        for (int i = 0; i < rows; i++) {
            for (int j = start; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}






//1 2 3 4
//1 2 3 4
//1 2 3 4
//1 2 3 4

//4 3 2 1
//4 3 2 1

//2 4 6 8
//2 4 6 8

//1 3 5 7
//1 3 5 7