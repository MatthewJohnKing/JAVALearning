package WorkoutLog;

import java.util.*;

public class Exercise {
    protected String name;
    protected List<Integer[]> exerciseSets;
    protected String comment;
    /*
    Each Exercise needs a name and a map between the set number and the weight
    plus the reps. The comment is option information on the exercise.

    Constructor should be default, and with comment.
     */

    public Exercise(String name,String comment) {
        this.comment = comment;
        this.name = name;
        this.exerciseSets = new ArrayList<Integer[]>();
    }
    public Exercise(String comment) {
        this.comment = comment;
        this.exerciseSets = new ArrayList<Integer[]>();
    }
    public Exercise() {
        this.exerciseSets = new ArrayList<Integer[]>();
    }

    public List<Integer[]> getExerciseSets() {
        return exerciseSets;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public void setExerciseSets(List<Integer[]> exerciseSets) {
        this.exerciseSets = exerciseSets;
    }

    void setSet(int setNumber, int weightKg, int reps){
        Integer[] input={weightKg, reps};
        while(this.exerciseSets.size()<setNumber){
            this.addSet(0,0);
        }
        this.exerciseSets.set(setNumber-1, input );
        // adds a set in the required set location.
    }

    void addSet( int weightKg, int reps){
        Integer[] input={weightKg, reps};
        this.exerciseSets.add( input );
        // adds a set to the exercise, that is always the next set.
    }

    double exerciseScore(){
        return 0.0;
        // needs to be implemented
    }

    double exerciseReferenceScore(){
        return 0;
        // needs to be implemented
    }

    public void printSets(){
        int setnumber= 0;
        System.out.println(this.name);
        for (Integer[] exerciseSet : this.exerciseSets) {
            setnumber+=1;
            System.out.println("    Set" + setnumber + " : = 2 X " +exerciseSet[0] + "kgs X " + exerciseSet[1] +"reps.");
        }
        System.out.println("    Score:" + this.exerciseScore());
        // prints the exercise and its sets with the score.
    }


}
