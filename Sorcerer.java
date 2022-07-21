public class Sorcerer extends Character implements Healer {
    private final int healCapacity;

    public Sorcerer(String name, int maxHealth,int healCapacity, Weapon deag){
        super(name, maxHealth, deag);
        this.healCapacity = healCapacity;
    }

    public int getHealCapacity(){
        return healCapacity;
    }

    public void heal(Character help){
        if(help.getCurrentHealth() + getHealCapacity() <= help.getMaxHealth()){
        help.currentHealth += getHealCapacity();
        }else{
        help.currentHealth += (help.getMaxHealth() - help.getCurrentHealth());
        
        }
    }

    @Override
    public String toString(){
        if(this.getCurrentHealth() > 0){
        return this.getName() +" is a sorcerer with "+ this.getCurrentHealth() +
        " HP. It can heal "+ this.getHealCapacity() +" HP. He has the weapon " + this.getWeapon().toString();
        }else{
            return this.getName()+ " is a dead sorcerer. So bad, it could heal "
            + this.getHealCapacity() + " HP. He has the weapon " + this.getWeapon().toString();
        }
    }

    @Override
    public void takeDamage(int dmg) {
        currentHealth -= dmg;
        
        if(currentHealth<0){
         currentHealth = 0;
        }
        
    }

    @Override
    public void attack(Character badGuy) {
        heal(this);
        if(this.getWeapon() == null){
            badGuy.takeDamage(10);
            }else{
                badGuy.takeDamage(this.getWeapon().getDamage());
            }
    }
}

   