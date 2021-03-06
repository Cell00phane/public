/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package one;

import java.util.List;

public class App {

    public static void main(String[] args) {
        // try out your program here
        List<Exercise> exercises = List.of(new Deadlift(200), new Pushup(), new Squat(), new Benchpress(350));

        System.out.println("Bob: \"I only work out with weights ! This is what my workout looks like:\"");
        exercises.forEach(e -> {
            if (e.requiresWeight())
                e.doExercise();
        });

        System.out.println("\n\nAlice: \"I prefer to do both !\"");
        exercises.forEach(Exercise::doExercise);
    }
}
