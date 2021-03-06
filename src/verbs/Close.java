package verbs;

import core.*;

public class Close extends Verb {

    public Close() {
        super("close",
                new String[]{"shut"},
                Verb.usage().noun());

    }

    public void run(Command command, Context construct) {
        command.getDirection();
        Item noun = command.getNoun();

        construct.getPlayer();
        construct.getWorld();

        if (noun != null) {
            if (!noun.getName().equals("noItem")) {
                if (noun.getUsageKey(4) == 3) {
                    noun.setUsageKey(4, 2);
                    System.out.println("You closed the " + noun.getName());
                } else if (noun.getUsageKey(4) == 2) {
                    System.out.println(noun.getName() + " is already closed");
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
