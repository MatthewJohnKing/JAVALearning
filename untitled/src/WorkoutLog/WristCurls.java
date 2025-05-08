package WorkoutLog;

import static java.lang.Math.sqrt;

public class WristCurls extends Exercise{
    public WristCurls() {
        super();
        super.name="Weighted Wrist Curls";
    }
    public WristCurls(String comment) {
        super("Weightd Wrist Curls",comment);
    }

    @Override
    public double exerciseScore(){
        final Double[] score = {0.0};
        super.getExerciseSets().forEach( dat ->  { score[0] += 2*sqrt(2)*dat[0]*dat[1];});
        return score[0];
    }

    @Override
    public double exerciseReferenceScore() {
        return 2*sqrt(2)*5*6*12;
    }
}
