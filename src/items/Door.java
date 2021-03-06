package items;

import core.*;
import java.util.ArrayList;
import java.util.List;

public class Door extends Item{
    
    public Door(boolean locked,String name,String key,Portal portal){
        super();
        setUsageKey(Item.TAKE,3);
        setUsageKey(Item.OPEN,2);
        if(locked){
            setUsageKey(Item.LOCK,3);
            setName("Locked Door");
            setDescription("You gotta find some way to unlock it!");
            addSynonym("locked door");
        }else{
            setUsageKey(Item.LOCK,2);
            setName("Door");
            setDescription("Whelp, that's a door alright!");
        }
        if(name != null){
            setName(name);
            addSynonym(name.toLowerCase());
        }
        addSynonym("door");
        List<String> keys = new ArrayList<String>();
        keys.add(key);
        setKeys(keys);
        setPortal(portal);
    }
    
    public void interact(Command command, Context context){
        
    }
}
