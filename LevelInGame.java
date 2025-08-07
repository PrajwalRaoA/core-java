class LevelInGame {
    public static void main(String[] args) {
        int level = 4;
        switch (level) {
            case 1:
                System.out.println("Beginner");
                break;
            case 2:
                System.out.println("Intermediate");
                break;
            case 3:
                System.out.println("Advanced");
                break;
            case 4:
                System.out.println("Expert");
                break;
            case 5:
                System.out.println("Master");
                break;
            default:
                System.out.println("Invalid Level");
        }
    }
}
