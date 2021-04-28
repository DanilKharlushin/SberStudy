package com;


import java.util.*;

public class Balda {

    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        String word = "abracadabra";
        int currentPlayer = 1;

        List<String> history = new ArrayList<>();
        HashSet<Character> litSet = new HashSet<>();

        for (char i : word.toCharArray()) {
            litSet.add(i);
        }

        System.out.println("Ходит игрок #" + currentPlayer);
        String str = scanner.nextLine();
        while (!str.isBlank()) {
            if (wordCheck(str, litSet)) {
                if (!history.contains(str)) {
                    history.add(str);
                    System.out.println("Слово " + str + " принято");
                    currentPlayer = turn(currentPlayer);
                    System.out.println("Ходит игрок #" + currentPlayer);
                    str = scanner.nextLine();
                } else {
                    System.out.println("Слово " + str + " уже было");
                    str = scanner.nextLine();
                }
            } else {
                System.out.println("Слово " + str + " составлено неверно");
                str = scanner.nextLine();
            }

        }

        System.out.println("Слова, составленные первым игроком:");
        for (int i = 0; i < history.size(); i += 2) {
            System.out.println(history.get(i));
        }

        System.out.println("Слова, составленные вторым игроком:");
        for (int i = 1; i < history.size(); i += 2) {
            System.out.println(history.get(i));
        }

    }

    public static boolean wordCheck(String word, HashSet<Character> letters) {
        for (int i = 0; i < word.length(); i++) {
            if (!letters.contains(word.charAt(i)))
                return false;
        }

        return true;
    }

    public static int turn(int currentPlayer) {
        if (currentPlayer == 1) {
            return 2;
        } else {
            return 1;
        }
    }

}
