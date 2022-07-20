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
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Star that = (Star) o;
        return Double.compare(that.x, x) == 0 && Double.compare(that.y, y) == 0
                && Double.compare(that.z, z) == 0 && name.equals(that.name)&& Double.compare(that.magnitude, magnitude) == 0;
    }

    public int hashCode() {

        return Objects.hash(name,x,y,z,magnitude);

    }


}