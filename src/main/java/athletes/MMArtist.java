package athletes;

public class MMArtist extends Athlete{

        public int record;

    public MMArtist (String name, int record){
        super(name);
        this.record= record;

    }

    public String throwPunch() {return "i threw a punch";}
}
