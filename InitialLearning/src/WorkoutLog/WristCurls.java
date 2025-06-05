package WorkoutLog;

import static java.lang.Math.sqrt;

public class WristCurls extends Exercise{
    public WristCurls() {
        super();
        super.name="Weighted Wrist Curls";
        super.setReferenceScore(2*sqrt(2)*5*6*12);
    }
    public WristCurls(String comment) {
        super("Weightd Wrist Curls",comment);
        super.setReferenceScore(2*sqrt(2)*5*6*12);
    }

    @Override
    public double exerciseScore(){
        return this.exerciseScore(false);
    }

    public double exerciseScore(Boolean setScore){
        final Double[] score = {0.0};
        super.getExerciseSets().forEach( dat ->  { score[0] += 2*sqrt(2)*dat[0]*dat[1];});
        if(setScore) {
            super.setScore(score[0]);
        }
        return score[0];
    }
}
