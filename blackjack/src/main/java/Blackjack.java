public class Blackjack {

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
                return "S";
            } else {
                return "W";
            }
        } else {
            return "P";
        }
    }

    public String smallHand(int handScore, int dealerScore) {
        if (handScore >= 17) {
            return "S";
        } else if (handScore <= 11) {
            return "H";
        } else {
            if (dealerScore < 7) {
                return "S";
            } else {
                return "H";
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
