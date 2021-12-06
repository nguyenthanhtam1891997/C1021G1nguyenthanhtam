package ss4_Class.bai_tap;

public class Fan {
    private final int SLOW =  1;
    private final int MEDIUM = 2;
    private final int FAST = 3;
    private int speed =SLOW;
    private boolean on=false;
    private double radius=5;
    private String color="blue";
    private Fan(){}
    private Fan(String speed,boolean on,double radius,String color){
        if (speed.equals("SLOW")) {
            this.speed = SLOW;
        }else if (speed.equals("MEDIUM")){
            this.speed = MEDIUM;
        }else if (speed.equals("FAST")){
            this.speed = FAST;
        }
        this.on=on;
        this.radius=radius;
        this.color=color;
    }
    private void setSpeed(int speed){
        this.speed=speed;
    }
    private int getSpeed(){
        return this.speed;
    }
    private void setOn(boolean on){
        this.on=on;
    }
    private boolean getOn(){
        return this.on;
    }
    private void setRadius(double radius){
        this.radius=radius;
    }
    private double getRadius(){
        return this.radius;
    }
    private void setColor(String color){
        this.color=color;
    }
    private String getColor(){
        return this.color;
    }
    private String display(){
        if (on) {
            return "speed= " + speed + " radius= " + radius + " color: " + color+" fan is on";
        }else {
            return "speed= " + speed + " radius= " + radius + " color: " + color+" fan is off";
        }

    }

    public static void main(String[] args) {

        Fan fan1 = new Fan("SLOW", true, 10, "yellow");
        System.out.println("is fan1 "+fan1.display());
        Fan fan2 = new Fan("FAST",false,5,"blue");
        System.out.println("is fan2 "+fan2.display());
        fan2.setOn(true);
        System.out.println("is fan2 "+fan2.display());
    }

}
