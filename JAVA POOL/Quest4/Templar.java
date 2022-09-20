public class Templar extends Character implements Healer,Tank{
    
    private final int healCapacity;
    private final int shield;

    public Templar(String name, int maxHealth, int healCapacity, int shield, Weapon deag){
        super(name, maxHealth, deag);
        this.healCapacity = healCapacity;
        this.shield = shield;
    }

    @Override
    public int getHealCapacity() {
        return healCapacity;
    }

    @Override
    public void heal(Character perso) throws DeadCharacterException{
        if(currentHealth>0){
        if(perso.getCurrentHealth() + this.getHealCapacity() <= perso.getMaxHealth()){
            perso.currentHealth += this.getHealCapacity();
            }else{
                perso.currentHealth += (perso.getMaxHealth() - perso.getCurrentHealth());
            
            }
        }else{
            throw new DeadCharacterException(this);
        }
        
    }
    @Override
    public int getShield() {
       return shield;
    }

    @Override
    public String toString(){
        if(this.getCurrentHealth() > 0){
        return  this.getName() + " is a strong Templar with "+this.getCurrentHealth()
                + " HP. It can heal "+this.getHealCapacity() +" HP and has a shield of "+
                this.getShield()+". He has the weapon " + this.getWeapon().toString();
        }else{
            return this.getName() + " has been beaten, even with its " + this.getShield()+ 
            " shield. So bad, it could heal "+ this.getHealCapacity()+ " HP. He has the weapon " + this.getWeapon().toString();
        }
    }

    @Override
    public void takeDamage(int dmg) throws DeadCharacterException{
        
        
    
            if(currentHealth>0){
                currentHealth -= (dmg-getShield());
            }else{
                throw new DeadCharacterException(this);
            }
       

        }

        
        
    

    @Override
    public void attack(Character badGuy) throws DeadCharacterException{
        if(currentHealth>0){
        heal(this);
        if(this.getWeapon() == null){
            badGuy.takeDamage(6);
            }else{
                badGuy.takeDamage(this.getWeapon().getDamage());
            }
        
    }else{
        throw new DeadCharacterException(this);
    }
    

   
    
    
}
}
