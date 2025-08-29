package classandobjects;

public class variable_and_scope {
    public class Athlete {

        public String athleteName;  //instance variable;
        public double athleteSpeed;//instance variable
        public int athleteAge;//instance variable

        public Athlete(String name, double speed, int age) {
            this.athleteName = name;   //from now all are Local variable;
            this.athleteSpeed = speed;
            this.athleteAge = age;
        }

        public void athlieteRun() {
            int speed = 100;
            System.out.println("Athlete runs at" + speed + "km/hr");
        }
    }
}
//variable scopoe