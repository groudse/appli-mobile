import java.lang.Math;
public class Monster  extends Character{

    public Monster(String name, int maxHealth) {
        super(name, maxHealth);
        
    }


    @Override
    public String toString(){
        if(this.getCurrentHealth()>0){
            return this.getName() + " is a monster with " + this.getCurrentHealth() + " HP";
        }else{
            return this.getName() + " is a monster and is dead";
        }
    }


    @Override
    void takeDamage(int dmg) {
        currentHealth -= Math.round(dmg*0.8);
        
        if(currentHealth<0){
         currentHealth = 0;
        }
        
    }


    @Override
    public void attack(Character badGuy) {
        badGuy.takeDamage(7);
        
    }
    
}


