package WorkoutLog;

public class DBChestPress  extends Exercise{
    public DBChestPress() {
        super();
        super.name="Dumbbell Chest Press";
        super.setReferenceScore(2*5*12*12);
    }
    public DBChestPress(String comment) {
        super("Dumbbell Chest Press",comment);
        super.setReferenceScore(2*5*12*12);
    }

    @Override
    public double exerciseScore(){
        return this.exerciseScore(false);
    }

    public double exerciseScore(Boolean setScore) {
        final Double[] score = {0.0};
        // super.getExerciseSets().forEach( dat ->  { score[0] += dat[0]*dat[1];});
        super.getExerciseSets().forEach(dat -> {
            score[0] += 2 * dat[0] * dat[1];
        });
        // super.getExerciseSets().forEach( dat ->  { score[0] += 2*sqrt(2)*dat[0]*dat[1];});
        if (setScore) {
            super.setScore(score[0]);
        }
        return score[0];
    }
}

