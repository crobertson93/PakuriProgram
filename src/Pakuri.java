public class Pakuri {
    String species;
    int attack;
    int defense;
    int speed;

    public Pakuri(String species)                                         //creates Pakuri object and initializes stats
    {
        this.species = species;
        this.attack = (species.length() * 7) + 9;
        this.defense = (species.length() * 5) + 17;
        this.speed = (species.length() * 6) + 13;
    }

    public String getSpecies()                                              //returns Pakuri species
    {
        return species;
    }
    //Returns the species of this critter


    public int getAttack()                                                  //returns Pakuri attack
    {
        return attack;
    }
    //Returns the attack value for this critter


    public int getDefense()                                                 //returns Pakuri defense
    {
        return defense;
    }
    //Returns the defense value for this critter


    public int getSpeed()                                                   //returns Pakuri speed
    {
        return speed;
    }
    //Returns the speed of this critter


    public void setAttack(int newAttack)                                    //sets new attack for Pakuri
    {
        this.attack = newAttack;
    }
    //Changes the attack value for this critter to newAttack


    public void evolve()                                                    //evolves the Pakuri, increasing stats
    {
        this.attack = attack * 2;
        this.defense = defense * 4;
        this.speed = speed * 3;
    }
    //Will evolve the critter as follows: a) double the attack; b) quadruple the defense; and c) triple the speed

}
