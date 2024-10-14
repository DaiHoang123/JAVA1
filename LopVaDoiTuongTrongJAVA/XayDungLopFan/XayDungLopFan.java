public class XayDungLopFan{
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    String speed = "SLOW";
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public String getSpeed(){
        return this.speed;
    }

    public boolean getOn(){
        return this.on;
    }

    public double getRadius(){
        return this.radius;
    }

    public String getColor(){
        return this.color;
    }

    public void setSpeed(String s){
        this.speed = s;
    }

    public void setOn(boolean value){
        this.on = value;
    }

    public void setRadius(int r){
        this.radius = r;
    }

    public void setColor(String color){
        this.color = color;
    }

    public XayDungLopFan(){};

    public XayDungLopFan(String speed, int radius, String color, boolean on){
        this.speed = speed;
        this.radius = radius;
        this.color = color;
        this.on = on;
    };

    @Override
    public String toString() {
        if (this.on) {
            return "Speed: " + this.speed + ", Radius: " + this.radius + ", Color: " + this.color + ", On: " + this.on;
        } else {
            return "Speed: " + this.speed + ", Radius: " + this.radius + ", Color: " + this.color + ", On: Fan is off";
        }
    }

    public static void main(String[] args){
        XayDungLopFan fan1 = new XayDungLopFan("FAST", 10, "yellow", true);
        XayDungLopFan fan2 = new XayDungLopFan("MEDIUM", 10, "blue", false);

        System.out.println("Fan 1: ");
        System.out.println(fan1.toString());
        System.out.println("Fan 2: ");
        System.out.println(fan2.toString());
    }
}