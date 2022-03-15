package task_10;

public class R3Vectorr {
    private double x;
    private double y;
    private double z;

    public R3Vectorr(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    void setPosition(double x1, double y1, double z1){
        x = x + x1;
        y = y + y1;
        z = z + z1;
    }
    void multiply(double r){
        x *= r;
        y *= r;
        z *= r;
    }


}
