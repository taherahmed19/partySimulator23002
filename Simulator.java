/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.Color;
import java.util.ArrayList;
//import java.util.ArrayList;
/**
 *
 * @author mary-
 */
public class Simulator {
    private ArrayList<Artist> artists;
    private ArrayList<Host> hosts;
    private ArrayList<Scientist> scientists;
    private ArrayList<Engineer> engineers; 
    private Field party;
    private Host host;
    private Artist artist;
    private Scientist scientist; 
    private Engineer engineer; 
    private SimulatorView view; 
    
    
 public Simulator(int fieldwidth, int fielddepth ) {
     artists= new ArrayList<Artist>();
     hosts = new ArrayList<Host>();
     scientists = new ArrayList<Scientist>();
     engineers= new ArrayList<Engineer>();
     party = new Field (fieldwidth,fielddepth);
     view = new SimulatorView(fieldwidth,fielddepth);
     this.host= new Host(); 
     this.artist = new Artist();
     this.scientist = new Scientist();
     this.engineer = new Engineer();
     view.setColor(Host.class, Color.yellow);
     view.setColor(Artist.class, Color.blue);
     view.setColor(Scientist.class, Color.red);
     view.setColor(Engineer.class, Color.green);
     party.place(host,40,40);
     party.place(artist,10,10);
     party.place(scientist,20,20);
     party.place(engineer,30,30);
     view.showStatus(1 , party); 
 }
 public void populate (Engineer engineer, Host host, Artist artist, Scientist scientist, Location location){
	{
		Field.place[location.getRow()][location.getCol()] = engineer;
                Field.place[location.getRow()][location.getCol()] = host;
                Field.place[location.getRow()][location.getCol()] = artist;
                Field.place[location.getRow()][location.getCol()] = scientist;
	}
 }
 public void place(Person person, int row, int col)
	{
		place(person, new Location(row, col));
	}
    
 public void startSimulation (){
     
 
 }
 
        
        
public static void main (String args[]){
         new Simulator();
     }
     
     
      }

 
 
  
 
