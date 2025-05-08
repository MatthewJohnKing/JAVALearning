package WorkoutLog;

import static java.lang.Math.sqrt;

public class TemplateExercise  extends Exercise{
    public TemplateExercise() {
        super();
        super.name="This is not an exercise!";
    }
    public TemplateExercise(String comment) {
        super("This is not an exercise!",comment);
    }

    @Override
    public double exerciseScore(){
        final Double[] score = {0.0};
        // super.getExerciseSets().forEach( dat ->  { score[0] += dat[0]*dat[1];});
        // super.getExerciseSets().forEach( dat ->  { score[0] += 2*dat[0]*dat[1];});
        super.getExerciseSets().forEach( dat ->  { score[0] += 2*sqrt(2)*dat[0]*dat[1];});
        return score[0];
    }

    @Override
    public double exerciseReferenceScore() {
        // return 5*12*12;
        // return 2*5*12*12;
        // return 2*sqrt(2)*5*12*12;
        return 1;
    }
}
