package WorkoutLog;

import static java.lang.Math.sqrt;

public class RearDelt extends Exercise{
    public RearDelt() {
        super();
        super.name="Rear Delt Machine";
        super.setReferenceScore(5*12*12);
    }
    public RearDelt(String comment) {
        super("Rear Delt Machine",comment);
        super.setReferenceScore(5*12*12);
    }

    @Override
    public double exerciseScore(){
        return this.exerciseScore(false);
    }

    public double exerciseScore(Boolean setScore){
        final Double[] score = {0.0};
         super.getExerciseSets().forEach( dat ->  { score[0] += dat[0]*dat[1];});
        // super.getExerciseSets().forEach( dat ->  { score[0] += 2*dat[0]*dat[1];});
        // super.getExerciseSets().forEach( dat ->  { score[0] += 2*sqrt(2)*dat[0]*dat[1];});
        if(setScore) {
            super.setScore(score[0]);
        }
        return score[0];
    }
}

