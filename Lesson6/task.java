package Lesson6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class task {
    public static void main(String[] args) {
        HashMap<String, HashSet<String>> phoneBook = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter 'Exit' to end the program.");
            System.out.println("Enter the name of the contact: ");
            String name = scanner.nextLine();

            if (name.equalsIgnoreCase("Exit")) {
                break;
            }

            System.out.println("Enter your phone number: ");
            String phoneNumber = scanner.nextLine();

            if (phoneBook.containsKey(name)) {
                HashSet<String> phoneNumbers = phoneBook.get(name);
                phoneNumbers.add(phoneNumber);
                phoneBook.put(name, phoneNumbers);
            } else {
                HashSet<String> phoneNumbers = new HashSet<>();
                phoneNumbers.add(phoneNumber);
                phoneBook.put(name, phoneNumbers);
            }

            List<Map.Entry<String, HashSet<String>>> sortedEntries = new ArrayList<>(phoneBook.entrySet());
            sortedEntries.sort((entry1, entry2) -> entry2.getValue().size() - entry1.getValue().size());

            for (Map.Entry<String, HashSet<String>> entry : sortedEntries) {
                name = entry.getKey();
                HashSet<String> phoneNumbers = entry.getValue();

                System.out.println(name + ": " + phoneNumbers);
            }
        }
    }
}
