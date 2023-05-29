public class Song {
    private String name;
    private int length;

    public Song(String name, int length) {
        this.length = length;
        this.name = name;
    }

    public String name() {
        return this.name;
    }

    public int length() {
        return this.length;
    }
}