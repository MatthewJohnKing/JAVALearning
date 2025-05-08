package WorkoutLog;

import static java.lang.Math.sqrt;

public class RotatorCuffDB extends Exercise{
    public RotatorCuffDB() {
        super();
        super.name="Rotator Cuff DB Curls";
    }
    public RotatorCuffDB(String comment) {
        super("Rotator Cuff DB Curls",comment);
    }

    @Override
    public double exerciseScore(){
        final Double[] score = {0.0};
        // super.getExerciseSets().forEach( dat ->  { score[0] += dat[0]*dat[1];});
         super.getExerciseSets().forEach( dat ->  { score[0] += 2*dat[0]*dat[1];});
        // super.getExerciseSets().forEach( dat ->  { score[0] += 2*sqrt(2)*dat[0]*dat[1];});
        return score[0];
    }

    @Override
    public double exerciseReferenceScore() {
         return 2*5*2*10;
        // return 1;
    }
}