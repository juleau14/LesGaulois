package histoire;

import personnages.Druide;
import personnages.Gaulois;
import personnages.Romain;

public class Scenario {
    public static void main(String[] args) {
        Gaulois obelix = new Gaulois("Obélix", 20);
        Gaulois asterix = new Gaulois("Astérix", 8);
        Romain minus = new Romain("Minus", 6);
        Druide panoramix = new Druide("Panoramix", 5, 10);

        panoramix.parler("Bonjour, je suis Panoramix et ma potion est dee force comprise entre 5 et 10");
        panoramix.parler("Je vais aller préparer une petite potion au chateau de soupex avec rexma.");
        panoramix.preparerPotion();
        panoramix.booster(obelix);

        obelix.parler("Par Benelox, ce n'est pas juste !");

        panoramix.booster(asterix);

        asterix.parler("Bonjour tout le monde.");
        
        minus.parler("UN GAU... UN GAUGAU... UN GAULOIS !!!!");

        asterix.frapper(minus);
    }
}
