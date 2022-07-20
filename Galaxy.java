import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

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

    public Map<String, Integer> computeMassRepartition(){
        Map<String, Integer> massCompute = new HashMap<String, Integer>(); 
        int totalPlanet = 0;
        int totalStar = 0;
        int totalOther = 0;

       for(int i = 0;i<celestialObjects.size();i++){ 
       
            if(celestialObjects.get(i) instanceof Planet){

                totalPlanet += celestialObjects.get(i).getMass() ;



            }else if(celestialObjects.get(i) instanceof Star){
                totalStar += celestialObjects.get(i).getMass();


            }else{
                totalOther += celestialObjects.get(i).getMass();


            }



       }
        massCompute.put("Planet", totalPlanet);
        massCompute.put("Star", totalStar);
        massCompute.put("Other", totalOther);
        return massCompute;
    }

}


/*For this last exercise, let's compute the mass of all objects in a galaxy, according their type.


In the Galaxy class, we will add a new method computeMassRepartition which returns a Map. This map will have for key the Strings 
Star, Planet or Other. The values will be the sum of the mass of the object by their type. */