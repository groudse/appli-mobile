import java.lang.Math;
public class Monster  extends Character{

    public Monster(String name, int maxHealth,Weapon deag) {
        super(name, maxHealth,deag);
        
    }


    @Override
    public String toString(){
        if(this.getCurrentHealth()>0){
            return this.getName() + " is a monster with " + this.getCurrentHealth() + " HP. He has the weapon " + this.getWeapon().toString();
        }else{
            return this.getName() + " is a monster and is dead. He has the weapon " + this.getWeapon().toString();
        }
    }


    @Override
    public void takeDamage(int dmg) throws DeadCharacterException{

        if(currentHealth>0){
            currentHealth -= Math.round(dmg*0.8);
        }else{
            currentHealth = 0;
            throw new DeadCharacterException(this);
        }
        
    }


    @Override
    public void attack(Character badGuy) throws DeadCharacterException{
       if(currentHealth>0){
        if(this.getWeapon() == null){
        badGuy.takeDamage(7);
        }else{
            badGuy.takeDamage(this.getWeapon().getDamage());
        }
    }else{
        throw new DeadCharacterException(this);
    }
    }
    
}


