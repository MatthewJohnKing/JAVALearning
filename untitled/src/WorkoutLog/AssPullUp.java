package WorkoutLog;

import static java.lang.Math.sqrt;

public class AssPullUp extends Exercise{
    public AssPullUp() {
        super();
        super.name="Assisted Pullup";
    }
    public AssPullUp(String comment) {
        super("Assisted Pullup",comment);
    }

    @Override
    public double exerciseScore(){
        final Double[] score = {0.0};
        // super.getExerciseSets().forEach( dat ->  { score[0] += dat[0]*dat[1];});
        // super.getExerciseSets().forEach( dat ->  { score[0] += 2*dat[0]*dat[1];});
        //super.getExerciseSets().forEach( dat ->  { score[0] += 2*sqrt(2)*dat[0]*dat[1];});
        super.getExerciseSets().forEach( dat ->  { score[0] += (80-dat[0])*dat[1];});
        return score[0];
    }

    @Override
    public double exerciseReferenceScore() {
        // return 5*12*12;
        // return 2*5*12*12;
        // return 2*sqrt(2)*5*12*12;
        return 5*(80-31.75)*12;
        // return 1;
    }

    @Override
    public void printSets(){
        int setnumber= 0;
        System.out.println(this.name);
        for (Integer[] exerciseSet : this.exerciseSets) {
            setnumber+=1;
            System.out.println("    Set" + setnumber + " : = 2 X " +(80-exerciseSet[0]) + "kgs X " + exerciseSet[1] +"reps.");
        }
        System.out.println("    Score:" + this.exerciseScore());
        // prints the exercise and its sets with the score.
    }
}

