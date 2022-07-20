import java.util.Collections;
import java.util.List;
import java.util.Collections;

public class Galaxy {

    private List<CelestialObject> celestialObjects;

    public Galaxy(){
        celestialObjects = Collections.emptyList();
    }

    public void addCelestialObject(CelestialObject planet) {
        celestialObjects.add(planet);

    }

    public List<CelestialObject> getCelestialObjects() {
        return celestialObjects;
    }





}
