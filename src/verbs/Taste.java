package verbs;

import core.*;

public class Taste extends Verb {

    public Taste() {
        super("taste",
                new String[]{"lick", "sample"},
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
                if (noun.getTaste() != null) {
                    System.out.println(noun.getTaste());
                } else {
                    System.out.println("It tastes like every other "
                            + noun.getName() + " you've ever tried");
                }
            } else if (area.getTaste() != null) {
                System.out.println(area.getTaste());
            } else {
                System.out.println("It doesn't taste like anything");
            }
        } else {
            System.out.println("Where do you expect to find one of those?");
        }
    }
}
