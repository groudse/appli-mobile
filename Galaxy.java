import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Collections;

public class Galaxy {

    private List<CelestialObject> celestialObjects = new ArrayList<CelestialObject>();

    public Galaxy(){
        celestialObjects.clear();
    }

    public void addCelestialObject(CelestialObject planet) {
        
        celestialObjects.add(planet);

    }

    public List<CelestialObject> getCelestialObjects() {
        return celestialObjects;
    }





}
