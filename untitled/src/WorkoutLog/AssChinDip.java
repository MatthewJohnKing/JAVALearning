package WorkoutLog;

import static java.lang.Math.sqrt;

public class AssChinDip extends Exercise{
    public AssChinDip() {
        super();
        super.name="Assisted Chin Dip";
        super.setReferenceScore(5*(80-27)*12);
    }
    public AssChinDip(String comment) {
        super("Assisted Chin Dip",comment);
        super.setReferenceScore(5*(80-27)*12);
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
