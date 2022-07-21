import  java.lang.Exception;

public class DeadCharacterException extends Exception{
    
    private Character perso;

    public DeadCharacterException(Character perso){
        this.perso = perso;
    }

    public String getMessage(){

        if(perso instanceof Sorcerer){

            return "The sorcerer "+ perso.getName() +" is dead.";

        }else if(perso instanceof Monster){
            return "The monster "+ perso.getName() +" is dead.";
        }else{
            return "The templar "+ perso.getName() +" is dead.";
        }
    }


}
