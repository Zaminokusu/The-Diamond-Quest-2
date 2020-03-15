package cool;

import java.awt.*;

public class Character {

    private String name;
    private int hp, att, jump, attS;
    public int x, y;

    public Character(int hp, int att, int jump, int attS) {
        this.name = "Naexys";
        this.hp = hp;
        this.att = att;
        this.jump = jump;
        this.attS = attS;
    }

    public void loop() {
        x+=1;
    }

    public void draw(Graphics g) {
        g.setColor(Color.ORANGE);
        g.fillRect(x, y, 32, 32);
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