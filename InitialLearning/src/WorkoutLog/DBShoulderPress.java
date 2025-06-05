package WorkoutLog;

import static java.lang.Math.sqrt;

public class DBShoulderPress extends Exercise{
    public DBShoulderPress() {
        super();
        super.name="Seated Dumbbell Shoulder Press";
        super.setReferenceScore(2*5*10*12);
    }
    public DBShoulderPress(String comment) {
        super("Seated Dumbbell Shoulder Press",comment);
        super.setReferenceScore(2*5*10*12);
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
