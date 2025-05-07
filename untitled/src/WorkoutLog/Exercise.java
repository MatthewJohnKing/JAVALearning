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

    void addSet(int setNumber, int weightKg, int reps){
        // adds a set to the exercise, throws an error if set is already defined
        // suggests a method correctSet(int int int) to do that.
        // This should be usable without changes by any exercise.
    }

    void addSet( int weightKg, int reps){
        // adds a set to the exercise, that is always the next set.
    }

    int exerciseScore(){
        return 0;
        // needs to be implemented
    }


}
