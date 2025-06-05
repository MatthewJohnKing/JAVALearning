package WorkoutLog;

import static java.lang.Math.sqrt;

public class LatPullDownOut  extends Exercise{
    public LatPullDownOut() {
        super();
        super.name="Lateral Pulldown bar with Outside Grip";
        super.setReferenceScore(5*25*12);
    }
    public LatPullDownOut(String comment) {
        super("lateral Pulldown bar with Outside Grip",comment);
        super.setReferenceScore(5*25*12);
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
