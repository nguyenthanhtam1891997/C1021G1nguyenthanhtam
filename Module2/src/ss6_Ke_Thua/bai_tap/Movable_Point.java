package ss6_Ke_Thua.bai_tap;

import java.util.Arrays;

public class Movable_Point extends Point2D{
    private float xSpeed=0.0f;
    private float ySpeed=0.0f;

    public Movable_Point() {
    }
    public Movable_Point(float x,float y,float xSpeed,float ySpeed){
        super(x,y);
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }

    public Movable_Point(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed,float ySpeed){
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    public float[] getSpeed(){
        float[] array={this.xSpeed,this.ySpeed};
        return array;
    }

    @Override
    public String toString() {
        return  "{"+ Arrays.toString(super.getXY())+", "+Arrays.toString(getSpeed())+"}";
    }
    public Movable_Point move(){
       setX(getX()+xSpeed);
       setY(getY()+ySpeed);
        return this;
    }

}
