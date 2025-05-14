package WorkoutLog;

public class CrookedBarCurls extends Exercise{
    public CrookedBarCurls() {
        super();
        super.name="Crooked Bar Over Bench Curls";
        super.setReferenceScore(5*13*10);
    }
    public CrookedBarCurls(String comment) {
        super("Crooked Bar Over Bench Curls",comment);
        super.setReferenceScore(5*13*10);
    }

    @Override
    public double exerciseScore(){
        return this.exerciseScore(false);
    }

    public double exerciseScore(Boolean setScore){
        final Double[] score = {0.0};
        super.getExerciseSets().forEach( dat ->  { score[0] += (80-dat[0])*dat[1];});
        if(setScore) {
            super.setScore(score[0]);
        }
        return score[0];
    }
}