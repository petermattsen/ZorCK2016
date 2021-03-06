package verbs;

import core.*;
import core.World.Direction;

public class Climb extends Verb {

    public Climb() {
        super("climb",
                new String[]{"scale"},
                Verb.usage().bare().noun());
    }

    public void run(Command command, Context construct) {
        command.getDirection();
        Item noun = command.getNoun();

        Player player = construct.getPlayer();
        construct.getWorld();

        if (noun != null) {
            if (!noun.getName().equals("noItem")) {
                final Portal upPortal = player.getCurrentArea().getPortals().up();
                if (noun.getUsageKey(13) == 2 && upPortal != null) {
                    if (!upPortal.isLocked()) {
                        construct.getPlayer().getCurrentArea().interact(new Command(new Move(), null, Direction.UP), construct);
                    } else {
                        System.out.println("You can't climb that!");
                    }
                } else {
                    System.out.println("You can't climb that!");
                }
            } else {
                construct.getPlayer().getCurrentArea().interact(new Command(new Move(), null, Direction.UP), construct);
            }
        } else {
            System.out.println("Where do you expect to find one of those?");
        }
    }
}
