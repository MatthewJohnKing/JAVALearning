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
        else if(number>1){
            System.out.println("    You smashed the averages. Like by a lot! Consider resetting them higher.");
        }
        else {
            System.out.println("    Great job today, you beat the averages. Lets keep this up tomorrow!");
        }
    }

    public void printAllExercises(){
        System.out.println("AssChinDip = Assisted Chin Dips");
        System.out.println("AssPullUp = Assisted Pull ups");
        System.out.println("CrookedBarCurls = Crooked Bar Curls over Bench");
        System.out.println("DBChestPress = DumbbellChestPress");
        System.out.println("DBCurls = Dumbbell curls");
        System.out.println("DBLatRaise = Dumbbell Lateral Raises");
        System.out.println("DBShoulderPress = Seated Dumbbell shoulder Press");
        System.out.println("DBShoulderShrugs = Dumbbell Shoulder Shrugs");
        System.out.println("FWRow= Free weight Row");
        System.out.println("HalfDBCurls = Half range dumbbell curls");
        System.out.println("LatPullDownOut = Lateral Pulldown bar outer grip");
        System.out.println("OvrHeadTricDB = Over Head Tricep extension with DB");
        System.out.println("RearDelt = Rear Delt Machine");
        System.out.println("RotatorCuffDB = Rotator Cuff DB Curls");
        System.out.println("SglArmBentRow = Sgl arm bent over Row");
        System.out.println("SglArmCabRaise = Single Arm cable raises");
        System.out.println("WristCurls = Weighted Wrist Curls");
        System.out.println("XBodyDBCurls = Cross Body Dumbbell Curls");
    }

}
