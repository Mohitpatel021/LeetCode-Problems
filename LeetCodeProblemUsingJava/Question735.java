package LeetCodeProblemUsingJava;

import java.util.Arrays;
//  Question 735 : Asteroid Collision
//  Link :  https://leetcode.com/problems/asteroid-collision/description/

public class Question735 {

    public int[] asteroidCollision(int[] asteroids) {
        int w = -1; // Write pointer simulating a stack

        for (int i = 0; i < asteroids.length; i++) {
            boolean destroyed = false;

            if (asteroids[i] > 0) {
                asteroids[++w] = asteroids[i];
            } else {
                while (w >= 0 && asteroids[w] > 0) {
                    if (asteroids[w] < -asteroids[i]) {
                        w--; // Top of stack explodes
                    } else if (asteroids[w] == -asteroids[i]) {
                        w--; // Both explode
                        destroyed = true;
                        break;
                    } else {
                        destroyed = true; // Current asteroid destroyed
                        break;
                    }
                }

                if (!destroyed) {
                    asteroids[++w] = asteroids[i]; // Survives, push to stack
                }
            }
        }

        return Arrays.copyOfRange(asteroids, 0, w + 1);
    }

}
