class PatternFive {
    public static void main(String[] args) {
        int rows = 2;
        int start = 1;
        int end = 7;

        for (int i = 0; i < rows; i++) {
            for (int j = start; j <= end; j += 2) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
