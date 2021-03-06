package areas;

import core.*;
import items.*;

public class Test3 extends Area{

       public Test3(World containingWorld){
            super(containingWorld);
            getPortals().west(new Portal(false, "Test2"))
                .south(new Portal(false, "Test6"));
            setTitle("Test Area 3");
            setInitialDescription("This is the third test area, there is path "
                    + "leading west and a path leading south. There is a sword"
                    + " on the ground");
            setDescription("This is the third test area");
            addItem(new Sword());
            setState("First",true);   
       }
       
    @Override
    public void interact(Command command, Context context){
        Item noun;
        noun = command.getNoun();
        //if you don't have any special interactions, just put this:
        if(command.getNoun() !=  null)
            noun.interact(command,context);
        if(!context.getSkipGeneral())
            command.getVerb().run(command, context);
    }
       
}
