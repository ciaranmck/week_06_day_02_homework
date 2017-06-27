import java.util.HashMap;
import java.util.Scanner;
import java.util.ArrayList;

public class Photographer{

  private String name;
  private ArrayList cameras;

  public Photographer(String name) {
    this.name = name;
    this.cameras = new ArrayList();
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

}