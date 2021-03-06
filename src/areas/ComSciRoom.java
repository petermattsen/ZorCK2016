package areas;

import core.*;

public class ComSciRoom extends Area{

    public ComSciRoom(World containingWorld) {
        super(containingWorld);
        getPortals().east(new Portal(false, "Hallway5"))
            .south(new Portal(false, "Wachtman's room"));
        //change the portal to go to hallway when hallway is made
        setTitle("Comsci Room");
        setInitialDescription("This is the Comsci room, Room 317.");
        setDescription("This is the Comsci Room, room 317");
        
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
