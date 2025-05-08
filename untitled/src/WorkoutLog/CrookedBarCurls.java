package WorkoutLog;

public class CrookedBarCurls extends Exercise{
    public CrookedBarCurls() {
        super();
        super.name="Crooked Bar Over Bench Curls";
    }
    public CrookedBarCurls(String comment) {
        super("Crooked Bar Over Bench Curls",comment);
    }

    @Override
    public double exerciseScore(){
        final Double[] score = {0.0};
        super.getExerciseSets().forEach( dat ->  { score[0] += (80-dat[0])*dat[1];});
        return score[0];
    }

    @Override
    public double exerciseReferenceScore() {
        return 5*13*10;
    }
}