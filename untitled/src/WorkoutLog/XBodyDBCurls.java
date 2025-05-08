package WorkoutLog;

import static java.lang.Math.sqrt;

public class XBodyDBCurls  extends Exercise{
    public XBodyDBCurls() {
        super();
        super.name="Cross Body dumbbell curls";
    }
    public XBodyDBCurls(String comment) {
        super("Cross Body dumbbell curls",comment);
    }

    @Override
    public double exerciseScore(){
        final Double[] score = {0.0};
        super.getExerciseSets().forEach( dat ->  { score[0] += dat[0]*dat[1]*2*sqrt(2);});
        return score[0];
    }

    @Override
    public double exerciseReferenceScore() {
        return 2*sqrt(2)*5*8*10;
    }
}