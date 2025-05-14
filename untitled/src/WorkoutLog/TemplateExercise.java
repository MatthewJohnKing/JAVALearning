package WorkoutLog;

import static java.lang.Math.sqrt;

public class TemplateExercise  extends Exercise{
    public TemplateExercise() {
        super();
        super.name="This is not an exercise!";
        super.setReferenceScore(1);
    }
    public TemplateExercise(String comment) {
        super("This is not an exercise!",comment);
        super.setReferenceScore(1);
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
