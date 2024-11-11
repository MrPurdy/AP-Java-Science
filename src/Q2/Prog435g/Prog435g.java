package Q2.Prog435g;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog435g {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("Langdat/prog435g.dat"));
            int[] scores = new int[100];
            int count = 0;

            while (file.hasNext()) {
                int score = file.nextInt();
                scores[count] = score;
                count++;
            }

            // Sort the scores (bubble sort)
            for         (int j = 0; j < count; j++ ) {
                for     (int k = 0; k < count-1; k++) {
                    if  (scores[k] > scores[k+1]) {
                        int temp  =  scores[k];
                        scores[k] = scores[k+1];
                        scores[k] = temp;
                    }
                }
            }

            Cl435g[] golfers = new Cl435g[count];
            for (int lcv = 0; lcv < count; lcv++){
                Cl435g cooldude = new Cl435g(scores[lcv]);
                golfers[lcv] = cooldude;
            }

            int rank = 1;
            for (int lcv = 0; lcv < count; lcv++) {
                golfers[lcv].setRank(rank);
                if (lcv < count-1 && scores[lcv] != scores[lcv+1])
                    rank++;
            }

            System.out.println("Score\tRank");
            for (int lcv = 0; lcv < count; lcv++)
                System.out.println(golfers[lcv].toString());

        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}

/*
Score	Rank
74		1
73		2
75		3
72		4
75		5
72		6
75		7
72		8
76		9
71		10
76		11
70		12
77		13
70		14
77		15
70		16
78		17
70		18
80		19
69		20
81		21
68		22
82		23
68		24
86		25
66		26
87		27
90		28
88		29
88		29
88		29
 */
