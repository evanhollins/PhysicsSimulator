import processing.core.PApplet;

public class PhysicsSimulator extends PApplet {

    public static void main(String[] args) {
        PApplet.main("PhysicsSimulator");
    }

    public void settings() {
        size(300, 300);
    }

    public void setup() {

    }

    public void draw() {
        background(255);
        fill(0);
        ellipse(width/2, height/2, 10, 10);
    }

}
