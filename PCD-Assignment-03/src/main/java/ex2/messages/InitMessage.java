package ex2.messages;

public class InitMessage extends Message{

    private int x;
    private int y;
    private int color;

    public InitMessage(){}
    public InitMessage(String id, int x, int y, int color){
        super(id);
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }
}
