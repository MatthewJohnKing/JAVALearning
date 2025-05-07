package WorkoutLog;

public class DBCurls extends Exercise{
    public DBCurls() {
        super();
        super.name="Dumbbell Curls";
    }
    public DBCurls(String comment) {
        super("Dumbbell Curls",comment);
    }

    @Override
    int exerciseScore(){
        final int[] score = {0};
        super.getExerciseSets().forEach( dat ->  { score[0] += dat[0]*dat[1]*2;});
        return score[0];
    }
}
