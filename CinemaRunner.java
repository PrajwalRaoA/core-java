class CinemaRunner {
    public static void main(String[] args) {
        Cinema[] movies = new Cinema[5];

        movies[0] = new Cinema();
        movies[0].setTitle("RRR");
        movies[0].setLanguage("Telugu");

        movies[1] = new Cinema();
        movies[1].setTitle("Jawan");
        movies[1].setLanguage("Hindi");

        movies[2] = new Cinema();
        movies[2].setTitle("Leo");
        movies[2].setLanguage("Tamil");

        movies[3] = new Cinema();
        movies[3].setTitle("KGF");
        movies[3].setLanguage("Kannada");

        movies[4] = new Cinema();
        movies[4].setTitle("Drishyam");
        movies[4].setLanguage("Malayalam");

        for (Cinema c : movies) {
            System.out.println(c.getTitle());
            System.out.println(c.getLanguage());
        }
    }
}
