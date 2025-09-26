import java.util.*;

public class Task07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Set<String>> decks = new HashMap<>();

        Map<String, Integer> sumOfCards = new LinkedHashMap<>();

        String input = scanner.nextLine();

        while(!input.equals("JOKER")){
            String[] names = input.split(": ");

            String name = names[0];

            String[] cardsString = names[1].split(", ");

            Set<String> cards = new LinkedHashSet<>();

            for (int i = 0; i < cardsString.length; i++) {
                cards.add((cardsString[i]));
            }

            if(decks.containsKey(name)){
                for (String e : cards) {
                    decks.get(name).add(e);
                }
                sumOfCards.put(name, 0);
            }

            decks.putIfAbsent(name, cards);


            int sum = 0;

            for (String e : decks.get(name)) {
                switch(e.charAt(e.length() - 1)){
                    case 'S':
                        switch(e.charAt(0)){
                            case 'J':
                                sum += 11*4;
                                break;
                            case 'Q':
                                sum += 12*4;
                                break;
                            case 'K':
                                sum += 13*4;
                                break;
                            case 'A':
                                sum += 14*4;
                                break;
                            case '1':
                                sum += 10*4;
                                break;
                            default:
                                sum += Character.getNumericValue(e.charAt(0)) * 4;
                                break;
                        }
                        break;
                    case 'H':
                        switch(e.charAt(0)){
                            case 'J':
                                sum += 11*3;
                                break;
                            case 'Q':
                                sum += 12*3;
                                break;
                            case 'K':
                                sum += 13*3;
                                break;
                            case 'A':
                                sum += 14*3;
                                break;
                            case '1':
                                sum += 10*3;
                                break;
                            default:
                                sum += Character.getNumericValue(e.charAt(0)) * 3;
                                break;
                        }
                        break;
                    case 'D':
                        switch(e.charAt(0)){
                            case 'J':
                                sum += 11*2;
                                break;
                            case 'Q':
                                sum += 12*2;
                                break;
                            case 'K':
                                sum += 13*2;
                                break;
                            case 'A':
                                sum += 14*2;
                                break;
                            case '1':
                                sum += 10*2;
                                break;
                            default:
                                sum += Character.getNumericValue(e.charAt(0)) * 2;
                                break;
                        }
                        break;
                    case 'C':
                        switch(e.charAt(0)){
                            case 'J':
                                sum += 11*1;
                                break;
                            case 'Q':
                                sum += 12*1;
                                break;
                            case 'K':
                                sum += 13*1;
                                break;
                            case 'A':
                                sum += 14*1;
                                break;
                            case '1':
                                sum += 10;
                                break;
                            default:
                                sum += Character.getNumericValue(e.charAt(0)) * 1;
                                break;
                        }
                        break;
                }
            }

            if(sumOfCards.containsKey(name)){
                sumOfCards.put(name, sumOfCards.get(name) + sum);
            }
            else {
                sumOfCards.put(name, sum);
            }

            input = scanner.nextLine();
        }

        for (Map.Entry<String, Integer> entry : sumOfCards.entrySet()) {
            System.out.printf("%s: %d%n", entry.getKey(), entry.getValue());
        }
    }
}
