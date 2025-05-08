package WorkoutLog;

public class GenerateWorkout {

    public static void main(String[] args) {

        Workout Workout1 = new Workout();
        Workout1.setDate("06-05-2025");

        Exercise Exercise1 = new DBCurls("Not a real exercise record");
        Exercise1.addSet( 8 , 15 );
        Exercise1.addSet( 10 , 12 );
        Exercise1.addSet( 12 , 8 );
        Exercise1.addSet( 12 , 6 );
        Exercise1.addSet( 12 , 6 );
        Exercise1.setSet(8, 12 , 6 );
        Exercise1.setSet(6, 14 , 2 );

        Exercise Exercise2 = new HalfDBCurls("Not a real exercise record");
        Exercise2.addSet( 10 , 13 );
        Exercise2.addSet( 12 , 10 );
        Exercise2.addSet( 14 , 7 );
        Exercise2.addSet( 16 , 5 );
        Exercise2.addSet( 14 , 5 );
        Exercise2.addSet( 14 , 6 );

        //Exercise1.removeSet(3);
        Exercise1.printSets();

        Workout1.addExercise(Exercise1);
        Workout1.addExercise(Exercise2);
        Workout1.printExercises();

        Workout1.printScore();

    }

}
