public class main {
    public static void main(String[] args){
        //instance
        MobileLegend player1 = new MobileLegend();
        MobileLegend player2 = new MobileLegend();

        player1.Username = "Badang";
        player1.score = 10;
        player1.length = 1.5;

        player2.Username = "franco";
        player2.score = 12;
        player2.length = 1.4;

        player1.attackotherleaders();

        System.out.println(player1.score);
        player1.defendfromthreats(player2);
        System.out.println(player1.score);



    }
}
