public class FootballMatchReports {    
    
    public static String onField(int shirtNum) {
        String playerPosition = "";

        switch (shirtNum) {
            case 1:
                playerPosition = "goalie";
                break;
            case 2:
                playerPosition = "left back";
                break;
            case 3:
            case 4:
                playerPosition = "center back";
                break;
            case 5:
                playerPosition = "right back";
                break;
            case 6:
            case 7:
            case 8:
                playerPosition = "midfielder";
                break;
            case 9:
                playerPosition = "left wing";
                break;
            case 10:
                playerPosition = "striker";
                break;
            case 11:
                playerPosition = "right wing";
                break;
            default:
                throw new IllegalArgumentException();
        }

           
        return playerPosition;
    }
}
