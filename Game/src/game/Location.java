
package game;


public class Location {
    private String descrip;
    private String name;
    private int num;
    private String code;
    private boolean key;
    
    public Location(String des, String _name, int _num, String _code ){
        descrip = des;
        name = _name;
        num = _num;
        code = _code;
        key = false;
    }
    
    // calls variables
    public String getDescrip(){
        return descrip;
    }
    public String getName(){
        return name;
    }
    
    public int getNum(){
        return num;
    }
    
    public String getCode(){
        return code;
    }
    public boolean hasKey(){
        return key;
    }
    
}
