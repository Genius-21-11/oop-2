public class barrier implements crossable{
    private final int height;

    public barrier(int height) {
        this.height = height;
    }

    @Override
    public void cross(athletics athlete) {
        athlete.jump(height);
    }
}