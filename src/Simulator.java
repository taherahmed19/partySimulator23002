/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Random;
import java.awt.Color;
//import java.util.ArrayList;

/**
 *
 * @author mary-
 */
public class Simulator {

    private Random random;
    private Field room;
    private Host host;
    private Artist artist;
    private Scientist scientist;
    private Engineer engineer;
    private SimulatorView view;

    public Simulator(int fieldDepth, int fieldWidth) {
        random = new Random();
        room = new Field(fieldDepth, fieldWidth);
        view = new SimulatorView(50, 50);
        this.host = new Host();
        this.artist = new Artist();
        this.scientist = new Scientist();
        this.engineer = new Engineer();
        setColors();
        populateRoom();
        view.showStatus(1, room);
    }

    public void setColors() {
        view.setColor(Host.class, Color.BLACK);
        view.setColor(Artist.class, Color.blue);
        view.setColor(Scientist.class, Color.red);
        view.setColor(Engineer.class, Color.green);
    }

    public void populateRoom() {
        room.clear();
        room.place(host, 40, 40);
        room.place(artist, 10, 10);
        room.place(scientist, 20, 20);
        room.place(engineer, 30, 30);
        for (int i = 0; i < room.getDepth(); i++) {
            for (int j = 0; j < room.getWidth(); j++) {
                if ((random.nextInt(20)) == 1) {
                    room.place(host, i, j);
                }
                if ((random.nextInt(20)) == 2) {
                    room.place(artist, i, j);
                }
                if ((random.nextInt(20)) == 3) {
                    room.place(scientist, i, j);
                }
                if ((random.nextInt(20)) == 4) {
                    room.place(engineer, i, j);

                }
            }

        }
    }

    public static void main(String args[]) {
        new Simulator(100, 100);
    }

}
