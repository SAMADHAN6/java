class animal{
    private String sound;
    private int numleg;
    private String nature ;
//defualt
    animal(){
        this.sound = "don't know";
        this.numleg = 0;
        this.nature = "don't know";

    }
    //parameter
    animal(String s, int n , String na){
        this.sound = s;
        this.numleg = n;
        this.nature = na;

    }


    //copy
    animal(animal other){
        this.sound = other.sound;
        this.numleg = other.numleg;
        this.nature = other.nature;

    }

    void makesound() {
       System.out.println("Animal Details:");
        System.out.println("Sound: " + this.sound);
        System.out.println("Number of Legs: " + this.numleg);
        System.out.println("Nature: " + this.nature);

    }

    
}