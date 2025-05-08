package WorkoutLog;


public class GenerateWorkout {

    public static void main(String[] args) {

        Workout workout1 = new Workout();
        workout1.setDate("06-05-2025");

        workout1.printAllExercises();

        Exercise exercise1 = new DBCurls("This is now a real Exercise");
        exercise1.addSet( 8 , 15 );
        exercise1.addSet( 10 , 10 );
        exercise1.addSet( 12 , 5 );
        exercise1.addSet( 12 , 6 );
        exercise1.addSet( 12 , 6 );

        Exercise exercise2 = new HalfDBCurls("This is a real exercise record");
        exercise2.addSet( 10 , 13 );
        exercise2.addSet( 12 , 10 );
        exercise2.setSet( 6,14 , 6 );
        exercise2.setSet( 3,14 , 7 );
        exercise2.setSet( 4,16 , 5 );
        exercise2.setSet( 5,14 , 5 );


        Exercise exercise3 = new AssChinDip();
        exercise3.addSet( lbsToKg(70) , 20 );
        exercise3.addSet( lbsToKg(60) , 16 );
        exercise3.addSet( lbsToKg(50) , 12);
        exercise3.addSet( lbsToKg(40) , 11 );
        exercise3.addSet( lbsToKg(30) , 7 );
        exercise3.addSet( lbsToKg(30) , 7 );

        Exercise exercise4 = new XBodyDBCurls();
        exercise4.addSet( 6 , 15 );
        exercise4.addSet( 8 , 14 );
        exercise4.addSet( 10 , 9 );
        exercise4.addSet( 12 , 7 );
        exercise4.addSet( 12 , 5 );
        exercise4.addSet( 12 , 5 );

        Exercise exercise5 = new WristCurls();
        exercise5.addSet( 4 , 20 );
        exercise5.addSet( 6 , 20 );
        exercise5.addSet( 8 , 19 );
        exercise5.addSet( 10 , 13 );
        exercise5.addSet( 10 , 11 );
        exercise5.addSet( 12 , 8 );

        Exercise exercise6 = new CrookedBarCurls();
        exercise6.addSet( 10 , 15 );
        exercise6.addSet( 15, 9 );
        exercise6.addSet( 15 ,8 );
        exercise6.addSet( 20 , 3 );
        exercise6.addSet( 15 , 7 );

        //exercise1.removeSet(3); //Need to Implement
        //exercise1.printSets();

        workout1.addExercise(exercise1);
        workout1.addExercise(exercise2);
        workout1.addExercise(exercise3);
        workout1.addExercise(exercise4);
        workout1.addExercise(exercise5);
        workout1.addExercise(exercise6);
        workout1.printExercises();

        // workout1.remove(exercise2); //Need to Implement

        workout1.printScore();

    }

    public static int lbsToKg(int lbs){
        return (int) Math.round(lbs/2.205);
    }
    public static int lbsToKg(double lbs){
        return (int) Math.round(lbs/2.205);
    }

}
