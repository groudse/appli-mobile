import java.text.DecimalFormat;
import java.time.chrono.ThaiBuddhistChronology;
import java.util.Objects;

public class Star extends CelestialObject{

    private double magnitude;


    public Star(){
        
    }

    public Star(String name,double x,double y,double z,double magnitude){
        this.name = name;
        this.x = x;
        this.y = y;
        this.z = z;
        this.magnitude = magnitude;
    }


    public String toString(){
        DecimalFormat df = new DecimalFormat("0.000");
        String fff = this.getName() + " shines at the " + df.format(magnitude) +" magnitude";
                    
         return fff;
    }            

    public double getMagnitude(){
        return magnitude;
    } 

    public void setMagnitude(double magnitude){
        this.magnitude = magnitude;
    }

    public boolean equals(Star obj1) {
        if (obj1 != null) {
            boolean test1 = this.getName().equals(obj1.getName());
            boolean test2 = this.getX() == obj1.getX();
            boolean test3 = this.getY() == obj1.getY();
            boolean test4 = this.getZ() == obj1.getZ();
            boolean test5 = this.getMagnitude() == obj1.getMagnitude();
            
            System.out.println(this== obj1);
            
            
            

            if (test1 && test2 && test5 &&  test3 && test4 == true) {

                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public int hashCode() {

        return Objects.hash(name, x, y, z, magnitude);

    }


}