package task_10;

public class R3Vector {
    double x;
    double y;
    double z;
    double r;

    void sum( double x1 , double x2, double y1, double y2, double z1, double z2 ){
        x = x2 + x1;
        y = y1 + y2;
        z = z1+z2;
        System.out.println("x - "+ x +" y - "+ y + " z - "+ z);
    }

    void multiply(double x1, double y1, double z1, double multiplier){
        x = x1 * multiplier;
        y = y1 * multiplier;
        z = z1 * multiplier;
        System.out.println("x - "+ x +" y - "+ y + " z - "+ z);
    }

    void scalarMultiply(double x1 , double x2, double y1, double y2, double z1, double z2){
        r = x1*x2 + y1*y2 + z1*z2;
        System.out.println("scalarMultiply - " + r);
    }

    void vectorsMultiply(double x1 , double x2, double y1, double y2, double z1, double z2){
        x = y1 * z2 - z1 * y2;
        y = z1 * x2 - x1 * z2;
        z = x1 * y2 - y1 * x2;
        System.out.println("x - "+ x +" y - "+ y + " z - "+ z);
    }

    void comparison(double x1 , double x2, double y1, double y2, double z1, double z2){
        x = x1*x1 + y1*y1 + z1*z1;
        y = x2*x2 + y2*y2 + z2*z2;
        if (Math.sqrt(x) > Math.sqrt(y)){
            System.out.println("xyz1 > xyz2");
        }
        if(Math.sqrt(x) < Math.sqrt(y)){
            System.out.println("xyz2 > xyz1");
        }
        else { System.out.println("xyz1 == xyz2"); }
    }


}
