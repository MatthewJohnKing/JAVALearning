package WorkoutLog;

import static java.lang.Math.sqrt;

public class DBShoulderShrugs  extends Exercise{
    public DBShoulderShrugs() {
        super();
        super.name="Dumbbell Shoulder Shrugs";
        super.setReferenceScore(2*5*14*12);
    }
    public DBShoulderShrugs(String comment) {
        super("Dumbbell Shoulder Shrugs",comment);
        super.setReferenceScore(2*5*14*12);
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