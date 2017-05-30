
package game;

import java.util.ArrayList;


public class Inventory {
    private String[] inv;

    
    public Inventory(){
        inv = new String[4];
        inv[0] = "empty";
        inv[1] = "empty";
        inv[2] = "empty";
        inv[3] = "empty";
    }
    
    public String print(){
        return "-" + inv[0]+ "\n -"+ inv[1]+"\n -"+ inv[2]+ "\n -"+inv[3]  ;
    }
    // adds key to array
    public void addKey(int n){
        if(n == 1){
            inv[0] = "key 1";
        }
        if(n == 2){
            inv[1] = "key 2";
        }
        if(n == 3){
            inv[2] = "key 3";
        }
        if(n == 4){
            inv[3] = "key 4";
        }
    }
    // checks if player has all the keys to start the ending.
    public boolean has4Keys(){
        
        if(inv[0].equals("key 1")&& inv[1].equals("key 2") && inv[2].equals("key 3")&& inv[3].equals("key 4") ){
            return true;
        }
        
        return false;
    }
}
