import java.util.HashMap;
import java.util.Scanner;
import java.util.ArrayList;

public class Photographer{

  private String name;
  private ArrayList<Printable> cameras;

  public Photographer(String name) {
    this.name = name;
    this.cameras = new ArrayList<Printable>();
  }

  public String getName() {
    return this.name;
  }

  public int cameraCount(){
    return this.cameras.size();
  }

  public void addCamera(Camera camera) {
    this.cameras.add(camera);
  }

  public void removeCamera(){
      this.cameras.remove(0);
  }

  // Give the Photographer the ablity to print out all the details of her camera collection. The class should have a method that returns a String of all the camera details.

  // public void details(Printable equipment){ 
  //   details = this.cameras.add(equipment);
  //       return details; 
  // }


























}