package WorkoutLog;

import static java.lang.Math.sqrt;

public class AssPullUp extends Exercise{
    public AssPullUp() {
        super();
        super.name="Assisted Pullup";
        super.setReferenceScore(5*(80-31.75)*12);
    }
    public AssPullUp(String comment) {
        super("Assisted Pullup",comment);
        super.setReferenceScore(5*(80-31.75)*12);
    }

    @Override
    public double exerciseScore(){
        return this.exerciseScore(false);
    }

    public double exerciseScore(Boolean setScore){
        final Double[] score = {0.0};
        // super.getExerciseSets().forEach( dat ->  { score[0] += dat[0]*dat[1];});
        // super.getExerciseSets().forEach( dat ->  { score[0] += 2*dat[0]*dat[1];});
        //super.getExerciseSets().forEach( dat ->  { score[0] += 2*sqrt(2)*dat[0]*dat[1];});
        super.getExerciseSets().forEach( dat ->  { score[0] += (80-dat[0])*dat[1];});
        if(setScore) {
            super.setScore(score[0]);
        }
        return score[0];
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

