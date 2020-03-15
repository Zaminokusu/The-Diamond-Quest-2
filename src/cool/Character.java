package cool;

import java.awt.*;

public class Character {

    private String name;
    private int hp, att, attS;
    private boolean jump;
    public int x, y;

    public Character() {
        this.name = "Naexys";
        this.hp = 50;
        this.att = 10;
        this.jump = false;
        this.attS = 1;
    }

    public void loop() {
        if (x + 32 >= TDQ.WIDTH || x <= 0)
            x = TDQ.WIDTH / 2;
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

    public boolean getJump () {
        return this.jump;
    }

    public int getAttS () {
        return this.attS;
    }

}