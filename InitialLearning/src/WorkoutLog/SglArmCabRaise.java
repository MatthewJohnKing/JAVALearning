package WorkoutLog;

import static java.lang.Math.sqrt;

public class SglArmCabRaise extends Exercise{
    public SglArmCabRaise() {
        super();
        super.name="Single Arm Cable Raises";
        super.setReferenceScore(2*sqrt(2)*5*3.4*10);
    }
    public SglArmCabRaise(String comment) {
        super("Single Arm Cable Raises",comment);
        super.setReferenceScore(2*sqrt(2)*5*3.4*10);
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

