package WorkoutLog;

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
    protected List<Exercise> exercises;

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

    public void removeExercise(String input1){
        this.exercises.indexOf();
        this.exercises.contains(input1);
        // Needs to locate any exercises with that NAME,then remove it.
    }
}
