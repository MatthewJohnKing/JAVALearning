package WorkoutLog;

import static java.lang.Math.sqrt;

public class RotatorCuffDB extends Exercise{
    public RotatorCuffDB() {
        super();
        super.name="Rotator Cuff DB Curls";
        super.setReferenceScore(2*5*2*10);
    }
    public RotatorCuffDB(String comment) {
        super("Rotator Cuff DB Curls",comment);
        super.setReferenceScore(2*5*2*10);
    }

    @Override
    public double exerciseScore(){
        return this.exerciseScore(false);
    }

    public double exerciseScore(Boolean setScore){
        final Double[] score = {0.0};
        // super.getExerciseSets().forEach( dat ->  { score[0] += dat[0]*dat[1];});
         super.getExerciseSets().forEach( dat ->  { score[0] += 2*dat[0]*dat[1];});
        // super.getExerciseSets().forEach( dat ->  { score[0] += 2*sqrt(2)*dat[0]*dat[1];});
        if(setScore) {
            super.setScore(score[0]);
        }
        return score[0];
    }
}