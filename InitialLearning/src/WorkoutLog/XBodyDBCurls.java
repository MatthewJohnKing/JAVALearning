package WorkoutLog;

import static java.lang.Math.sqrt;

public class XBodyDBCurls  extends Exercise{
    public XBodyDBCurls() {
        super();
        super.name="Cross Body dumbbell curls";
        super.setReferenceScore(2*sqrt(2)*5*8*10);
    }
    public XBodyDBCurls(String comment) {
        super("Cross Body dumbbell curls",comment);
        super.setReferenceScore(2*sqrt(2)*5*8*10);
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