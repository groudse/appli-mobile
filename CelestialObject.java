public class CelestialObject {
    public double x;
    public double y;
    public double z;
    public String name;
    
    CelestialObject(){
        x = 0.0;
        y = 0.0;
        z = 0.0;
        name = "Soleil";
    }

    CelestialObject(String f,double v1,double v2,double v3){
        x = v1;
        y = v2;
        z = v3;
        name = f;
    }
}



