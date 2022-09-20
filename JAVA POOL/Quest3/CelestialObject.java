package Quest3;
import java.text.DecimalFormat;

import java.util.Objects;

public class CelestialObject {

    public double x;
    public double y;
    public double z;
    public String name;
    private int mass;
    public final static double KM_IN_ONE_AU = 150000000;

    public CelestialObject() {
        x = 0.0;
        y = 0.0;
        z = 0.0;
        mass = 0;
        name = "Soleil";
    }

    public CelestialObject(String f, double v1, double v2, double v3, int mass) {
        x = v1;
        y = v2;
        z = v3;
        this.mass = mass;
        name = f;
    }

    public void setMass(int mass) {
        this.mass = mass;
    }

    public int getMass() {
        return mass;
    }

    public void setX(double newX) {
        x = newX;
    }

    public double getX() {
        return x;
    }

    public void setY(double newY) {
        y = newY;
    }

    public double getY() {
        return y;
    }

    public void setZ(double newZ) {
        z = newZ;
    }

    public double getZ() {
        return z;
    }

    public void setName(String newName) {
        name = newName;
    }

    public String getName() {

        return name;

    }

    public static double getDistanceBetween(CelestialObject obj1, CelestialObject obj2) {
        double d = Math.pow((Math.pow(obj2.getX() - obj1.getX(), 2) +
                Math.pow(obj2.getY() - obj1.getY(), 2) +
                Math.pow(obj2.getZ() - obj1.getZ(), 2) *
                        1.0),
                0.5);

        return d;
    }

    public static double getDistanceBetweenInKm(CelestialObject obj1, CelestialObject obj2) {

        double distanceKm = getDistanceBetween(obj1, obj2) * KM_IN_ONE_AU;

        return distanceKm;
    }

    public String toString() {
        if (getName() != null) {
            String strange = "0.000";
            DecimalFormat df = new DecimalFormat(strange);

            String fff = this.getName() + " is positioned at (" + df.format(getX()) + ", " + df.format(getY()) + ", "
                    + df.format(getZ()) + ")";
            return fff;
        }
        return "e";
    }

    
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CelestialObject that = (CelestialObject) o;
        return Double.compare(that.x, x) == 0 && Double.compare(that.y, y) == 0
                && Double.compare(that.z, z) == 0 && name.equals(that.name); 
    }

    public int hashCode() {

        return Objects.hash(x, y, z, name);

    }

}
