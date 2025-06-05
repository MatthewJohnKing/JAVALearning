package WorkoutLog;

import static java.lang.Math.sqrt;

public class HalfDBCurls extends Exercise{
    public HalfDBCurls() {
        super();
        super.name="Half Dumbbell Curls";
        super.setReferenceScore(2*sqrt(2)*5*10*10);
    }
    public HalfDBCurls(String comment) {
        super("Half Dumbbell Curls",comment);
        super.setReferenceScore(2*sqrt(2)*5*10*10);
    }

    @Override
    public double exerciseScore(){
        return this.exerciseScore(false);
    }

    public double exerciseScore(Boolean setScore){
        final Double[] score = {0.0};
        super.getExerciseSets().forEach( dat ->  { score[0] += dat[0]*dat[1]*2*sqrt(2);});
        if(setScore) {
            super.setScore(score[0]);
        }
        return score[0];
    }
}
