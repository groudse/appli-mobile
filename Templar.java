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
    public void heal(Character perso) {
        // System.out.println(perso.getCurrentHealth() + this.getHealCapacity());
        if(perso.getCurrentHealth() + this.getHealCapacity() <= perso.getMaxHealth()){
            perso.currentHealth += this.getHealCapacity();
            }else{
                perso.currentHealth += (perso.getMaxHealth() - perso.getCurrentHealth());
            
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
    public void takeDamage(int dmg) {
        currentHealth -= (dmg-getShield());
        
        if(currentHealth<0){
         currentHealth = 0;
        }
        
    }

    @Override
    public void attack(Character badGuy) {
        heal(this);
        if(deag == null){
            badGuy.takeDamage(6);
            }else{
                badGuy.takeDamage(deag.getDamage());
            }
        
    }
    

   
    
    
}
