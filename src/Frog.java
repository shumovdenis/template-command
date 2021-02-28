public class Frog {
    public static final int MIN_POSITION = 0;
    public static final int MAX_POSITION = 10;

    protected int position;

    public Frog() { position = 5; }

    public boolean jump(int steps) {
        if ((steps + position) > MAX_POSITION || (steps + position) < MIN_POSITION ) {
            return false;
        } else {
            int currentPosition = position + steps;
            return true;
        }
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }
}
