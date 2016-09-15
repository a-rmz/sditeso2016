package mx.iteso;

import mx.iteso.strategy.Ball;
import mx.iteso.strategy.balls.*;

public class JamaiconSportsBallMain {
    public static void main (String[] args) {
        Ball soccer = new SoccerBall();
        Ball base = new BaseballBall();
        Ball american = new AmericanFootballBall();
        Ball tennis = new TennisBall();
        Ball bowling = new BowlingBall();
        Ball volley = new VolleyballBall();
        Ball golf =new GolfBall();
        Ball pool = new PoolBall();

        System.out.println(soccer.roll());
        System.out.println(soccer.performBounce());
        System.out.println(soccer.performDeflate());
        System.out.println(soccer.performInflate());
        System.out.println(soccer.performDeform());

        System.out.println();

        System.out.println(american.roll());
        System.out.println(american.performBounce());
        System.out.println(american.performDeflate());
        System.out.println(american.performInflate());
        System.out.println(american.performDeform());

        System.out.println();

        System.out.println(base.roll());
        System.out.println(base.performBounce());
        System.out.println(base.performDeflate());
        System.out.println(base.performInflate());
        System.out.println(base.performDeform());

        System.out.println();

        System.out.println(tennis.roll());
        System.out.println(tennis.performBounce());
        System.out.println(tennis.performDeflate());
        System.out.println(tennis.performInflate());
        System.out.println(tennis.performDeform());

        System.out.println();

        System.out.println(bowling.roll());
        System.out.println(bowling.performBounce());
        System.out.println(bowling.performDeflate());
        System.out.println(bowling.performInflate());
        System.out.println(bowling.performDeform());

        System.out.println();

        System.out.println(volley.roll());
        System.out.println(volley.performBounce());
        System.out.println(volley.performDeflate());
        System.out.println(volley.performInflate());
        System.out.println(volley.performDeform());

        System.out.println();

        System.out.println(golf.roll());
        System.out.println(golf.performBounce());
        System.out.println(golf.performDeflate());
        System.out.println(golf.performInflate());
        System.out.println(golf.performDeform());

        System.out.println();

        System.out.println(pool.roll());
        System.out.println(pool.performBounce());
        System.out.println(pool.performDeflate());
        System.out.println(pool.performInflate());
        System.out.println(pool.performDeform());

    }
}
