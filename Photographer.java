import java.util.HashMap;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

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

  public void addDetails(Printable details) {
    this.cameras.add(details);
  }

  public String details() {
    String fulldetails = "";
    for ( Printable camera : this.cameras) {
      fulldetails += camera.printDetails() + " /n ";
    }
    return fulldetails;
  }
 
  // possibly missing a step to turn printables back into analog/digital cameras



























}