package WorkoutLog;

import java.util.*;

public class Exercise {
    protected String name;
    // An identifier for each workout, for reference only.
    protected List<Integer[]> exerciseSets;
    // List of the worout sets, given by weight and reps
    protected String comment;
    // A reference comment that is not currently used other than for reference.
    protected double score=0;
    // Workout score, for exercises will be set based on reps and weight
    protected double referenceScore=1;
    // A reference score to compare against.

    // constructor giving the name and the comment
    public Exercise(String name,String comment) {
        this.comment = comment;
        this.name = name;
        this.exerciseSets = new ArrayList<Integer[]>();
    }
    // constructor with comment
    public Exercise(String comment) {
        this.comment = comment;
        this.exerciseSets = new ArrayList<Integer[]>();
    }
    // default constructor
    public Exercise() {
        this.exerciseSets = new ArrayList<Integer[]>();
    }

    // Getter and Setter methods
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
    public double getScore() {return score;    }
    public void setScore(double score) {this.score = score;}
    public double getReferenceScore() {return referenceScore;}
    public void setReferenceScore(double referenceScore) {this.referenceScore = referenceScore;}

    // Not a typical setter, used to set a specific set number in a list of sets. If there are not enough sets it
    // takes the lower sets to be 0.
    void setSet(int setNumber, int weightKg, int reps){
        Integer[] input={weightKg, reps};
        while(this.exerciseSets.size()<setNumber){
            this.addSet(0,0);
        }
        this.exerciseSets.set(setNumber-1, input );
    }

    // Adds a set to the set list at the end of the current list.
    void addSet( int weightKg, int reps){
        Integer[] input={weightKg, reps};
        this.exerciseSets.add( input );
    }

    // To be overwritten, produces the exercise score. Sets the score if the Boolean input is given as true.
    double exerciseScore(Boolean state){
        this.setScore(0.0);
        if(state){
            this.setScore(0.0);
        }
        return 0.0;
    }

    // As above but always assumes false. To Be overwritten
    double exerciseScore(){
        return 0.0;
    }

    public void printSets(){
        int setnumber= 0;
        System.out.println(this.name);
        for (Integer[] exerciseSet : this.exerciseSets) {
            setnumber+=1;
            System.out.println("    Set" + setnumber + " : = " +exerciseSet[0] + "kgs weight(s) X " + exerciseSet[1] +"reps.");
        }
        System.out.println("    Score:" + this.getScore());
    }


}
