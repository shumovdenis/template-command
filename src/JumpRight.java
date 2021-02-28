public class JumpRight implements FrogCommand{
    private final int step;
    Frog frog;

    public JumpRight(Frog frog, int step) {
        this.frog = frog;
        this.step = step;
    }

    @Override
    public boolean move(int step) {
        if (frog.jump(step)) {
            int pos = frog.getPosition();
            frog.setPosition(pos + step);
            return true;
        }
        return false;
    }

    @Override
    public boolean unMove(int step) {
        int pos = frog.getPosition();
        frog.setPosition(pos - step);
        return true;
    }
}
