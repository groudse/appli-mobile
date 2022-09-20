public interface Healer {
    

    void heal(Character perso) throws DeadCharacterException;
    int getHealCapacity();
       
    
}
