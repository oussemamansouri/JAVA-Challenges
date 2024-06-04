import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        try {
            String input = "Le chat est sur le toit. Le toit est rouge.";
            Map<String, Integer> occurrences = compterOccurrencesMots(input);
            System.out.println("Sortie : " + occurrences);
        } catch (IllegalArgumentException e) {
            System.out.println("Erreur : " + e.getMessage());
        }
    }

    public static Map<String, Integer> compterOccurrencesMots(String input) {
        if (input == null || input.isEmpty()) {
            throw new IllegalArgumentException("La chaîne d'entrée ne peut pas être nulle ou vide.");
        }

        input = input.toLowerCase();

        Map<String, Integer> occurrences = new HashMap<>();

        String[] mots = input.split("\\s+");

        for (String mot : mots) {
            mot = mot.replaceAll("[^a-zA-Z]", "");

            if (!mot.isEmpty()) {
                if (occurrences.containsKey(mot)) {
                    occurrences.put(mot, occurrences.get(mot) + 1);
                } else {
                    occurrences.put(mot, 1);
                }
            }
        }

        return occurrences;
    }
}
