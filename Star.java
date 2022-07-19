import java.text.DecimalFormat;

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
        String fff = this.getName() + " shines at the " + df.format(magnitude) +" mangitude";
                    
         return fff;
    }            

    public double getMagnitude(){
        return magnitude;
    } 

    public void setMagnitude(double magnitude){
        this.magnitude = magnitude;
    }



}