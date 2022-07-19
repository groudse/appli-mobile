import java.text.DecimalFormat;

public class CelestialObject {
   
    public double x;
    public double y;
    public double z;
    public String name;
    public final static double KM_IN_ONE_AU = 150000000;



    public CelestialObject(){
        x = 0.0;
        y = 0.0;
        z = 0.0;
        name = "Soleil";
    }

    public CelestialObject(String f,double v1,double v2,double v3){
        x = v1;
        y = v2;
        z = v3;
        name = f;
    }

    public void setX(double newX){
        x = newX;
    }  

    public double getX(){
        return x;
    } 

    public void setY(double newY){
        y = newY;
    }  

    public double getY(){
        return y;
    } 

    public void setZ(double newZ){
        z = newZ;
    }  

    public double getZ(){
        return z;
    } 

    public void setName(String newName){
        name = newName;
    }  

    public String getName(){
        
        return name;
        
    } 
    
    public static double getDistanceBetween(CelestialObject obj1,CelestialObject obj2){
        double d = Math.pow((Math.pow(obj2.getX() - obj1.getX(), 2) +
                         Math.pow(obj2.getY() - obj1.getY() , 2) +
                         Math.pow(obj2.getZ()  - obj1.getZ() , 2) *
                                    1.0), 0.5);
        
    
        return d;
    }

    public static double getDistanceBetweenInKm(CelestialObject obj1,CelestialObject obj2){
        
        double distanceKm = getDistanceBetween(obj1, obj2)* KM_IN_ONE_AU;
        
        return distanceKm;
    }

    public String toString(){
        if(getName() != null){
            String strange = "0.000";
            DecimalFormat df = new DecimalFormat(strange);
                
            
 
        String fff = this.getName() +" is positioned at (" +df.format(getX()) + "," +df.format(getY()) + "," + df.format(getZ()) +")";
        return fff;
        }
        return "e";
    }

    public boolean equals(CelestialObject obj1){

        boolean test1 = this.getName().equals(obj1.getName());
        boolean test2 = this.getX() == obj1.getX();
        boolean test3 = this.getY() == obj1.getY();
        boolean test4 = this.getZ() == obj1.getZ();


        if((test1 && test2) && (test3 && test4) == true){
           
            hashCode();
            return true;
        }else{
            return false;
        }
    }

    public int hashCode(){
        
        int aa = getClass().hashCode();

            

        return  aa;
        
    }

    

}



