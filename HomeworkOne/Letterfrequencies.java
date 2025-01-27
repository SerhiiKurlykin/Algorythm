package org.telran.homework.HomeworkOne;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Letterfrequencies {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Please enter a string: ");
        String s = scanner.nextLine();


        s = s.toLowerCase();


        Map<Character, Integer> frequencyMap = new TreeMap<>();


        for (char ch : s.toCharArray()) {
            if (Character.isLetter(ch)) {
                frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
            }
        }


        System.out.println("Letter frequencies:");
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            char letter = entry.getKey();
            int frequency = entry.getValue();
            int letterNumber = letter - 'a';
            System.out.println("Letter: " + letter + " (Number: " + letterNumber + ") - Frequency: " + frequency);
        }

        
        System.out.print("\nEnter a letter number (0-25) to convert back to a letter: ");
        int number = scanner.nextInt();
        if (number >= 0 && number < 26) {
            char convertedLetter = (char) (number + 'a');
            System.out.println("Letter by number " + number + ": " + convertedLetter);
        } else {
            System.out.println("Invalid number! Please enter a value between 0 and 25.");
        }

        scanner.close();
    }
}
