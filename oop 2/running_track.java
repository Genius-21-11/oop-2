public class running_track implements crossable{

    private final int length;

    public running_track(int length) {
        this.length = length;
    }

    @Override
    public void cross(athletics athlete) {
        athlete.run(length);
    }
}