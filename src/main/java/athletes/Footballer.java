package athletes;

public class Footballer extends Athlete {

    private boolean canWaitToScore;

    public Footballer (String name,boolean fit, boolean canWaitToScore){
        super(name, fit);
        this.canWaitToScore=canWaitToScore;
    }

    @Override
    public String talkToCoach() {return "the football pitch is wet";}

    public String callForBall() {return "pass the ball";}
}
