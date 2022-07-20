public class Character {
    private static int maxHealth; 
    private int currentHealth; 
    private static String name; 


    public Character(String name, int maxHealth){

        currentHealth = maxHealth;

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
        if(this.currentHealth>0){
        this.currentHealth -= dmg;
        }
    }

    public void attack(Character badGuy){
        takeDamage(9);
    }

    public String toString(){

        String statusChara;

        if(this.currentHealth > 0){
            statusChara = this.getName() + " : " + (this.getCurrentHealth()/this.getMaxHealth());
        }else{
            statusChara = this.getName() + " : KO"; 
        }


        return statusChara;
    }

}


/*

Implement two methods :

attack, with a Character parameter, that will call takeDamage of the parameter with a default value : 9. 
*/