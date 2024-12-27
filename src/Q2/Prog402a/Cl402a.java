package Q2.Prog402a;

public class Cl402a {
    private int myID;
    private int myScore;

    public Cl402a(int ID, int Score) {
        myScore = Score;
        myID = ID;
    }

    public String toString() {
        return myID + "\t\t" + myScore;
    }
}


