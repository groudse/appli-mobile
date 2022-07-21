import java.util.ArrayList;
import java.util.List;

public class Character {
    public final  int maxHealth; 
    private int currentHealth; 
    private final String name; 
    private static List<Character> allCharacters = new ArrayList<>();


    public Character(String name, int maxHealth){
        this.name = name;
        this.currentHealth = maxHealth;
        this.maxHealth = maxHealth;
        allCharacters.add(this);
    }

    public static String printStatus(){
        
        List<Character> total = new ArrayList<>(allCharacters);

        if(total.isEmpty() == false){
        String fin = new String();
        String line = "------------------------------------------";

        String txt = "\nCharacters currently fighting :\n";

        for(int i =0;i<total.size();i++){
        String info = " - " + total.get(i).toString() + "\n";
        fin = fin + info;
        }

        return line + txt + fin +line;
    }else{
        String line = "------------------------------------------";
        String txt = "\nNobody's fighting right now !\n";
        return line + txt + line;
    }
    }

    public static Character fight(Character f1,Character f2){
        int i = 1;
        while(f1.getCurrentHealth() > 0 && f2.getCurrentHealth() > 0){
            if(i%2==0){
                f2.attack(f1);
            }else{
                f1.attack(f2);

            }
            i++;
        }

        if(f1.getCurrentHealth()<0){
            f1.currentHealth -= f1.currentHealth;
            return f2;

        }else{
            f2.currentHealth -= f2.currentHealth;

            return f1;

        }
    }

    public int getMaxHealth(){
        return maxHealth;
    }

    public int getCurrentHealth(){
        return currentHealth;
    }


    public String getName(){
        return name;
    }

    public void takeDamage(int dmg ){
        if(currentHealth>0){
        currentHealth -= dmg;
        }
    }

    public void attack(Character badGuy){
        badGuy.takeDamage(9);
    }

    public String toString(){

        String statusChara;
        if(this.currentHealth > 0){
            statusChara = getName() + " : " + this.getCurrentHealth()+ "/" + this.getMaxHealth();
        }else{
            statusChara = getName() + " : KO"; 
        }


        return statusChara;
    }

}
