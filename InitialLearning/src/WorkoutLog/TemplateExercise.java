package WorkoutLog;

import static java.lang.Math.sqrt;

public class TemplateExercise  extends Exercise{

    // The template Exercise class is designed to be updated with the specific values for the workout.
    // When constructing an exercise subclass first change the name of the constructors and the class itself.

    // Change the name in both constructors and the ReferenceScore(Number) so that it is accurate.

    public TemplateExercise() {
        super();
        super.name="This is not an exercise!";
        super.setReferenceScore(1);
    }
    public TemplateExercise(String comment) {
        super("This is not an exercise!",comment);
        super.setReferenceScore(1);
    }

    // Does not need changing
    @Override
    public double exerciseScore(){
        return this.exerciseScore(false);
    }

    // Select correct form for the calculation of the score of the workout. Or add your own :-)
    @Override
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
