import java.text.DecimalFormat;
import java.util.Objects;


public class Planet extends CelestialObject  {
    
    private Star centerStar = new Star();

    public Planet() {
        
    } 

    public Planet(String name,double x,double y,double z,Star centerStar){
        super(name,x,y,z);
        this.centerStar = centerStar;
    }

   

    public Star getCenterStar(){
        return centerStar;
    }

    public void setCenterStar(Star centerStar){
        this.centerStar = centerStar;
    }

    public String toString(){
        DecimalFormat df = new DecimalFormat("0.000");

        String fff = this.name + " circles around " + centerStar.name + " at the " 
        +  df.format(distanceBetween(centerStar)) +" AU";
                    
         return fff;
    } 
 
   

    public  double distanceBetween( Star obj2) {
        double d = 
        
        Math.pow((Math.pow(obj2.x - this.x, 2) +
                Math.pow(obj2.getY() - this.y, 2) +
                Math.pow(obj2.getZ() - this.z, 2) *
                        1.0),
                0.5);

        return d;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Planet that = (Planet) o;
        return  Double.compare(that.x, x) == 0 && Double.compare(that.y, y) == 0
                && Double.compare(that.z, z) == 0 && name.equals(that.name) && getClass().equals(o) == true ;
    }

    @Override
    public int hashCode(){

        return Objects.hash(name,x,y,z,centerStar);
    }
}
