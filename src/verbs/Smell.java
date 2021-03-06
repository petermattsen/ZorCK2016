package verbs;

import core.*;

public class Smell extends Verb {

    public Smell() {
        super("smell",
                new String[]{"sniff"},
                Verb.usage().bare().noun());

    }

    public void run(Command command, Context construct) {
        command.getDirection();
        Item noun = command.getNoun();

        Player player = construct.getPlayer();
        construct.getWorld();
        Area area = player.getCurrentArea();

        if (noun != null) {
            if (!noun.getName().equals("noItem")) {
                if (noun.getSmell() != null) {
                    System.out.println(noun.getSmell());
                } else {
                    System.out.println("It smells like every other "
                            + noun.getName() + " you've ever smelled");
                }
            } else if (area.getSmell() != null) {
                System.out.println(area.getSmell());
            } else {
                System.out.println("It doesn't smell like anything");
            }
        } else {
            System.out.println("Where do you expect to find one of those?");
        }
    }
}
