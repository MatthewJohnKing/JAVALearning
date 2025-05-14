package WorkoutLog;

import static java.lang.Math.sqrt;

public class FWRow extends Exercise{
    public FWRow() {
        super();
        super.name="Free Weight Row";
        super.setReferenceScore(2*5*26.3*12);
    }
    public FWRow(String comment) {
        super("Free Weight Row",comment);
        super.setReferenceScore(2*5*26.3*12);
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

