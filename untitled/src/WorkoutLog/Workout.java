package WorkoutLog;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

public class Workout {
    /*
    The workout class will contain;
    Date of workout
    Exercises performed

    And methods to retrieve
    A score for the workout

    Exercise will be a disjoint Class
    Exercises will be a list of the Exercise Class

    The Exercise Class will have subclasses for each exercise which produces
        a score for the specific exercise. Stored will be;
         the set number, the reps and the weights. There will also be
         an optional comment section.
     */
    protected String date;
    protected List<Exercise> exercises = new ArrayList<>();

    public Workout(String date) {
        this.date = date;
    }
    public Workout() {

    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public List<Exercise> getExercises() {
        return exercises;
    }

    public void setExercises(List<Exercise> exercises) {
        this.exercises = exercises;
    }

    public void addExercise(Exercise input1){
        this.exercises.add(input1);
    }

    public double totalScore(){
        Double[] number= {0.0};
        this.exercises.forEach( v ->{
            double w = v.exerciseScore();
            number[0] += w/v.exerciseReferenceScore();});
        return number[0]/this.exercises.size()-1;
    }

    public void printExercises(){
        final int[] number = {0};
        this.exercises.forEach( v -> {
            number[0] +=1;
            System.out.println("Exercise " + number[0] + ": ");
            v.printSets(); });
        System.out.println("Total Workout Score : " + this.totalScore());
        if(this.totalScore()<0) {
            System.out.println("A negative score just means you didn't reach the averages for the workout you did.");
            System.out.println("Some days you are just weaker than others. Don't worry.");
            System.out.println("Go get some food, a good sleep and maybe take a rest day.");
        }
        else if(this.totalScore()==0){
            System.out.println("Wow! exactly average! Push yourself harder next time!");
        }
        else if(this.totalScore()>2){
            System.out.println("You smashed the averages. Like by double! Consider resetting them higher.");
        }
        else {
            System.out.println("Great job today, you beat the averages. Lets keep this up tomorrow!");
        }
    }

    public void printScore(){
        double number = this.totalScore();
        System.out.println("Total Workout Score : " + number);
        if(number<0) {
            System.out.println("    A negative score just means you didn't reach the averages for the workout you did.");
            System.out.println("    Some days you are just weaker than others. Don't worry.");
            System.out.println("    Go get some food, a good sleep and maybe take a rest day.");
        }
        else if(number==0){
            System.out.println("    Wow! exactly average! Push yourself harder next time!");
        }
        else if(number>2){
            System.out.println("    You smashed the averages. Like by double! Consider resetting them higher.");
        }
        else {
            System.out.println("    Great job today, you beat the averages. Lets keep this up tomorrow!");
        }
    }

}
