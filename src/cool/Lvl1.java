package cool;

import java.awt.*;

public class Lvl1 {

    public static void draw(Graphics g) {
        g.setColor(Color.WHITE);
        g.drawLine(0, 124, 107, 124);
        g.drawLine(0, 124 * 2, 107, 124 * 2);
        g.drawLine(107, 124, 107, 24);
        g.drawLine( 107, 124 * 2, 107, 400);
        g.drawLine(107, 400,  400, 400 );
        g.drawLine( 107, 24, TDQ.WIDTH, 24);
        g.drawLine(400, 400, 400, 300);
        g.drawLine(400, 300, 500, 250);
        g.drawLine(500, 250, 680, 250);

    }
}
