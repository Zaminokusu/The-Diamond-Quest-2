package cool;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferStrategy;

public class TDQ extends Canvas implements Runnable {

    public static final int WIDTH = 640, HEIGHT = 480;

    private Thread thread;
    private boolean running = false;
    private Character naexys;


    public TDQ() {
        JFrame frame = new JFrame("The Diamond Quest II");

        Dimension d = new Dimension(WIDTH, HEIGHT);
        frame.setPreferredSize(d);
        frame.setMaximumSize(d);
        frame.setMinimumSize(d);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.add(this);
        frame.setVisible(true);
        start();
    }

    public synchronized void start() {
        naexys = new Character();
        thread = new Thread(this);
        thread.start();
        running = true;
    }

    public synchronized void stop() {
        try {
            thread.join();
            running = false;
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public void loop() {
        naexys.loop();
    }

    public void draw() {
        BufferStrategy bs = this.getBufferStrategy();

        if(bs == null) {
            this.createBufferStrategy(3);
            return;
        }

        Graphics g = bs.getDrawGraphics();

        g.setColor(Color.BLACK);
        g.fillRect(0, 0, WIDTH, HEIGHT);
        naexys.draw(g);
        Lvl1.draw(g);

        g.dispose();
        bs.show();
    }

    public void run() {
        long lastTime = System.nanoTime();
        double amountOfTicks = 60.0;
        double ns = Math.pow(10, 9) / amountOfTicks;
        double delta = 0;
        long timer = System.currentTimeMillis();
        int frames = 0;

        while(running) {
            long now = System.nanoTime();
            delta += (now - lastTime) / ns;
            lastTime = now;

            while(delta >= 1) {
                loop();
                delta--;
            }

            if(running) draw();
            frames++;

            if(System.currentTimeMillis() - timer > 1000) {
                timer += 1000;
                System.out.println("FPS: " + frames);
                frames = 0;
            }
        }

        stop();
    }

    public static void main(String[] args) { new TDQ();}
}
