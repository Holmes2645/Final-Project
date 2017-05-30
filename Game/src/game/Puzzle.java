
package game;


public class Puzzle {
    private int roomN;
    private String room1;
    private String room2;
    private String room3;
    private String room4;
    
    public Puzzle(){
        
    }
    
    public String getKey(Location rN, String code, Inventory inv){
        if(rN.hasKey()){
            return "You already have the key.";
        }
        
        if(code.equals(rN.getCode())){
           inv.addKey(rN.getNum());
           return "After entering the code, the lock on the safe door \n disengages."
                   + " You open the safe door and grab the key. \n - Obtained key "+ rN.getNum();
        }
       return "Incorrect password"; 
    }
    
    public String allKeys (Inventory inv){
        if(inv.has4Keys()){
            return "As you realise you have collected all of the keys, you \n insert them into"
                    + "the console. Once all the keys are \n inserted, the console glows and you start to "
                    + "hear the \n sound of mechanisms moving to find out an elevator \n coming from the center "
                    + "of the room. You enter the \n elevator after the doors open and escape. \n - YOU WIN";
        }
        return "You do not have all the keys";
    }
    
    
}
