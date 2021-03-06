package verbs;

import core.*;

public class TurnOff extends Verb {

    public TurnOff() {
        super("turn off",
                new String[]{"deactivate"},
                Verb.usage().noun());
    }

    public void run(Command command, Context construct) {
        command.getDirection();
        Item noun = command.getNoun();

        construct.getPlayer();
        construct.getWorld();

        if (noun != null) {
            if (!noun.getName().equals("noItem")) {
                if (noun.getUsageKey(7) == 3) {
                    noun.setUsageKey(7, 2);
                    System.out.println("You turned off the " + noun.getName());
                } else if (noun.getUsageKey(7) == 2) {
                    System.out.println(noun.getName() + " is already off");
                } else {
                    System.out.println("I don't see how you expect to do that");
                }
            } else {
                System.out.println("Ya need a noun, ya dingus");
            }
        } else {
            System.out.println("Where do you expect to find one of those?");
        }
    }
}
