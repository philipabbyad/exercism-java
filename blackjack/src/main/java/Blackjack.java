public class Blackjack {

    private static final String STAND = "S";
    private static final String HIT = "H";
    private static final String SPLIT = "P";
    private static final String WIN = "W";

    public int parseCard(String card) {
        int cardValue = 0;
        switch (card.toLowerCase()) {
            case "ace":
                cardValue = 11;
                break;
            case "two":
                cardValue = 2;
                break;
            case "three":
                cardValue = 3;
                break;
            case "four":
                cardValue = 4;
                break;
            case "five":
                cardValue = 5;
                break;
            case "six":
                cardValue = 6;
                break;
            case "seven":
                cardValue = 7;
                break;
            case "eight":
                cardValue = 8;
                break;
            case "nine":
                cardValue = 9;
                break;
            case "ten":
            case "jack":
            case "queen":
            case "king":
                cardValue = 10;
                break;
            default:
                break;
        }
        return cardValue;
    }

    public boolean isBlackjack(String card1, String card2) {
        return (this.parseCard(card1) + this.parseCard(card2) == 21);
    }

    public String largeHand(boolean isBlackjack, int dealerScore) {
        if (isBlackjack) {
            if (dealerScore == 10 || dealerScore == 11) {
                return STAND;
            } else {
                return WIN;
            }
        } else {
            return SPLIT;
        }
    }

    public String smallHand(int handScore, int dealerScore) {
        if (handScore >= 17) {
            return STAND;
        } else if (handScore <= 11) {
            return HIT;
        } else {
            if (dealerScore < 7) {
                return STAND;
            } else {
                return HIT;
            }
        }
    }

    // FirstTurn returns the semi-optimal decision for the first turn, given the cards of the player and the dealer.
    // This function is already implemented and does not need to be edited. It pulls the other functions together in a
    // complete decision tree for the first turn.
    public String firstTurn(String card1, String card2, String dealerCard) {
        int handScore = parseCard(card1) + parseCard(card2);
        int dealerScore = parseCard(dealerCard);

        if (20 < handScore) {
            return largeHand(isBlackjack(card1, card2), dealerScore);
        } else {
            return smallHand(handScore, dealerScore);
        }
    }
}
