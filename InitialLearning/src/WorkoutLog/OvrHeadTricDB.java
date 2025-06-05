package WorkoutLog;

import static java.lang.Math.sqrt;

public class OvrHeadTricDB  extends Exercise{
    public OvrHeadTricDB() {
        super();
        super.name="OverHead Tricep Extension with DB";
        super.setReferenceScore(5*14*10);
    }
    public OvrHeadTricDB(String comment) {
        super("OverHead Tricep Extension with DB",comment);
        super.setReferenceScore(5*14*10);
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
