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
            Lifesaver lifesaverCandy = new LifesaverCandy();
            Lifesaver swimBelt = new SwimBelt();
            Lifesaver waterTube = new WaterTube();

            System.out.println(swimRing.display());
            System.out.println(swimRing.performInflate());
            System.out.println(swimRing.performDeflate());
            System.out.println(swimRing.performFloat());

            System.out.println();

            System.out.println(swimSeat.display());
            System.out.println(swimSeat.performInflate());
            System.out.println(swimSeat.performDeflate());
            System.out.println(swimSeat.performFloat());

            System.out.println();

            System.out.println(armBands.display());
            System.out.println(armBands.performInflate());
            System.out.println(armBands.performDeflate());
            System.out.println(armBands.performFloat());

            System.out.println();

            System.out.println(foamFloats.display());
            System.out.println(foamFloats.performInflate());
            System.out.println(foamFloats.performDeflate());
            System.out.println(foamFloats.performFloat());

            System.out.println();

            System.out.println(lifeVest.display());
            System.out.println(lifeVest.performInflate());
            System.out.println(lifeVest.performDeflate());
            System.out.println(lifeVest.performFloat());

            System.out.println();

            System.out.println(lifesaverCandy.display());
            System.out.println(lifesaverCandy.performInflate());
            System.out.println(lifesaverCandy.performDeflate());
            System.out.println(lifesaverCandy.performFloat());

            System.out.println();

            System.out.println(swimBelt.display());
            System.out.println(swimBelt.performInflate());
            System.out.println(swimBelt.performDeflate());
            System.out.println(swimBelt.performFloat());

            System.out.println();

            System.out.println(waterTube.display());
            System.out.println(waterTube.performInflate());
            System.out.println(waterTube.performDeflate());
            System.out.println(waterTube.performFloat());

        }
}
