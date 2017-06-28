import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.*;

public class PhotographerTest{
  Photographer photographer;
  Camera camera;
  AnalogCamera analogCamera;
  DigitalCamera digitalCamera;

  @Before
  public void before() {
    photographer = new Photographer("Ciaran");
    camera = new Camera();
    analogCamera = new AnalogCamera();
    digitalCamera = new DigitalCamera();
  }

  @Test
  public void hasName(){
    assertEquals("Ciaran", photographer.getName());
  }

  @Test
  public void testCameraCount(){
    assertEquals(0, photographer.cameraCount());
  }

  @Test
  public void testAddCamera(){
    photographer.addCamera(camera);
    assertEquals(1, photographer.cameraCount());
  }

  @Test
  public void testRemoveCamera(){
    photographer.addCamera(camera);
    photographer.removeCamera();
    assertEquals(0, photographer.cameraCount());
  }

  @Test
  public void testAnalogOutput(){
    assertEquals("Nikon 34T, Noise reduction filter, Hi-resolution", analogCamera.printDetails());
  }

  @Test
  public void testAddAnalog(){
    photographer.addDetails(analogCamera);
    assertEquals(1, photographer.cameraCount());
  }

  @Test
  public void testPrintDetails(){
    photographer.addDetails(analogCamera);
    photographer.addDetails(digitalCamera);
    // Printable info = photographer.removeCamera();
    // Printable info = photographer.removeCamera();
    assertEquals("Nikon 34T, Noise reduction filter, Hi-resolution /n Sony ILCE5100L, No noise reduciton, Lo-resolution /n ", photographer.details() );
  }

  // @Test
  // public void testPrintDetails(){
  //   photographer.()
  //   details = photographer.details;
  //   assertEquals("Nikon 34T, Noise reduction filter, Hi-resolutionSony ILCE5100L, No noise reduciton, Lo-resolution", details );
  // }












}