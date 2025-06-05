package WorkoutLog;

import static java.lang.Math.sqrt;

public class DBLatRaise  extends Exercise{
    public DBLatRaise() {
        super();
        super.name="Dumbbell Lateral Raises";
        super.setReferenceScore(2*5*8*10);
    }
    public DBLatRaise(String comment) {
        super("Dumbbell Lateral Raises",comment);
        super.setReferenceScore(2*5*8*10);
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

