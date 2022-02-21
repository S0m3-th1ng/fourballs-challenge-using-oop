import processing.core.PApplet;

class Circle{
    private float valueX,valueY,radius,speed;
    public Circle(float valueX, float valueY, float radius, float speed) {
        this.valueX = valueX;
        this.valueY = valueY;
        this.radius = radius;
        this.speed = speed;
    }

    public float getValueX() {
        return valueX;
    }

    public float getValueY() {
        return valueY;
    }

    public float getRadius() {
        return radius;
    }

    public float getSpeed() {
        return speed;
    }

    public void setValueX(float valueX) {
        this.valueX = valueX;
    }

    public void setValueY(float valueY) {
        this.valueY = valueY;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public void nextPosition(){
        this.valueX+=this.speed;
    }

}

public class FourBallsChallengeUsingOOP extends PApplet {
    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int RADIUS = 10;
    public static final int noOfBalls = 4;
    public static  Circle[] balls = new Circle[noOfBalls];

    public static void main(String[] args) {
        PApplet.main("FourBallsChallengeUsingOOP",args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH,HEIGHT);
    }

    @Override
    public void setup() {
        for (int i = 0; i < noOfBalls; i++) {
            balls[i] = new Circle(0,HEIGHT * (i+1) / 5,RADIUS,i+1);
        }
    }

    @Override
    public void draw() {
        for (int i = 0; i <4 ; i++) {
            drawCircle(balls[i].getValueX(),balls[i].getValueY(),balls[i].getRadius());
            balls[i].nextPosition();
        }
    }

    private void drawCircle(float xValue,float yValue,float RADIUS) {
        ellipse(xValue,yValue,RADIUS,RADIUS);
    }
}
