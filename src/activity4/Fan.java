package activity4;

/*********************
* Group 2            *
* Tabasco, Jedy Matt *
* Nebran, Bern Homer *
* Blase, Alexis      *
**********************/

public class Fan {

    final int SLOW = 1, MEDIUM = 2, FAST = 3;
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    public Fan() {
        speed = SLOW;
        on = false;
        radius = 5.0;
        color = "BLUE";
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return on ? "speed=" + getSpeed() + ", color=" + getColor() + ", radius=" + getRadius()
                : "fan is off, color=" + getColor() + ", radius=" + getRadius();
    }

}

class TestFan {
    
    // UML Diagram
    /********************************
    *   Fan                         *
    *********************************
    *   SLOW : int final            *
    *   MEDIUM : int final          *
    *   FAST : int final            *
    * - speed : int                 *
    * - on : boolean                *
    * - radius : double             *
    * - color : String              *
    *********************************
    * + getSpeed()                  *
    * + isOn()                      *
    * + getRadius()                 *
    * + getColor()                  *
    * + setSpeed(int speed)         *
    * + setOn(boolean on)           *
    * + setRadius(double radius)    *
    * + setColor(String color)      *
    * + toString()                  *
    *********************************/
    
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setSpeed(fan1.FAST);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn(true);
        System.out.println(fan1.toString());

        Fan fan2 = new Fan();
        fan2.setSpeed(fan2.MEDIUM);
        fan2.setRadius(5);
        fan2.setColor("blue");
        fan2.setOn(false);
        System.out.println(fan2.toString());

    }
}
