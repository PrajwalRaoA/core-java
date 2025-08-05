class PatternFour {
    public static void main(String[] args) {
        int rows = 2;
        int start = 2;
        int end = 8;

        for (int i = 0; i < rows; i++) {
            for (int j = start; j <= end; j += 2) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
