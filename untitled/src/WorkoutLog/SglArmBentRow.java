package WorkoutLog;

import static java.lang.Math.sqrt;

public class SglArmBentRow  extends Exercise{
    public SglArmBentRow() {
        super();
        super.name="Single Arm Bent Over Rows";
        super.setReferenceScore(2*sqrt(2)*5*16*12);
    }
    public SglArmBentRow(String comment) {
        super("Single Arm Bent Over Rows",comment);
        super.setReferenceScore(2*sqrt(2)*5*16*12);
    }

    @Override
    public double exerciseScore(){
        return this.exerciseScore(false);
    }

    public double exerciseScore(Boolean setScore){
        final Double[] score = {0.0};
        // super.getExerciseSets().forEach( dat ->  { score[0] += dat[0]*dat[1];});
        // super.getExerciseSets().forEach( dat ->  { score[0] += 2*dat[0]*dat[1];});
        super.getExerciseSets().forEach( dat ->  { score[0] += 2*sqrt(2)*dat[0]*dat[1];});
        if(setScore) {
            super.setScore(score[0]);
        }
        return score[0];
    }
}

