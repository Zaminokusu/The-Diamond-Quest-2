package cool;

public class Character {

    private String name;
    private int hp;
    private int att;
    private int jump;
    private int attS;

    public Character(int hp, int att, int jump, int attS) {
        this.name = "Naexys";
        this.hp = hp;
        this.att = att;
        this.jump = jump;
        this.attS = attS;
    }

    public void loop() {

    }

    public void draw() {

    }

    public String getName () {
        return this.name;
    }

    public int getHp () {
        return this.hp;
    }

    public int getAtt () {
        return this.att;
    }

    public int getJump () {
        return this.jump;
    }

    public int getAttS () {
        return this.attS;
    }

}