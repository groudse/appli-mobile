public class CelestialObject {
    public double x;
    public double y;
    public double z;
    public String name;
    
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
}



