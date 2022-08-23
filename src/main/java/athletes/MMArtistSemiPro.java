package athletes;

import Interfaces.ILearn;

public class MMArtistSemiPro extends MMArtist implements ILearn {

    public MMArtistSemiPro (String name,boolean fit, int record){

        super(name,fit, record);
    }
    public String talkToCoach() {return "I got KOd AGAIN coach";}

    public String learn (int timeLearning){
        return String.format("%s learnt for %s hours", this.name, timeLearning);
    }




}
