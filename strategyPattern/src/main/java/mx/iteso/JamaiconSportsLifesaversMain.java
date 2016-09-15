package mx.iteso;

import mx.iteso.strategy.Lifesaver;
import mx.iteso.strategy.lifesavers.*;

public class JamaiconSportsLifesaversMain {
        public static void main (String[] args) {
            Lifesaver swimRing = new SwimRing();
            Lifesaver swimSeat = new SwimSeat();
            Lifesaver armBands = new ArmBands();
            Lifesaver foamFloats = new FoamFloat();
            Lifesaver lifeVest = new LifeVest();

            System.out.println(swimRing.display());
            System.out.println(swimRing.performInflate());
            System.out.println(swimRing.performDeflate_());
            System.out.println(swimRing.performFloat());

            System.out.println();

            System.out.println(swimSeat.display());
            System.out.println(swimSeat.performInflate());
            System.out.println(swimSeat.performDeflate_());
            System.out.println(swimSeat.performFloat());

            System.out.println();

            System.out.println(armBands.display());
            System.out.println(armBands.performInflate());
            System.out.println(armBands.performDeflate_());
            System.out.println(armBands.performFloat());

            System.out.println();

            System.out.println(foamFloats.display());
            System.out.println(foamFloats.performInflate());
            System.out.println(foamFloats.performDeflate_());
            System.out.println(foamFloats.performFloat());

            System.out.println();

            System.out.println(lifeVest.display());
            System.out.println(lifeVest.performInflate());
            System.out.println(lifeVest.performDeflate_());
            System.out.println(lifeVest.performFloat());
        }
}
