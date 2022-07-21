public class Templar extends Character implements Healer,Tank{
    
    private final int healCapacity;
    private final int shield;

    public Templar(String name, int maxHealth, int healCapacity, int shield){
        super(name, maxHealth);
        this.healCapacity = healCapacity;
        this.shield = shield;
    }

    @Override
    public int getHealCapacity() {
        return healCapacity;
    }

    @Override
    public void heal(Character perso) {
        if(perso.getCurrentHealth() + this.getHealCapacity() <= this.getMaxHealth()){
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
                this.getShield()+".";
        }else{
            return this.getName() + " has been beaten, even with its " + this.getShield()+ 
            " shield. So bad, it could heal "+ this.getHealCapacity()+ " HP.";
        }
    }
    

   
    
    
}
