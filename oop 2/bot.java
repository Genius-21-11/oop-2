 public class bot implements athletics{

    private final int maxLength;
    private final int maxHeight;
    boolean isActive;

    public bot(int maxLength, int maxHeight) {
        this.maxLength = maxLength;
        this.maxHeight = maxHeight;
        this.isActive = true;
    }

    @Override
    public void run(int length) {
        if (isActive) {
            System.out.printf("bot %s run %d\n", maxLength < length ? "not" : "", length);
        }
        if (maxLength < length)isActive = false;
    }

    @Override
    public void jump(int height) {
        if (isActive) {
            System.out.printf("bot %s jump %d\n", maxHeight < height ? "not" : "", height);
        }
        if (maxHeight < height)isActive = false;
    }
}