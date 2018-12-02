package compositions;

public class Treasure {

        protected String name;
        protected int worth;
        //possible extension damage type

    public Treasure(String name, int worth) {
        this.name = name;
        this.worth = worth;
    }

        public String getName() {
        return this.name;
    }

        public int getWorth() {
        return this.worth;
    }



        //type - gem, gold, artifact
    //value -
}
