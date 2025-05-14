package WorkoutLog;

public class DBCurls extends Exercise{
    public DBCurls() {
        super();
        super.name="Dumbbell Curls";
        super.setReferenceScore(2*5*10*10);
    }
    public DBCurls(String comment) {
        super("Dumbbell Curls",comment);
        super.setReferenceScore(2*5*10*10);
    }

    @Override
    public double exerciseScore(){
        return this.exerciseScore(false);
    }

    public double exerciseScore(Boolean setScore){
        final Double[] score = {0.0};
        super.getExerciseSets().forEach( dat ->  { score[0] += dat[0]*dat[1]*2;});
        if(setScore) {
            super.setScore(score[0]);
        }
        return score[0];
    }
}

