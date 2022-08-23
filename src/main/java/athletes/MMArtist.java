package athletes;

public class MMArtist extends Athlete{

        public int record;

    public MMArtist (String name, boolean fit, int record){
        super(name, fit);
        this.record= record;

    }

    public String throwPunch() {return "i threw a punch";}
}
