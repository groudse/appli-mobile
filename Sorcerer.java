public class Sorcerer extends Character implements Healer {
    private int healCapacity;

    public Sorcerer(String name, int maxHealth,int healCapacity){
        super(name, maxHealth);
        this.healCapacity = healCapacity;
    }

    public int getHealCapacity(){
        return healCapacity;
    }

    public void heal(Character help){
        if(help.currentHealth + healCapacity < help.maxHealth){
        help.currentHealth += healCapacity;
        }
    }

    @Override
    public String toString(){
        if(this.getCurrentHealth() > 0){
        return this.getName() +" is a sorcerer with "+ this.getCurrentHealth() +
        " HP. It can heal "+ this.getHealCapacity() +" HP";
        }else{
            return this.getName()+ " is a dead sorcerer. So bad, it could heal "
            + this.getHealCapacity() + " HP";
        }
    }
}

   
