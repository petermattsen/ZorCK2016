package items;

import core.*;

public class Key extends Item{
    
    public Key(String name, String description){
        super();
        setUsageKey(Item.TAKE,1);
        setName(name);
        if(!name.equals("key")) addSynonym(name.toLowerCase());
        addSynonym("key");
        setDescription(description);
    }
    
    public Key(){
        super();
        setUsageKey(Item.TAKE,1);
        setName("Key");
        addSynonym("key");
        setDescription("A small, yellow key");
    }
    
    public void interact(Command command, Context context){
        
    }
    
}
