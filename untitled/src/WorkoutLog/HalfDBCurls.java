package WorkoutLog;

import static java.lang.Math.sqrt;

public class HalfDBCurls extends Exercise{
    public HalfDBCurls() {
        super();
        super.name="Half Dumbbell Curls";
    }
    public HalfDBCurls(String comment) {
        super("Half Dumbbell Curls",comment);
    }

    @Override
    public double exerciseScore(){
        final Double[] score = {0.0};
        super.getExerciseSets().forEach( dat ->  { score[0] += dat[0]*dat[1]*2*sqrt(2);});
        return score[0];
    }

    @Override
    public double exerciseReferenceScore() {
        return 2*sqrt(2)*5*10*10;
    }
}
