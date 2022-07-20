public class Character {
    private final  int maxHealth; 
    private int currentHealth; 
    private final String name; 


    public Character(String name, int maxHealth){
        this.name = name;
        this.currentHealth = maxHealth;
        this.maxHealth = maxHealth;
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

    public void takeDamage(int dmg){
        if(currentHealth-dmg > 0){
        currentHealth -= dmg;
        }
    }

    public void attack(Character badGuy){
        badGuy.takeDamage(9);
    }

    public String toString(){

        String statusChara;
   
        if(this.currentHealth > 0){
            statusChara = getName() + " : " + this.getCurrentHealth()+ "/" + getMaxHealth();
        }else{
            statusChara = getName() + " : KO"; 
        }


        return statusChara;
    }

}
